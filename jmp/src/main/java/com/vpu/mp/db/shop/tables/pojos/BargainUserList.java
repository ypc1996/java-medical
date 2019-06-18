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
public class BargainUserList implements Serializable {

    private static final long serialVersionUID = -2075997715;

    private UInteger   id;
    private Integer    recordId;
    private Integer    userId;
    private BigDecimal bargainMoney;
    private Timestamp  addTime;

    public BargainUserList() {}

    public BargainUserList(BargainUserList value) {
        this.id = value.id;
        this.recordId = value.recordId;
        this.userId = value.userId;
        this.bargainMoney = value.bargainMoney;
        this.addTime = value.addTime;
    }

    public BargainUserList(
        UInteger   id,
        Integer    recordId,
        Integer    userId,
        BigDecimal bargainMoney,
        Timestamp  addTime
    ) {
        this.id = id;
        this.recordId = recordId;
        this.userId = userId;
        this.bargainMoney = bargainMoney;
        this.addTime = addTime;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return this.recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getBargainMoney() {
        return this.bargainMoney;
    }

    public void setBargainMoney(BigDecimal bargainMoney) {
        this.bargainMoney = bargainMoney;
    }

    public Timestamp getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BargainUserList (");

        sb.append(id);
        sb.append(", ").append(recordId);
        sb.append(", ").append(userId);
        sb.append(", ").append(bargainMoney);
        sb.append(", ").append(addTime);

        sb.append(")");
        return sb.toString();
    }
}
