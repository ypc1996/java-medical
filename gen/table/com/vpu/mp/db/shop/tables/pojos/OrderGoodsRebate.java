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
public class OrderGoodsRebate implements Serializable {

    private static final long serialVersionUID = 1935657478;

    private Integer    rebateId;
    private String     orderSn;
    private Integer    goodsId;
    private Integer    productId;
    private Byte       rebateLevel;
    private Integer    rebateUserId;
    private BigDecimal rebatePercent;
    private BigDecimal rebateMoney;
    private BigDecimal totalRebateMoney;
    private Timestamp  createTime;
    private Timestamp  updateTime;

    public OrderGoodsRebate() {}

    public OrderGoodsRebate(OrderGoodsRebate value) {
        this.rebateId = value.rebateId;
        this.orderSn = value.orderSn;
        this.goodsId = value.goodsId;
        this.productId = value.productId;
        this.rebateLevel = value.rebateLevel;
        this.rebateUserId = value.rebateUserId;
        this.rebatePercent = value.rebatePercent;
        this.rebateMoney = value.rebateMoney;
        this.totalRebateMoney = value.totalRebateMoney;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public OrderGoodsRebate(
        Integer    rebateId,
        String     orderSn,
        Integer    goodsId,
        Integer    productId,
        Byte       rebateLevel,
        Integer    rebateUserId,
        BigDecimal rebatePercent,
        BigDecimal rebateMoney,
        BigDecimal totalRebateMoney,
        Timestamp  createTime,
        Timestamp  updateTime
    ) {
        this.rebateId = rebateId;
        this.orderSn = orderSn;
        this.goodsId = goodsId;
        this.productId = productId;
        this.rebateLevel = rebateLevel;
        this.rebateUserId = rebateUserId;
        this.rebatePercent = rebatePercent;
        this.rebateMoney = rebateMoney;
        this.totalRebateMoney = totalRebateMoney;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getRebateId() {
        return this.rebateId;
    }

    public void setRebateId(Integer rebateId) {
        this.rebateId = rebateId;
    }

    public String getOrderSn() {
        return this.orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Byte getRebateLevel() {
        return this.rebateLevel;
    }

    public void setRebateLevel(Byte rebateLevel) {
        this.rebateLevel = rebateLevel;
    }

    public Integer getRebateUserId() {
        return this.rebateUserId;
    }

    public void setRebateUserId(Integer rebateUserId) {
        this.rebateUserId = rebateUserId;
    }

    public BigDecimal getRebatePercent() {
        return this.rebatePercent;
    }

    public void setRebatePercent(BigDecimal rebatePercent) {
        this.rebatePercent = rebatePercent;
    }

    public BigDecimal getRebateMoney() {
        return this.rebateMoney;
    }

    public void setRebateMoney(BigDecimal rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    public BigDecimal getTotalRebateMoney() {
        return this.totalRebateMoney;
    }

    public void setTotalRebateMoney(BigDecimal totalRebateMoney) {
        this.totalRebateMoney = totalRebateMoney;
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
        StringBuilder sb = new StringBuilder("OrderGoodsRebate (");

        sb.append(rebateId);
        sb.append(", ").append(orderSn);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(productId);
        sb.append(", ").append(rebateLevel);
        sb.append(", ").append(rebateUserId);
        sb.append(", ").append(rebatePercent);
        sb.append(", ").append(rebateMoney);
        sb.append(", ").append(totalRebateMoney);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
