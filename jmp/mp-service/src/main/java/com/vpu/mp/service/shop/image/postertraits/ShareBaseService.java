package com.vpu.mp.service.shop.image.postertraits;

import com.vpu.mp.db.main.tables.records.ShopRecord;
import com.vpu.mp.db.shop.tables.records.GoodsRecord;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.Util;
import com.vpu.mp.service.pojo.shop.config.PictorialShareConfig;
import com.vpu.mp.service.pojo.wxapp.share.*;
import com.vpu.mp.service.shop.goods.GoodsService;
import com.vpu.mp.service.shop.image.ImageService;
import com.vpu.mp.service.shop.image.QrCodeService;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;

/**
 * 海报下载分享基类
 *
 * @author 李晓冰
 * @date 2020年04月23日
 */
public abstract class ShareBaseService extends ShopBaseService {
    @Autowired
    protected PictorialService pictorialService;
    @Autowired
    protected ImageService imageService;
    @Autowired
    protected GoodsService goodsService;
    @Autowired
    protected QrCodeService qrCodeService;

    /**
     * 获取活动record信息
     *
     * @param activityId 活动id
     * @return 活动对应的record类
     */
    abstract Record getActivityRecord(Integer activityId);

    /**
     * 获取活动或商品的分享配置信息
     *
     * @param aRecord     活动record
     * @param goodsRecord 商品record
     * @return 分享配置信息
     */
    abstract PictorialShareConfig getPictorialConfig(Record aRecord, GoodsRecord goodsRecord);

    /**
     * 创建默认宣传语
     *
     * @param lang        语言
     * @param aRecord     活动record
     * @param goodsRecord 商品record
     * @param baseParam   请求参数
     * @return 宣传语
     */
    abstract String createDefaultShareDoc(String lang, Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam);

    /**
     * 创建分享图片
     *
     * @param aRecord     分享活动
     * @param goodsRecord 分享的商品
     * @param baseParam   分享请求参数
     * @return 图片路径
     */
    abstract String createShareImage(Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam);

    /**
     * 创建二维码图片
     *
     * @param aRecord     分享活动
     * @param goodsRecord 分享的商品
     * @param baseParam   分享请求参数
     * @return 图片路径
     */
    abstract String createMpQrCode(Record aRecord, GoodsRecord goodsRecord, GoodsShareBaseParam baseParam);

    /**
     * 处理海报分享信息
     *
     * @param qrCodeBufferImg
     * @param goodsImg
     * @param userInfo           用户信息
     * @param shareDoc           宣传语
     * @param aRecord
     * @param goodsRecord
     * @param shop
     * @param baseParam
     * @param goodsPictorialInfo
     */
    abstract void createPictorialImg(BufferedImage qrCodeBufferImg, BufferedImage goodsImg, PictorialUserInfo userInfo, String shareDoc, Record aRecord, GoodsRecord goodsRecord, ShopRecord shop, GoodsShareBaseParam baseParam, GoodsPictorialInfo goodsPictorialInfo);

    /**
     * 创建活动分享信息
     *
     * @param param 分享接口参数
     * @return 分享信息
     */
    public GoodsShareInfo getShareInfo(GoodsShareBaseParam param) {
        GoodsShareInfo shareInfoVo = new GoodsShareInfo();

        Record activityRecord = null;
        if (param.getActivityId() != null) {
            activityRecord = getActivityRecord(param.getActivityId());
            // 活动信息不可用
            if (activityRecord == null) {
                shareLog(getActivityName(), "活动信息不可用");
                shareInfoVo.setShareCode(PictorialConstant.ACTIVITY_DELETED);
                return shareInfoVo;
            }
        }

        GoodsRecord goodsRecord = goodsService.getGoodsRecordById(param.getTargetId());
        // 商品信息不可用
        if (goodsRecord == null) {
            shareLog(getActivityName(), "商品信息不可用");
            shareInfoVo.setShareCode(PictorialConstant.GOODS_DELETED);
            return shareInfoVo;
        }

        PictorialShareConfig shareConfig = getPictorialConfig(activityRecord, goodsRecord);
        shareLog(getActivityName(), "分享配置信息:" + Util.toJson(shareConfig));

        // 用户自定义分享样式
        if (PictorialShareConfig.CUSTOMER_STYLE.equals(shareConfig.getShareAction())) {
            if (PictorialShareConfig.DEFAULT_IMG.equals(shareConfig.getShareImgAction())) {
                shareInfoVo.setImgUrl(goodsRecord.getGoodsImg());
            } else {
                shareInfoVo.setImgUrl(shareConfig.getShareImg());
            }
            shareInfoVo.setShareDoc(shareConfig.getShareDoc());
        } else {
            String imgPath = createShareImage(activityRecord, goodsRecord, param);
            if (imgPath == null) {
                shareInfoVo.setShareCode(PictorialConstant.GOODS_PIC_ERROR);
                return shareInfoVo;
            }
            shareInfoVo.setImgUrl(imgPath);
            String shareDoc = null;
            ShopRecord shop = saas.shop.getShopById(getShopId());
            shareDoc = pictorialService.getCommonConfigDoc(param.getUserName(), goodsRecord.getGoodsName(), param.getRealPrice(), shop.getShopLanguage(), false);
            if (shareDoc == null) {
                shareDoc = createDefaultShareDoc(shop.getShopLanguage(), activityRecord, goodsRecord, param);
            }
            shareInfoVo.setShareDoc(shareDoc);
        }
        shareInfoVo.setImgUrl(imageService.getImgFullUrl(shareInfoVo.getImgUrl()));
        return shareInfoVo;
    }


