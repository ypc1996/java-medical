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
public class Cart implements Serializable {

    private static final long serialVersionUID = -1572483417;

    private Long       recId;
    private Integer    shopId;
    private Integer    storeId;
    private Integer    userId;
    private Integer    goodsId;
    private String     goodsSn;
    private Integer    productId;
    private String     prdSn;
    private String     goodsName;
    private BigDecimal marketPrice;
    private BigDecimal goodsPrice;
    private Short      goodsNumber;
    private String     goodsSpecs;
    private Integer    parentId;
    private Byte       recType;
    private Short      isGift;
    private Byte       isBuynow;
    private String     strategy;
    private Byte       action;
    private Integer    identityId;
    private Integer    extendId;
    private Byte       isChecked;
    private String     platform;
    private String     extendInfo;
    private Timestamp  createTime;
    private Timestamp  updateTime;

    public Cart() {}

    public Cart(Cart value) {
        this.recId = value.recId;
        this.shopId = value.shopId;
        this.storeId = value.storeId;
        this.userId = value.userId;
        this.goodsId = value.goodsId;
        this.goodsSn = value.goodsSn;
        this.productId = value.productId;
        this.prdSn = value.prdSn;
        this.goodsName = value.goodsName;
        this.marketPrice = value.marketPrice;
        this.goodsPrice = value.goodsPrice;
        this.goodsNumber = value.goodsNumber;
        this.goodsSpecs = value.goodsSpecs;
        this.parentId = value.parentId;
        this.recType = value.recType;
        this.isGift = value.isGift;
        this.isBuynow = value.isBuynow;
        this.strategy = value.strategy;
        this.action = value.action;
        this.identityId = value.identityId;
        this.extendId = value.extendId;
        this.isChecked = value.isChecked;
        this.platform = value.platform;
        this.extendInfo = value.extendInfo;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public Cart(
        Long       recId,
        Integer    shopId,
        Integer    storeId,
        Integer    userId,
        Integer    goodsId,
        String     goodsSn,
        Integer    productId,
        String     prdSn,
        String     goodsName,
        BigDecimal marketPrice,
        BigDecimal goodsPrice,
        Short      goodsNumber,
        String     goodsSpecs,
        Integer    parentId,
        Byte       recType,
        Short      isGift,
        Byte       isBuynow,
        String     strategy,
        Byte       action,
        Integer    identityId,
        Integer    extendId,
        Byte       isChecked,
        String     platform,
        String     extendInfo,
        Timestamp  createTime,
        Timestamp  updateTime
    ) {
        this.recId = recId;
        this.shopId = shopId;
        this.storeId = storeId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.productId = productId;
        this.prdSn = prdSn;
        this.goodsName = goodsName;
        this.marketPrice = marketPrice;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        this.goodsSpecs = goodsSpecs;
        this.parentId = parentId;
        this.recType = recType;
        this.isGift = isGift;
        this.isBuynow = isBuynow;
        this.strategy = strategy;
        this.action = action;
        this.identityId = identityId;
        this.extendId = extendId;
        this.isChecked = isChecked;
        this.platform = platform;
        this.extendInfo = extendInfo;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getRecId() {
        return this.recId;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return this.goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPrdSn() {
        return this.prdSn;
    }

    public void setPrdSn(String prdSn) {
        this.prdSn = prdSn;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getGoodsPrice() {
        return this.goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Short getGoodsNumber() {
        return this.goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsSpecs() {
        return this.goodsSpecs;
    }

    public void setGoodsSpecs(String goodsSpecs) {
        this.goodsSpecs = goodsSpecs;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getRecType() {
        return this.recType;
    }

    public void setRecType(Byte recType) {
        this.recType = recType;
    }

    public Short getIsGift() {
        return this.isGift;
    }

    public void setIsGift(Short isGift) {
        this.isGift = isGift;
    }

    public Byte getIsBuynow() {
        return this.isBuynow;
    }

    public void setIsBuynow(Byte isBuynow) {
        this.isBuynow = isBuynow;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Byte getAction() {
        return this.action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public Integer getIdentityId() {
        return this.identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public Integer getExtendId() {
        return this.extendId;
    }

    public void setExtendId(Integer extendId) {
        this.extendId = extendId;
    }

    public Byte getIsChecked() {
        return this.isChecked;
    }

    public void setIsChecked(Byte isChecked) {
        this.isChecked = isChecked;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
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
        StringBuilder sb = new StringBuilder("Cart (");

        sb.append(recId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(userId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(goodsSn);
        sb.append(", ").append(productId);
        sb.append(", ").append(prdSn);
        sb.append(", ").append(goodsName);
        sb.append(", ").append(marketPrice);
        sb.append(", ").append(goodsPrice);
        sb.append(", ").append(goodsNumber);
        sb.append(", ").append(goodsSpecs);
        sb.append(", ").append(parentId);
        sb.append(", ").append(recType);
        sb.append(", ").append(isGift);
        sb.append(", ").append(isBuynow);
        sb.append(", ").append(strategy);
        sb.append(", ").append(action);
        sb.append(", ").append(identityId);
        sb.append(", ").append(extendId);
        sb.append(", ").append(isChecked);
        sb.append(", ").append(platform);
        sb.append(", ").append(extendInfo);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
