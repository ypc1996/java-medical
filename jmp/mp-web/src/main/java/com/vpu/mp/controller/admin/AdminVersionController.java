package com.vpu.mp.controller.admin;

import com.vpu.mp.common.foundation.data.JsonResult;
import com.vpu.mp.service.pojo.shop.auth.ChargeRenewAddParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinguo
 */
@RestController
public class AdminVersionController extends AdminBaseController {
    /**
     * 记录续费或升级申请
     */
    @PostMapping("/api/admin/version/charge/renew")
    public JsonResult addChargeRenew(@RequestBody ChargeRenewAddParam param) {
        return success(saas.shop.shopApply.insertChargeRenew(param, adminAuth.user()));
    }

}
