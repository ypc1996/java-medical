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
public class ImportGoods implements Serializable {

    private static final long serialVersionUID = -2125921521;

    private Integer   id;
    private String    impBatchNo;
    private String    siteType;
    private String    impUrl;
    private String    itemId;
    private Integer   goodsId;
    private String    goodsName;
    private Timestamp impTime;

    public ImportGoods() {}

    public ImportGoods(ImportGoods value) {
        this.id = value.id;
        this.impBatchNo = value.impBatchNo;
        this.siteType = value.siteType;
        this.impUrl = value.impUrl;
        this.itemId = value.itemId;
        this.goodsId = value.goodsId;
        this.goodsName = value.goodsName;
        this.impTime = value.impTime;
    }

    public ImportGoods(
        Integer   id,
        String    impBatchNo,
        String    siteType,
        String    impUrl,
        String    itemId,
        Integer   goodsId,
        String    goodsName,
        Timestamp impTime
    ) {
        this.id = id;
        this.impBatchNo = impBatchNo;
        this.siteType = siteType;
        this.impUrl = impUrl;
        this.itemId = itemId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.impTime = impTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImpBatchNo() {
        return this.impBatchNo;
    }

    public void setImpBatchNo(String impBatchNo) {
        this.impBatchNo = impBatchNo;
    }

    public String getSiteType() {
        return this.siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getImpUrl() {
        return this.impUrl;
    }

    public void setImpUrl(String impUrl) {
        this.impUrl = impUrl;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Timestamp getImpTime() {
        return this.impTime;
    }

    public void setImpTime(Timestamp impTime) {
        this.impTime = impTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportGoods (");

        sb.append(id);
        sb.append(", ").append(impBatchNo);
        sb.append(", ").append(siteType);
        sb.append(", ").append(impUrl);
        sb.append(", ").append(itemId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(goodsName);
        sb.append(", ").append(impTime);

        sb.append(")");
        return sb.toString();
    }
}
