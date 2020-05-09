package com.vpu.mp.controller.wxapp;

import com.vpu.mp.db.shop.tables.records.GroupBuyListRecord;
import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.pojo.wxapp.login.WxAppSessionUser;
import com.vpu.mp.service.pojo.wxapp.market.groupbuy.GroupBuyInfoParam;
import com.vpu.mp.service.pojo.wxapp.market.groupbuy.GroupBuyInfoVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

import static com.vpu.mp.service.pojo.shop.market.groupbuy.GroupBuyConstant.IS_GROUPER_N;
import static com.vpu.mp.service.pojo.shop.market.groupbuy.GroupBuyConstant.IS_GROUPER_Y;

/**
 * 多人拼团接口
 * @author 孔德成
 * @date 2019/12/10 14:48
 */
@RestController
public class WxAppGroupBuyController extends WxAppBaseController {


    /**
     * 拼团详情
     * @param param
     * @return
     */
    @PostMapping("/api/wxapp/groupbuy/info")
    public JsonResult getGroupBuyInfo(@RequestBody @Valid GroupBuyInfoParam param){
        WxAppSessionUser user = wxAppAuth.user();
        param.setUserId(user.getUserId());
        GroupBuyInfoVo groupBuyInfo = shop().groupBuy.getGroupBuyInfo(param,getLang());
        return success(groupBuyInfo);
    }

}
