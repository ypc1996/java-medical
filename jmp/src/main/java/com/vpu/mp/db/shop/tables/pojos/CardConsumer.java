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
public class CardConsumer implements Serializable {

    private static final long serialVersionUID = -1295058510;

    private Integer    id;
    private Integer    userId;
    private Integer    cardId;
    private Timestamp  addTime;
    private BigDecimal money;
    private Short      count;
    private Byte       type;
    private String     reason;
    private String     message;
    private String     cardNo;
    private Short      exchangCount;
    private String     orderSn;

    public CardConsumer() {}

    public CardConsumer(CardConsumer value) {
        this.id = value.id;
        this.userId = value.userId;
        this.cardId = value.cardId;
        this.addTime = value.addTime;
        this.money = value.money;
        this.count = value.count;
        this.type = value.type;
        this.reason = value.reason;
        this.message = value.message;
        this.cardNo = value.cardNo;
        this.exchangCount = value.exchangCount;
        this.orderSn = value.orderSn;
    }

    public CardConsumer(
        Integer    id,
        Integer    userId,
        Integer    cardId,
        Timestamp  addTime,
        BigDecimal money,
        Short      count,
        Byte       type,
        String     reason,
        String     message,
        String     cardNo,
        Short      exchangCount,
        String     orderSn
    ) {
        this.id = id;
        this.userId = userId;
        this.cardId = cardId;
        this.addTime = addTime;
        this.money = money;
        this.count = count;
        this.type = type;
        this.reason = reason;
        this.message = message;
        this.cardNo = cardNo;
        this.exchangCount = exchangCount;
        this.orderSn = orderSn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Timestamp getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Short getCount() {
        return this.count;
    }

    public void setCount(Short count) {
        this.count = count;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Short getExchangCount() {
        return this.exchangCount;
    }

    public void setExchangCount(Short exchangCount) {
        this.exchangCount = exchangCount;
    }

    public String getOrderSn() {
        return this.orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CardConsumer (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(cardId);
        sb.append(", ").append(addTime);
        sb.append(", ").append(money);
        sb.append(", ").append(count);
        sb.append(", ").append(type);
        sb.append(", ").append(reason);
        sb.append(", ").append(message);
        sb.append(", ").append(cardNo);
        sb.append(", ").append(exchangCount);
        sb.append(", ").append(orderSn);

        sb.append(")");
        return sb.toString();
    }
}
