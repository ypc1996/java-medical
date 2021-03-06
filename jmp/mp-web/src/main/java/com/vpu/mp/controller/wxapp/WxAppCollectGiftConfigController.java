package com.vpu.mp.controller.wxapp;

import com.vpu.mp.common.foundation.data.JsonResult;
import com.vpu.mp.service.pojo.shop.market.collect.CollectGiftParam;
import com.vpu.mp.service.pojo.wxapp.collectgift.SetCollectGiftVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 常乐
 * @Date 2019-12-25
 */
@RestController
public class WxAppCollectGiftConfigController extends WxAppBaseController {
    /**
     * 收藏有礼开关状态
     * @return
     */
    @PostMapping("/api/wxapp/collectGift/switch")
    public JsonResult getSwitchStatus(){
        Integer userId = wxAppAuth.user().getUserId();
        Integer shopId = wxAppAuth.user().getShopId();
        CollectGiftParam res = shop().config.collectGiftConfigService.collectGiftConfig(userId,shopId);
        return this.success(res);
    }

    /**
     * 收藏有礼礼品发放
     * @return
     */
    @PostMapping("/api/wxapp/collectGift/setRewards")
    public JsonResult setRewards(){
        Integer userId = wxAppAuth.user().getUserId();
        SetCollectGiftVo res = shop().config.collectGiftConfigService.setRewards(userId);
        return this.success(res);
    }
}
