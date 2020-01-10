/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class PinGroupProductDefine implements Serializable {

    private static final long serialVersionUID = 385596759;

    private Integer    id;
    private Integer    pinActivityId;
    private Integer    productId;
    private BigDecimal pinGroupPrice;
    private Short      stock;
    private Short      saleNum;
    private BigDecimal grouperPrice;
    private Timestamp  createTime;
    private Timestamp  updateTime;

    public PinGroupProductDefine() {}

    public PinGroupProductDefine(PinGroupProductDefine value) {
        this.id = value.id;
        this.pinActivityId = value.pinActivityId;
        this.productId = value.productId;
        this.pinGroupPrice = value.pinGroupPrice;
        this.stock = value.stock;
        this.saleNum = value.saleNum;
        this.grouperPrice = value.grouperPrice;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public PinGroupProductDefine(
        Integer    id,
        Integer    pinActivityId,
        Integer    productId,
        BigDecimal pinGroupPrice,
        Short      stock,
        Short      saleNum,
        BigDecimal grouperPrice,
        Timestamp  createTime,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.pinActivityId = pinActivityId;
        this.productId = productId;
        this.pinGroupPrice = pinGroupPrice;
        this.stock = stock;
        this.saleNum = saleNum;
        this.grouperPrice = grouperPrice;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPinActivityId() {
        return this.pinActivityId;
    }

    public void setPinActivityId(Integer pinActivityId) {
        this.pinActivityId = pinActivityId;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getPinGroupPrice() {
        return this.pinGroupPrice;
    }

    public void setPinGroupPrice(BigDecimal pinGroupPrice) {
        this.pinGroupPrice = pinGroupPrice;
    }

    public Short getStock() {
        return this.stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    public Short getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Short saleNum) {
        this.saleNum = saleNum;
    }

    public BigDecimal getGrouperPrice() {
        return this.grouperPrice;
    }

    public void setGrouperPrice(BigDecimal grouperPrice) {
        this.grouperPrice = grouperPrice;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PinGroupProductDefine (");

        sb.append(id);
        sb.append(", ").append(pinActivityId);
        sb.append(", ").append(productId);
        sb.append(", ").append(pinGroupPrice);
        sb.append(", ").append(stock);
        sb.append(", ").append(saleNum);
        sb.append(", ").append(grouperPrice);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
