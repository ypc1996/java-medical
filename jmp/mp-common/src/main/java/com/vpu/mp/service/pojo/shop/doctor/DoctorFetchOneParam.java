package com.vpu.mp.service.pojo.shop.doctor;

import lombok.Data;

import java.util.Date;

@Data
public class DoctorFetchOneParam {
    private String doctorCode;
    private String docUrl;
    private String doctorName;
    private String certificateCode;
    private String professionalCode;
    private String departCode;
    private String positionCode;
    private String docPhone;
    private Integer doctorSex;
    private Integer state;
    private Integer createTime;
    private Date lastUpdateTime;
}
