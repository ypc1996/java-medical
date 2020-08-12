package com.vpu.mp.common.pojo.shop.table;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 孔德成
 * @date 2020/8/12 15:12
 */
@Data
public class DoctorCommentDo {

    private static final long serialVersionUID = -977132338;

    private Integer   id;
    private Integer   userId;
    private String    userName;
    private Integer   patientId;
    private Integer   doctorId;
    private Byte      stars;
    private Byte      isAnonymou;
    private String    tag;
    private String    orderSn;
    private String    commNote;
    private Byte      auditStatus;
    private Byte      isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;
}
