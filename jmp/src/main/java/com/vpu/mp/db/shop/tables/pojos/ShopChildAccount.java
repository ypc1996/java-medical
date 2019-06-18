/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShopChildAccount implements Serializable {

    private static final long serialVersionUID = 1998531969;

    private Integer   accountId;
    private Integer   shopId;
    private String    accountName;
    private String    accountPwd;
    private Integer   roleId;
    private Timestamp createTime;
    private String    mobile;

    public ShopChildAccount() {}

    public ShopChildAccount(ShopChildAccount value) {
        this.accountId = value.accountId;
        this.shopId = value.shopId;
        this.accountName = value.accountName;
        this.accountPwd = value.accountPwd;
        this.roleId = value.roleId;
        this.createTime = value.createTime;
        this.mobile = value.mobile;
    }

    public ShopChildAccount(
        Integer   accountId,
        Integer   shopId,
        String    accountName,
        String    accountPwd,
        Integer   roleId,
        Timestamp createTime,
        String    mobile
    ) {
        this.accountId = accountId;
        this.shopId = shopId;
        this.accountName = accountName;
        this.accountPwd = accountPwd;
        this.roleId = roleId;
        this.createTime = createTime;
        this.mobile = mobile;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPwd() {
        return this.accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ShopChildAccount (");

        sb.append(accountId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(accountName);
        sb.append(", ").append(accountPwd);
        sb.append(", ").append(roleId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(mobile);

        sb.append(")");
        return sb.toString();
    }
}
