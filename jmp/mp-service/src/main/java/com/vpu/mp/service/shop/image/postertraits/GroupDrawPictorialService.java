package com.vpu.mp.service.shop.image.postertraits;

import com.upyun.UpException;
import com.vpu.mp.db.main.tables.records.ShopRecord;
import com.vpu.mp.db.shop.tables.records.GoodsRecord;
import com.vpu.mp.db.shop.tables.records.GroupDrawRecord;
import com.vpu.mp.db.shop.tables.records.PictorialRecord;
import com.vpu.mp.service.foundation.data.BaseConstant;
import com.vpu.mp.service.foundation.data.JsonResultMessage;
import com.vpu.mp.service.foundation.util.ImageUtil;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.config.PictorialShareConfig;
import com.vpu.mp.service.pojo.shop.goods.GoodsConstant;
import com.vpu.mp.service.pojo.shop.goods.goods.GoodsSharePostConfig;
import com.vpu.mp.service.pojo.shop.qrcode.QrCodeTypeEnum;
import com.vpu.mp.service.pojo.wxapp.share.*;
import com.vpu.mp.service.pojo.wxapp.share.group.GroupDrawShareInfoParam;
import com.vpu.mp.service.shop.goods.GoodsService;
import com.vpu.mp.service.shop.image.ImageService;
import com.vpu.mp.service.shop.image.QrCodeService;
import com.vpu.mp.service.shop.market.groupdraw.GroupDrawService;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;

/**
 * 拼团抽将分享图片生成器
 *
 * @author 李晓冰
 * @date 2020年02月03日
 */
@Service
public class GroupDrawPictorialService extends ShareBaseService {
    @Autowired
    private GroupDrawService groupDrawService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private PictorialService pictorialService;
    @Autowired
    private QrCodeService qrCodeService;

    /**
     * 拼团抽奖活动获取分享图片
     *
     * @param param 分享参数
     * @return 分享信息
     */
    public GoodsShareInfo getGroupDrawShareInfo(GroupDrawShareInfoParam param) {
        GoodsShareInfo goodsShareInfo = new GoodsShareInfo();
        GroupDrawRecord groupDrawRecord = groupDrawService.getById(param.getActivityId());
        // 拼团活动信息不可用
        if (groupDrawRecord == null) {
            shareLog(getActivityName(), "拼团抽奖活动信息不可用");
            goodsShareInfo.setShareCode(PictorialConstant.ACTIVITY_DELETED);
            return goodsShareInfo;
        }
        GoodsRecord goodsRecord = goodsService.getGoodsRecordById(param.getTargetId());
        // 拼团商品信息不可用
        if (goodsRecord == null) {
            shareLog(getActivityName(), "拼团抽奖商品信息不可用");
            goodsShareInfo.setShareCode(PictorialConstant.GOODS_DELETED);
            return goodsShareInfo;
        }
        GoodsSharePostConfig goodsShareConfig = Util.parseJson(goodsRecord.getShareConfig(), GoodsSharePostConfig.class);
        PictorialShareConfig  shareConfig= PictorialShareConfig.createFromGoodsShareInfoConfig(goodsShareConfig);
        return parsePictorialShareConfig(shareConfig,groupDrawRecord,goodsRecord,param);
    }

    /**
     * 拼团抽奖分享背景图片地址
     */
    private static final String GROUP_DRAW_BG_IMG = "image/wxapp/group_draw.png";

