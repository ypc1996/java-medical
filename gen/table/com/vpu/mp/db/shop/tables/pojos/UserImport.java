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
public class UserImport implements Serializable {

    private static final long serialVersionUID = 1526560775;

    private Integer   id;
    private String    cardId;
    private Integer   totalNum;
    private Integer   successNum;
    private Byte      delFlag;
    private Timestamp delTime;
    private Timestamp createTime;
    private Timestamp updateTime;

    public UserImport() {}

    public UserImport(UserImport value) {
        this.id = value.id;
        this.cardId = value.cardId;
        this.totalNum = value.totalNum;
        this.successNum = value.successNum;
        this.delFlag = value.delFlag;
        this.delTime = value.delTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public UserImport(
        Integer   id,
        String    cardId,
        Integer   totalNum,
        Integer   successNum,
        Byte      delFlag,
        Timestamp delTime,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.cardId = cardId;
        this.totalNum = totalNum;
        this.successNum = successNum;
        this.delFlag = delFlag;
        this.delTime = delTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardId() {
        return this.cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getTotalNum() {
        return this.totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getSuccessNum() {
        return this.successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Timestamp getDelTime() {
        return this.delTime;
    }

    public void setDelTime(Timestamp delTime) {
        this.delTime = delTime;
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
        StringBuilder sb = new StringBuilder("UserImport (");

        sb.append(id);
        sb.append(", ").append(cardId);
        sb.append(", ").append(totalNum);
        sb.append(", ").append(successNum);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(delTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
