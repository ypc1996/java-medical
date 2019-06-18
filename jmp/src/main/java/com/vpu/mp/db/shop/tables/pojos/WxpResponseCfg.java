/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
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
public class WxpResponseCfg implements Serializable {

    private static final long serialVersionUID = 2068811174;

    private UInteger  recId;
    private Integer   shopId;
    private Byte      type;
    private String    menuKey;
    private String    keyWords;
    private Byte      matchType;
    private Byte      resType;
    private String    resContent;
    private Integer   resRecId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   microId;

    public WxpResponseCfg() {}

    public WxpResponseCfg(WxpResponseCfg value) {
        this.recId = value.recId;
        this.shopId = value.shopId;
        this.type = value.type;
        this.menuKey = value.menuKey;
        this.keyWords = value.keyWords;
        this.matchType = value.matchType;
        this.resType = value.resType;
        this.resContent = value.resContent;
        this.resRecId = value.resRecId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.microId = value.microId;
    }

    public WxpResponseCfg(
        UInteger  recId,
        Integer   shopId,
        Byte      type,
        String    menuKey,
        String    keyWords,
        Byte      matchType,
        Byte      resType,
        String    resContent,
        Integer   resRecId,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   microId
    ) {
        this.recId = recId;
        this.shopId = shopId;
        this.type = type;
        this.menuKey = menuKey;
        this.keyWords = keyWords;
        this.matchType = matchType;
        this.resType = resType;
        this.resContent = resContent;
        this.resRecId = resRecId;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMenuKey() {
        return this.menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getKeyWords() {
        return this.keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Byte getMatchType() {
        return this.matchType;
    }

    public void setMatchType(Byte matchType) {
        this.matchType = matchType;
    }

    public Byte getResType() {
        return this.resType;
    }

    public void setResType(Byte resType) {
        this.resType = resType;
    }

    public String getResContent() {
        return this.resContent;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent;
    }

    public Integer getResRecId() {
        return this.resRecId;
    }

    public void setResRecId(Integer resRecId) {
        this.resRecId = resRecId;
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

    public Integer getMicroId() {
        return this.microId;
    }

    public void setMicroId(Integer microId) {
        this.microId = microId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WxpResponseCfg (");

        sb.append(recId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(type);
        sb.append(", ").append(menuKey);
        sb.append(", ").append(keyWords);
        sb.append(", ").append(matchType);
        sb.append(", ").append(resType);
        sb.append(", ").append(resContent);
        sb.append(", ").append(resRecId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(microId);

        sb.append(")");
        return sb.toString();
    }
}