    /**
     * 获取商品海报信息
     *
     * @param baseParam 请求参数
     * @return 海报获取的信息
     */
    public GoodsPictorialInfo getPictorialInfo(GoodsShareBaseParam baseParam) {
        ShopRecord shop = saas.shop.getShopById(getShopId());
        GoodsPictorialInfo goodsPictorialInfo = new GoodsPictorialInfo();
        Record activityRecord = null;
        if (baseParam.getActivityId() != null) {
            activityRecord = getActivityRecord(baseParam.getActivityId());
            // 活动信息不可用
            if (activityRecord == null) {
                pictorialLog(getActivityName(), "活动信息已删除或失效");
                goodsPictorialInfo.setPictorialCode(PictorialConstant.ACTIVITY_DELETED);
                return goodsPictorialInfo;
            }
        }
        GoodsRecord goodsRecord = goodsService.getGoodsRecordById(baseParam.getTargetId());
        if (goodsRecord == null) {
            pictorialLog(getActivityName(), "商品信息已删除或失效");
            goodsPictorialInfo.setPictorialCode(PictorialConstant.GOODS_DELETED);
            return goodsPictorialInfo;
        }

        PictorialShareConfig shareConfig = getPictorialConfig(activityRecord, goodsRecord);
        shareLog(getActivityName(), "分享配置信息:" + Util.toJson(shareConfig));

        PictorialUserInfo userInfo = null;
        try {
            pictorialLog(getActivityName(), "获取用户信息");
            userInfo = pictorialService.getPictorialUserInfo(baseParam.getUserId(), shop);
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取用户信息失败：" + e.getMessage());
            goodsPictorialInfo.setPictorialCode(PictorialConstant.USER_PIC_ERROR);
            return goodsPictorialInfo;
        }

        BufferedImage goodsImage;
        try {
            pictorialLog(getActivityName(), "获取商品图片信息");
            goodsImage = pictorialService.getGoodsPictorialImage(shareConfig, goodsRecord);
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取商品图片信息失败：" + e.getMessage());
            goodsPictorialInfo.setPictorialCode(PictorialConstant.GOODS_PIC_ERROR);
            return goodsPictorialInfo;
        }

        pictorialLog(getActivityName(), "获取商品分享语");
        String shareDoc = null;
        if (PictorialShareConfig.DEFAULT_STYLE.equals(shareConfig.getShareAction())) {
            shareDoc = pictorialService.getCommonConfigDoc(baseParam.getUserName(), goodsRecord.getGoodsName(), baseParam.getRealPrice(), shop.getShopLanguage(), true);
            if (shareDoc == null) {
                shareDoc = createDefaultShareDoc(shop.getShopLanguage(), activityRecord, goodsRecord, baseParam);
            }
        } else {
            shareDoc = shareConfig.getShareDoc();
        }

        String mpQrCode = createMpQrCode(activityRecord, goodsRecord, baseParam);
        BufferedImage qrCodeImage;
        try {
            qrCodeImage = ImageIO.read(new URL(mpQrCode));
        } catch (IOException e) {
            pictorialLog(getActivityName(), "获取二维码失败");
            goodsPictorialInfo.setPictorialCode(PictorialConstant.QRCODE_ERROR);
            return goodsPictorialInfo;
        }

        pictorialLog(getActivityName(), "处理海报背景图片");
        createPictorialImg(qrCodeImage, goodsImage, userInfo, shareDoc, activityRecord, goodsRecord, shop, baseParam, goodsPictorialInfo);

        return goodsPictorialInfo;
    }


    /**
     * 创建云盘上的相对路径
     *
     * @param activityId 活动Id
     * @return 相对路径
     */
    String createFilePath(Integer activityId) {
        return String.format("/upload/%s/share/%s/%s.jpg", getShopId(), getActivityName(), activityId + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()));
    }

    /**
     * 活动名称
     *
     * @return 名称字符串
     */
    abstract String getActivityName();

    /**
     * 分享打印日志
     *
     * @param tag 活动名
     * @param msg 日志信息
     */
    void shareLog(String tag, String msg) {
        printLog("share", tag, msg);
    }

    /**
     * 海报打印日志
     *
     * @param tag 活动名
     * @param msg 日志信息
     */
    void pictorialLog(String tag, String msg) {
        printLog("pictorial", tag, msg);
    }

    /**
     * 日志
     *
     * @param type share或pictorial
     * @param tag  活动名
     * @param msg  日志信息
     */
    private void printLog(String type, String tag, String msg) {
        logger().debug("小程序-{}-{}-{}", type, tag, msg);
    }

}