package com.vpu.mp.controller.wxapp;

import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.pojo.wxapp.market.increasepurchase.PurchaseGoodsListParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 王兵兵
 * @create: 2020-02-24 10:30
 **/
@RestController
public class WxAppPurchasePriceController extends WxAppBaseController{
    /**
     * 	加价购活动页的商品列表接口
     */
    @PostMapping("/api/wxapp/purchase/goodslist")
    public JsonResult purchaseGoodsList(@RequestBody @Validated PurchaseGoodsListParam param) {
        return success(shop().increaseService.getWxAppGoodsList(param,wxAppAuth.user().getUserId()));
    }

    /**
     * 	可当前以换购的商品列表
     */
    @PostMapping("/api/wxapp/purchase/changegoods")
    public JsonResult changePurchaseProductList(@RequestBody @Validated PurchaseGoodsListParam param) {
        return success();
    }
}
