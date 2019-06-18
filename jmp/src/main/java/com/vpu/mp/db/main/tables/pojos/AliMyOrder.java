/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class AliMyOrder implements Serializable {

    private static final long serialVersionUID = -249330242;

    private UInteger   recId;
    private String     commodityOrderId;
    private Timestamp  orderTime;
    private String     title;
    private String     name;
    private String     merchantPid;
    private String     contactor;
    private String     phone;
    private UInteger   orderItemNum;
    private BigDecimal totalPrice;
    private Timestamp  createTime;
    private String     orderTicket;
    private String     serviceCode;
    private Integer    linkShopId;

    public AliMyOrder() {}

    public AliMyOrder(AliMyOrder value) {
        this.recId = value.recId;
        this.commodityOrderId = value.commodityOrderId;
        this.orderTime = value.orderTime;
        this.title = value.title;
        this.name = value.name;
        this.merchantPid = value.merchantPid;
        this.contactor = value.contactor;
        this.phone = value.phone;
        this.orderItemNum = value.orderItemNum;
        this.totalPrice = value.totalPrice;
        this.createTime = value.createTime;
        this.orderTicket = value.orderTicket;
        this.serviceCode = value.serviceCode;
        this.linkShopId = value.linkShopId;
    }

    public AliMyOrder(
        UInteger   recId,
        String     commodityOrderId,
        Timestamp  orderTime,
        String     title,
        String     name,
        String     merchantPid,
        String     contactor,
        String     phone,
        UInteger   orderItemNum,
        BigDecimal totalPrice,
        Timestamp  createTime,
        String     orderTicket,
        String     serviceCode,
        Integer    linkShopId
    ) {
        this.recId = recId;
        this.commodityOrderId = commodityOrderId;
        this.orderTime = orderTime;
        this.title = title;
        this.name = name;
        this.merchantPid = merchantPid;
        this.contactor = contactor;
        this.phone = phone;
        this.orderItemNum = orderItemNum;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
        this.orderTicket = orderTicket;
        this.serviceCode = serviceCode;
        this.linkShopId = linkShopId;
    }

    public UInteger getRecId() {
        return this.recId;
    }

    public void setRecId(UInteger recId) {
        this.recId = recId;
    }

    public String getCommodityOrderId() {
        return this.commodityOrderId;
    }

    public void setCommodityOrderId(String commodityOrderId) {
        this.commodityOrderId = commodityOrderId;
    }

    public Timestamp getOrderTime() {
        return this.orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMerchantPid() {
        return this.merchantPid;
    }

    public void setMerchantPid(String merchantPid) {
        this.merchantPid = merchantPid;
    }

    public String getContactor() {
        return this.contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UInteger getOrderItemNum() {
        return this.orderItemNum;
    }

    public void setOrderItemNum(UInteger orderItemNum) {
        this.orderItemNum = orderItemNum;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getOrderTicket() {
        return this.orderTicket;
    }

    public void setOrderTicket(String orderTicket) {
        this.orderTicket = orderTicket;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Integer getLinkShopId() {
        return this.linkShopId;
    }

    public void setLinkShopId(Integer linkShopId) {
        this.linkShopId = linkShopId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AliMyOrder (");

        sb.append(recId);
        sb.append(", ").append(commodityOrderId);
        sb.append(", ").append(orderTime);
        sb.append(", ").append(title);
        sb.append(", ").append(name);
        sb.append(", ").append(merchantPid);
        sb.append(", ").append(contactor);
        sb.append(", ").append(phone);
        sb.append(", ").append(orderItemNum);
        sb.append(", ").append(totalPrice);
        sb.append(", ").append(createTime);
        sb.append(", ").append(orderTicket);
        sb.append(", ").append(serviceCode);
        sb.append(", ").append(linkShopId);

        sb.append(")");
        return sb.toString();
    }
}
