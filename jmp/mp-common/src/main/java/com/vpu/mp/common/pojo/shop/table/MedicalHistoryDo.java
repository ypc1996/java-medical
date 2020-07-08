/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 病历
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
public class MedicalHistoryDo implements Serializable {

    private static final long serialVersionUID = 553906239;

    private Integer   id;
    private String    caseHistoryCode;
    private String    posCode;
    private Integer   patientId;
    private String    patientName;
    private Byte      sex;
    private Integer   age;
    private Integer   departmentId;
    private String    departmentName;
    private String    outPatientNumber;
    private String    allergyHistory;
    private String    patientComplain;
    private String    diseaseHistory;
    private String    physicalExamination;
    private String    auxiliaryPhysicalExamination;
    private String    diagnosisContent;
    private String    diagnosisSuggestion;
    private String    doctorCode;
    private String    doctorName;
    private Byte      isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

}