    @Override
    protected String createShareImage(Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam) {
        GroupDrawRecord groupDrawRecord= (GroupDrawRecord) aRecord;
        GroupDrawShareInfoParam param = (GroupDrawShareInfoParam) baseParam;

        PictorialRecord pictorialRecord = pictorialService.getPictorialDao(goodsRecord.getGoodsId(), param.getActivityId(), PictorialConstant.GROUP_DRAW_ACTION_SHARE, null);
        // 已存在生成的图片
        if (pictorialRecord != null && pictorialService.isGoodsSharePictorialRecordCanUse(pictorialRecord.getRule(), goodsRecord.getUpdateTime(), groupDrawRecord.getUpdateTime())) {
            return pictorialRecord.getPath();
        }

        try (InputStream bgInputStream = Util.loadFile(GROUP_DRAW_BG_IMG)) {

            BufferedImage bgBufferImg = ImageIO.read(bgInputStream);
            BufferedImage goodsBufferImg = ImageIO.read(new URL(imageService.getImgFullUrl(goodsRecord.getGoodsImg())));

            int goodsWidth = 162;
            int toTop = 85;
            int toLeft = 80;

            goodsBufferImg = ImageUtil.resizeImage(goodsWidth, goodsWidth, goodsBufferImg);
            ImageUtil.addTwoImage(bgBufferImg, goodsBufferImg, toTop, toLeft);

            ShopRecord shop = saas.shop.getShopById(getShopId());

            int textStartX = toLeft + goodsWidth + 20;
            //添加拼团抽奖文字
            String msg = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_GROUP_DRAW_SHARE_INFO, "messages");
            ImageUtil.addFontWithRect(bgBufferImg, textStartX, toTop + 20, msg, ImageUtil.SourceHanSansCN(Font.PLAIN, 16), PictorialImgPx.REAL_PRICE_COLOR,PictorialImgPx.SHARE_IMG_RECT_INNER_COLOR,  PictorialImgPx.REAL_PRICE_COLOR);

            //添加真实价格
            String moneyFlag = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_PICTORIAL_MONEY_FLAG, "messages");
            String realPrice = param.getRealPrice().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            ImageUtil.addFont(bgBufferImg, moneyFlag + realPrice, ImageUtil.SourceHanSansCN(Font.PLAIN, 20), textStartX, toTop + 80,  PictorialImgPx.REAL_PRICE_COLOR);
            //添加划线价格
            String linePrice = param.getLinePrice().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
            ImageUtil.addFontWithLine(bgBufferImg, textStartX, toTop + 100, moneyFlag+linePrice, ImageUtil.SourceHanSansCN(Font.PLAIN, 18),PictorialImgPx.LINE_PRICE_COLOR);

            // 上传u盘云并缓存入库
            String relativePath = createFilePath(groupDrawRecord.getId());
            PictorialRule pictorialRule = new PictorialRule(goodsRecord.getUpdateTime(), groupDrawRecord.getUpdateTime());
            pictorialService.uploadToUpanYun(bgBufferImg, relativePath, pictorialRule, goodsRecord.getGoodsId(),param.getActivityId(),PictorialConstant.GROUP_DRAW_ACTION_SHARE, pictorialRecord, param.getUserId());

