/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class WxpSubStat implements Serializable {

    private static final long serialVersionUID = -187784685;

    private UInteger recId;
    private Integer  shopId;
    private Date     rq;
    private Integer  subNum;
    private Integer  unsubNum;
    private Integer  sumSubNum;
    private Integer  microId;

    public WxpSubStat() {}

    public WxpSubStat(WxpSubStat value) {
        this.recId = value.recId;
        this.shopId = value.shopId;
        this.rq = value.rq;
        this.subNum = value.subNum;
        this.unsubNum = value.unsubNum;
        this.sumSubNum = value.sumSubNum;
        this.microId = value.microId;
    }

    public WxpSubStat(
        UInteger recId,
        Integer  shopId,
        Date     rq,
        Integer  subNum,
        Integer  unsubNum,
        Integer  sumSubNum,
        Integer  microId
    ) {
        this.recId = recId;
        this.shopId = shopId;
        this.rq = rq;
        this.subNum = subNum;
        this.unsubNum = unsubNum;
        this.sumSubNum = sumSubNum;
        this.microId = microId;
    }

    public UInteger getRecId() {
        return this.recId;
    }

    public void setRecId(UInteger recId) {
        this.recId = recId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getRq() {
        return this.rq;
    }

    public void setRq(Date rq) {
        this.rq = rq;
    }

    public Integer getSubNum() {
        return this.subNum;
    }

    public void setSubNum(Integer subNum) {
        this.subNum = subNum;
    }

    public Integer getUnsubNum() {
        return this.unsubNum;
    }

    public void setUnsubNum(Integer unsubNum) {
        this.unsubNum = unsubNum;
    }

    public Integer getSumSubNum() {
        return this.sumSubNum;
    }

    public void setSumSubNum(Integer sumSubNum) {
        this.sumSubNum = sumSubNum;
    }

    public Integer getMicroId() {
        return this.microId;
    }

    public void setMicroId(Integer microId) {
        this.microId = microId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WxpSubStat (");

        sb.append(recId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(rq);
        sb.append(", ").append(subNum);
        sb.append(", ").append(unsubNum);
        sb.append(", ").append(sumSubNum);
        sb.append(", ").append(microId);

        sb.append(")");
        return sb.toString();
    }
}
