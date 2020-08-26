/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 门店账户表
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
public class StoreAccountDo implements Serializable {

    private static final long serialVersionUID = 753299708;

    private Integer   accountId;
    private Integer   shopId;
    private Integer   sysId;
    private String    mobile;
    private String    accountName;
    private String    wxNickName;
    private Timestamp createTime;
    private Byte      accountType;
    private Byte      status;
    private Byte      delFlag;
    private String    accountPasswd;
    private String    storeList;
    private Timestamp updateTime;

}