            return relativePath;
        } catch (IOException e) {
            shareLog(getActivityName(),  "图片生成错误：" + e.getMessage());
        } catch (UpException e) {
            shareLog(getActivityName() , "UpanYun上传错误：" + e.getMessage());
        }
        return null;
    }

    @Override
    protected String createDefaultShareDoc(String lang, Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam) {
        return Util.translateMessage(lang, JsonResultMessage.WX_MA_GROUP_DRAW_SHARE_DOC, "","messages", baseParam.getRealPrice());
    }


    /**
     * 拼团抽奖-海报生成
     *
     * @param param 拼团抽奖海报参数
     * @return 拼团抽奖海报图片base64
     */
    public GoodsPictorialInfo getGroupDrawPictorialInfo(GroupDrawShareInfoParam param) {
        GoodsPictorialInfo goodsPictorialInfo = new GoodsPictorialInfo();
        ShopRecord shop = saas.shop.getShopById(getShopId());
        GroupDrawRecord groupDrawRecord = groupDrawService.getById(param.getActivityId());
        if (groupDrawRecord == null) {
            pictorialLog(getActivityName(), "拼团抽奖信息已删除或失效");
            goodsPictorialInfo.setPictorialCode(PictorialConstant.ACTIVITY_DELETED);
            return goodsPictorialInfo;
        }

        GoodsRecord goodsRecord = goodsService.getGoodsRecordById(param.getTargetId());
        if (goodsRecord == null) {
            pictorialLog(getActivityName(), "商品信息已删除或失效");
            goodsPictorialInfo.setPictorialCode(PictorialConstant.GOODS_DELETED);
            return goodsPictorialInfo;
        }


        GoodsSharePostConfig goodsShareConfig = Util.parseJson(goodsRecord.getShareConfig(), GoodsSharePostConfig.class);
        PictorialShareConfig shareConfig = new PictorialShareConfig();

        shareConfig.setShareImgAction(goodsShareConfig.getShareImgAction());
        shareConfig.setShareImg(goodsShareConfig.getShareImgUrl());
        shareConfig.setShareDoc(goodsShareConfig.getShareDoc());
        shareConfig.setShareAction(goodsShareConfig.getShareAction());

        PictorialUserInfo pictorialUserInfo;
        try {
            pictorialLog(getActivityName(), "获取用户信息");
            pictorialUserInfo = pictorialService.getPictorialUserInfo(param.getUserId(), shop);
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取用户信息失败：" + e.getMessage());
            goodsPictorialInfo.setPictorialCode(PictorialConstant.USER_PIC_ERROR);
            return goodsPictorialInfo;
        }
        getGroupDrawPictorialImg(pictorialUserInfo, shareConfig, groupDrawRecord, goodsRecord, shop, param, goodsPictorialInfo);
        return goodsPictorialInfo;
    }

    private void getGroupDrawPictorialImg(PictorialUserInfo pictorialUserInfo, PictorialShareConfig shareConfig, GroupDrawRecord groupDrawRecord, GoodsRecord goodsRecord, ShopRecord shop, GroupDrawShareInfoParam param, GoodsPictorialInfo goodsPictorialInfo) {
        BufferedImage goodsImage;
        try {
            pictorialLog(getActivityName(), "获取商品图片信息");
            goodsImage = pictorialService.getGoodsPictorialImage(shareConfig, goodsRecord);
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取商品图片信息失败：" + e.getMessage());
            goodsPictorialInfo.setPictorialCode(PictorialConstant.GOODS_PIC_ERROR);
            return;
        }

        pictorialLog(getActivityName(), "获取商品分享语");
        String shareDoc = null;
        if (PictorialShareConfig.DEFAULT_STYLE.equals(shareConfig.getShareAction())) {
            shareDoc = pictorialService.getCommonConfigDoc(param.getUserName(), goodsRecord.getGoodsName(), param.getRealPrice(), shop.getShopLanguage(), true);
            if (shareDoc == null) {
                shareDoc = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_GROUP_DRAW_PICTORIAL_DOC, "","messages", param.getRealPrice());
            }
        } else {
            shareDoc = shareConfig.getShareDoc();
        }

        String mpQrcode;
        if (GoodsConstant.GOODS_ITEM.equals(param.getPageType())) {
            mpQrcode = qrCodeService.getMpQrCode(QrCodeTypeEnum.GOODS_ITEM, String.format("uid=%d&gid=%d&aid=%d&atp=%d",param.getUserId(),goodsRecord.getGoodsId(), groupDrawRecord.getId(), BaseConstant.ACTIVITY_TYPE_GROUP_DRAW));
        } else {
            mpQrcode = qrCodeService.getMpQrCode(QrCodeTypeEnum.LOTTERY, String.format("uid=%d&gid=%d&aid=%d&atp=%d",param.getUserId(),goodsRecord.getGoodsId(), groupDrawRecord.getId(), BaseConstant.ACTIVITY_TYPE_GROUP_DRAW));
        }
        BufferedImage qrCodeImage;
        try {
            qrCodeImage = ImageIO.read(new URL(mpQrcode));
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取二维码失败");
            goodsPictorialInfo.setPictorialCode(PictorialConstant.QRCODE_ERROR);
            return;
        }
        PictorialImgPx imgPx = new PictorialImgPx();
        // 拼装背景图
        BufferedImage bgBufferedImage = pictorialService.createPictorialBgImage(pictorialUserInfo, shop, qrCodeImage, goodsImage, shareDoc, goodsRecord.getGoodsName(),param.getRealPrice(), param.getLinePrice(), imgPx);

        // 拼团抽奖文字
        String groupDrawText = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_GROUP_DRAW_SHARE_INFO, "messages");
        // 活动价格
        String realPriceText = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_PICTORIAL_MONEY_FLAG, "messages") + param.getRealPrice().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
        // 划线价格
        String linePriceText = Util.translateMessage(shop.getShopLanguage(), JsonResultMessage.WX_MA_PICTORIAL_MONEY_FLAG, "messages") + param.getLinePrice().setScale(2, BigDecimal.ROUND_HALF_UP);

        pictorialService.addPictorialSelfCustomerContent(bgBufferedImage, groupDrawText, realPriceText, linePriceText, true, imgPx);

        String base64 = ImageUtil.toBase64(bgBufferedImage);
        goodsPictorialInfo.setBase64(base64);
    }

    @Override
    protected String getActivityName() {
        return "group_draw";
    }
}
