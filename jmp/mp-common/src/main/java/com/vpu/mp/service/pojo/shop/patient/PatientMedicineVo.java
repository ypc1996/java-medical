package com.vpu.mp.service.pojo.shop.patient;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author 赵晓东
 * @description 患者购药记录出参
 * @create 2020-09-09 09:23
 **/
@Data
public class PatientMedicineVo {

    private String goodsCommonName;
    private String goodsQualityRatio;
    private String goodsProductionEnterprise;
    private String goodsApprovalNumber;
    private Integer goodsNumber;
    private BigDecimal goodsPrice;
    private String prescriptionCode;
    private String orderSn;
    private BigDecimal discountedTotalPrice;
    private Timestamp createTime;

}
