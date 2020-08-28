package com.vpu.mp.controller.wxapp;

import com.vpu.mp.common.foundation.data.JsonResult;
import com.vpu.mp.common.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.rebate.*;
import com.vpu.mp.service.pojo.wxapp.login.WxAppSessionUser;
import com.vpu.mp.service.shop.rebate.DoctorTotalRebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangpengcheng
 * @date 2020/8/27
 **/
@RestController
public class WxAppDoctorRebateController extends WxAppBaseController{
    @Autowired
    private DoctorTotalRebateService doctorTotalRebateService;

    /**
     * 医师返利汇总信息
     * @return
     */
    @PostMapping("/api/wxapp/doctor/rebate/total")
    public JsonResult getTotalRebateInfo(){
        WxAppSessionUser user=wxAppAuth.user();
        DoctorTotalRebateVo doctorTotalRebateVo=doctorTotalRebateService.getRebateByDoctorId(user.getDoctorId());
        return success(doctorTotalRebateVo);
    }

    /**
     * 处方返利列表查询
     * @param param
     * @return
     */
    @PostMapping("/api/wxapp/doctor/rebate/prescription/list")
    public JsonResult prescriptionRebateList(@RequestBody PrescriptionRebateListParam param){
        PageResult<PrescriptionRebateVo> result=shop().prescriptionRebateService.getPageList(param);
        return success(result);
    }

    /**
     * 咨询返利列表查询
     * @param param
     * @return
     */
    @PostMapping("/api/wxapp/doctor/rebate/inquiryOrder/list")
    public JsonResult inquiryOrderRebateList(@RequestBody InquiryOrderRebateListParam param){
        PageResult<InquiryOrderRebateVo> result=shop().inquiryOrderRebateService.getPageList(param);
        return success(result);
    }
}
