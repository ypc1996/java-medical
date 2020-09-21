/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 处方信息表
 * @author 孔德成
 * @date 2020/7/6 16:28
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Data
public class PrescriptionDo implements Serializable {

    private static final long serialVersionUID = 2035851394;

    private Integer    id;
    private String     prescriptionCode;
    private String     posCode;
    private String     orderSn;
    private Integer    patientId;
    private Integer    userId;
    private String     patientTreatmentCode;
    private String     identityCode;
    private Byte       identityType;
    private String     patientName;
    private Integer    patientAge;
    private Byte       patientSex;
    private String     patientDiseaseHistory;
    private String     patientAllergyHistory;
    private String     registerHospital;
    private String     departmentCode;
    private String     departmentName;
    private String     doctorCode;
    private String     doctorName;
    private Timestamp  diagnoseTime;
    private String     pharmacistName;
    private String     pharmacistCode;
    private String     diagnosisName;
    private String     diagnosisDetail;
    private String     doctorAdvice;
    private String     patientComplain;
    private String     patientSign;
    private BigDecimal totalPrice;
    private Byte       source;
    private Byte       auditType;
    private Byte       status;
    private String     statusMemo;
    private Byte       expireType;
    private Timestamp  prescriptionCreateTime;
    private Timestamp  prescriptionExpireTime;
    private Byte       isDelete;
    private Byte       isUsed;
    private Byte       isValid;
    private Byte       settlementFlag;
    private String     doctorSignature;
    private String     pharmacistSignature;
    private String     cachet;
    private Timestamp  createTime;
    private Timestamp  updateTime;

}
