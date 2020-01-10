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
public class Presale implements Serializable {

    private static final long serialVersionUID = -760133520;

    private Integer   id;
    private Byte      presaleType;
    private String    presaleName;
    private Byte      prePayStep;
    private Timestamp preStartTime;
    private Timestamp preEndTime;
    private Timestamp preStartTime_2;
    private Timestamp preEndTime_2;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer   goodsId;
    private Byte      deliverType;
    private Timestamp deliverTime;
    private Integer   deliverDays;
    private Byte      discountType;
    private Byte      returnType;
    private Integer   showSaleNumber;
    private Byte      buyType;
    private Integer   buyNumber;
    private Byte      status;
    private Byte      delFlag;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    shareConfig;

    public Presale() {}

    public Presale(Presale value) {
        this.id = value.id;
        this.presaleType = value.presaleType;
        this.presaleName = value.presaleName;
        this.prePayStep = value.prePayStep;
        this.preStartTime = value.preStartTime;
        this.preEndTime = value.preEndTime;
        this.preStartTime_2 = value.preStartTime_2;
        this.preEndTime_2 = value.preEndTime_2;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.goodsId = value.goodsId;
        this.deliverType = value.deliverType;
        this.deliverTime = value.deliverTime;
        this.deliverDays = value.deliverDays;
        this.discountType = value.discountType;
        this.returnType = value.returnType;
        this.showSaleNumber = value.showSaleNumber;
        this.buyType = value.buyType;
        this.buyNumber = value.buyNumber;
        this.status = value.status;
        this.delFlag = value.delFlag;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.shareConfig = value.shareConfig;
    }

    public Presale(
        Integer   id,
        Byte      presaleType,
        String    presaleName,
        Byte      prePayStep,
        Timestamp preStartTime,
        Timestamp preEndTime,
        Timestamp preStartTime_2,
        Timestamp preEndTime_2,
        Timestamp startTime,
        Timestamp endTime,
        Integer   goodsId,
        Byte      deliverType,
        Timestamp deliverTime,
        Integer   deliverDays,
        Byte      discountType,
        Byte      returnType,
        Integer   showSaleNumber,
        Byte      buyType,
        Integer   buyNumber,
        Byte      status,
        Byte      delFlag,
        Timestamp createTime,
        Timestamp updateTime,
        String    shareConfig
    ) {
        this.id = id;
        this.presaleType = presaleType;
        this.presaleName = presaleName;
        this.prePayStep = prePayStep;
        this.preStartTime = preStartTime;
        this.preEndTime = preEndTime;
        this.preStartTime_2 = preStartTime_2;
        this.preEndTime_2 = preEndTime_2;
        this.startTime = startTime;
        this.endTime = endTime;
        this.goodsId = goodsId;
        this.deliverType = deliverType;
        this.deliverTime = deliverTime;
        this.deliverDays = deliverDays;
        this.discountType = discountType;
        this.returnType = returnType;
        this.showSaleNumber = showSaleNumber;
        this.buyType = buyType;
        this.buyNumber = buyNumber;
        this.status = status;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.shareConfig = shareConfig;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getPresaleType() {
        return this.presaleType;
    }

    public void setPresaleType(Byte presaleType) {
        this.presaleType = presaleType;
    }

    public String getPresaleName() {
        return this.presaleName;
    }

    public void setPresaleName(String presaleName) {
        this.presaleName = presaleName;
    }

    public Byte getPrePayStep() {
        return this.prePayStep;
    }

    public void setPrePayStep(Byte prePayStep) {
        this.prePayStep = prePayStep;
    }

    public Timestamp getPreStartTime() {
        return this.preStartTime;
    }

    public void setPreStartTime(Timestamp preStartTime) {
        this.preStartTime = preStartTime;
    }

    public Timestamp getPreEndTime() {
        return this.preEndTime;
    }

    public void setPreEndTime(Timestamp preEndTime) {
        this.preEndTime = preEndTime;
    }

    public Timestamp getPreStartTime_2() {
        return this.preStartTime_2;
    }

    public void setPreStartTime_2(Timestamp preStartTime_2) {
        this.preStartTime_2 = preStartTime_2;
    }

    public Timestamp getPreEndTime_2() {
        return this.preEndTime_2;
    }

    public void setPreEndTime_2(Timestamp preEndTime_2) {
        this.preEndTime_2 = preEndTime_2;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getDeliverType() {
        return this.deliverType;
    }

    public void setDeliverType(Byte deliverType) {
        this.deliverType = deliverType;
    }

    public Timestamp getDeliverTime() {
        return this.deliverTime;
    }

    public void setDeliverTime(Timestamp deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Integer getDeliverDays() {
        return this.deliverDays;
    }

    public void setDeliverDays(Integer deliverDays) {
        this.deliverDays = deliverDays;
    }

    public Byte getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(Byte discountType) {
        this.discountType = discountType;
    }

    public Byte getReturnType() {
        return this.returnType;
    }

    public void setReturnType(Byte returnType) {
        this.returnType = returnType;
    }

    public Integer getShowSaleNumber() {
        return this.showSaleNumber;
    }

    public void setShowSaleNumber(Integer showSaleNumber) {
        this.showSaleNumber = showSaleNumber;
    }

    public Byte getBuyType() {
        return this.buyType;
    }

    public void setBuyType(Byte buyType) {
        this.buyType = buyType;
    }

    public Integer getBuyNumber() {
        return this.buyNumber;
    }

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getShareConfig() {
        return this.shareConfig;
    }

    public void setShareConfig(String shareConfig) {
        this.shareConfig = shareConfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Presale (");

        sb.append(id);
        sb.append(", ").append(presaleType);
        sb.append(", ").append(presaleName);
        sb.append(", ").append(prePayStep);
        sb.append(", ").append(preStartTime);
        sb.append(", ").append(preEndTime);
        sb.append(", ").append(preStartTime_2);
        sb.append(", ").append(preEndTime_2);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(deliverType);
        sb.append(", ").append(deliverTime);
        sb.append(", ").append(deliverDays);
        sb.append(", ").append(discountType);
        sb.append(", ").append(returnType);
        sb.append(", ").append(showSaleNumber);
        sb.append(", ").append(buyType);
        sb.append(", ").append(buyNumber);
        sb.append(", ").append(status);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(shareConfig);

        sb.append(")");
        return sb.toString();
    }
}
