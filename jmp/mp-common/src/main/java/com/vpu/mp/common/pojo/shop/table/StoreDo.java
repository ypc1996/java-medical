/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 门店信息表
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
public class StoreDo implements Serializable {

    private static final long serialVersionUID = 1047163101;

    private Integer   storeId;
    private String    storeName;
    private String    storeCode;
    private String    manager;
    private String    mobile;
    private String    storeImgs;
    private Byte      businessState;
    private Byte      businessType;
    private String    openingTime;
    private String    closeTime;
    private String    provinceCode;
    private String    cityCode;
    private String    districtCode;
    private String    latitude;
    private String    longitude;
    private String    address;
    private Integer   group;
    private String    service;
    private String    content;
    private Integer   posShopId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Short     autoPick;
    private Byte      delFlag;
    private Byte      cityService;
    private Byte      pickTimeAction;
    private String    pickTimeDetail;
    private Byte      storeExpress;
    private Byte      storeType;

}
