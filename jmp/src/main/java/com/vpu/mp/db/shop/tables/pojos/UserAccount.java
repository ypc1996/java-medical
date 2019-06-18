/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


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
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 152356116;

    private UInteger   id;
    private UInteger   userId;
    private String     adminUser;
    private String     orderSn;
    private BigDecimal amount;
    private Timestamp  addTime;
    private String     adminNote;
    private String     payment;
    private Byte       isPaid;
    private String     remark;
    private Byte       source;

    public UserAccount() {}

    public UserAccount(UserAccount value) {
        this.id = value.id;
        this.userId = value.userId;
        this.adminUser = value.adminUser;
        this.orderSn = value.orderSn;
        this.amount = value.amount;
        this.addTime = value.addTime;
        this.adminNote = value.adminNote;
        this.payment = value.payment;
        this.isPaid = value.isPaid;
        this.remark = value.remark;
        this.source = value.source;
    }

    public UserAccount(
        UInteger   id,
        UInteger   userId,
        String     adminUser,
        String     orderSn,
        BigDecimal amount,
        Timestamp  addTime,
        String     adminNote,
        String     payment,
        Byte       isPaid,
        String     remark,
        Byte       source
    ) {
        this.id = id;
        this.userId = userId;
        this.adminUser = adminUser;
        this.orderSn = orderSn;
        this.amount = amount;
        this.addTime = addTime;
        this.adminNote = adminNote;
        this.payment = payment;
        this.isPaid = isPaid;
        this.remark = remark;
        this.source = source;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getUserId() {
        return this.userId;
    }

    public void setUserId(UInteger userId) {
        this.userId = userId;
    }

    public String getAdminUser() {
        return this.adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getOrderSn() {
        return this.orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getAdminNote() {
        return this.adminNote;
    }

    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Byte getIsPaid() {
        return this.isPaid;
    }

    public void setIsPaid(Byte isPaid) {
        this.isPaid = isPaid;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getSource() {
        return this.source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserAccount (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(adminUser);
        sb.append(", ").append(orderSn);
        sb.append(", ").append(amount);
        sb.append(", ").append(addTime);
        sb.append(", ").append(adminNote);
        sb.append(", ").append(payment);
        sb.append(", ").append(isPaid);
        sb.append(", ").append(remark);
        sb.append(", ").append(source);

        sb.append(")");
        return sb.toString();
    }
}
