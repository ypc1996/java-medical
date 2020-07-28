package com.vpu.mp.service.pojo.wxapp.order.inquiry.vo;

import com.vpu.mp.common.pojo.shop.table.InquiryOrderDo;
import lombok.Data;

/**
 * @author yangpengcheng
 * @date 2020/7/27
 **/
@Data
public class InquiryOrderDetailVo extends InquiryOrderDo {
    private String userName;
    private String userMobile;
}