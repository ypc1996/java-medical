/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class GoodsSpecProduct implements Serializable {

    private static final long serialVersionUID = -1138199155;

    private Integer    prdId;
    private Integer    shopId;
    private Integer    goodsId;
    private BigDecimal prdPrice;
    private BigDecimal prdMarketPrice;
    private BigDecimal prdCostPrice;
    private Integer    prdNumber;
    private String     prdSn;
    private String     prdCodes;
    private String     prdSpecs;
    private String     prdDesc;
    private Byte       delFlag;
    private Byte       selfFlag;
    private String     lowShopPrice;
    private String     prdImg;
    private Byte       priceFlag;

    public GoodsSpecProduct() {}

    public GoodsSpecProduct(GoodsSpecProduct value) {
        this.prdId = value.prdId;
        this.shopId = value.shopId;
        this.goodsId = value.goodsId;
        this.prdPrice = value.prdPrice;
        this.prdMarketPrice = value.prdMarketPrice;
        this.prdCostPrice = value.prdCostPrice;
        this.prdNumber = value.prdNumber;
        this.prdSn = value.prdSn;
        this.prdCodes = value.prdCodes;
        this.prdSpecs = value.prdSpecs;
        this.prdDesc = value.prdDesc;
        this.delFlag = value.delFlag;
        this.selfFlag = value.selfFlag;
        this.lowShopPrice = value.lowShopPrice;
        this.prdImg = value.prdImg;
        this.priceFlag = value.priceFlag;
    }

    public GoodsSpecProduct(
        Integer    prdId,
        Integer    shopId,
        Integer    goodsId,
        BigDecimal prdPrice,
        BigDecimal prdMarketPrice,
        BigDecimal prdCostPrice,
        Integer    prdNumber,
        String     prdSn,
        String     prdCodes,
        String     prdSpecs,
        String     prdDesc,
        Byte       delFlag,
        Byte       selfFlag,
        String     lowShopPrice,
        String     prdImg,
        Byte       priceFlag
    ) {
        this.prdId = prdId;
        this.shopId = shopId;
        this.goodsId = goodsId;
        this.prdPrice = prdPrice;
        this.prdMarketPrice = prdMarketPrice;
        this.prdCostPrice = prdCostPrice;
        this.prdNumber = prdNumber;
        this.prdSn = prdSn;
        this.prdCodes = prdCodes;
        this.prdSpecs = prdSpecs;
        this.prdDesc = prdDesc;
        this.delFlag = delFlag;
        this.selfFlag = selfFlag;
        this.lowShopPrice = lowShopPrice;
        this.prdImg = prdImg;
        this.priceFlag = priceFlag;
    }

    public Integer getPrdId() {
        return this.prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPrdPrice() {
        return this.prdPrice;
    }

    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    public BigDecimal getPrdMarketPrice() {
        return this.prdMarketPrice;
    }

    public void setPrdMarketPrice(BigDecimal prdMarketPrice) {
        this.prdMarketPrice = prdMarketPrice;
    }

    public BigDecimal getPrdCostPrice() {
        return this.prdCostPrice;
    }

    public void setPrdCostPrice(BigDecimal prdCostPrice) {
        this.prdCostPrice = prdCostPrice;
    }

    public Integer getPrdNumber() {
        return this.prdNumber;
    }

    public void setPrdNumber(Integer prdNumber) {
        this.prdNumber = prdNumber;
    }

    public String getPrdSn() {
        return this.prdSn;
    }

    public void setPrdSn(String prdSn) {
        this.prdSn = prdSn;
    }

    public String getPrdCodes() {
        return this.prdCodes;
    }

    public void setPrdCodes(String prdCodes) {
        this.prdCodes = prdCodes;
    }

    public String getPrdSpecs() {
        return this.prdSpecs;
    }

    public void setPrdSpecs(String prdSpecs) {
        this.prdSpecs = prdSpecs;
    }

    public String getPrdDesc() {
        return this.prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public Byte getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Byte getSelfFlag() {
        return this.selfFlag;
    }

    public void setSelfFlag(Byte selfFlag) {
        this.selfFlag = selfFlag;
    }

    public String getLowShopPrice() {
        return this.lowShopPrice;
    }

    public void setLowShopPrice(String lowShopPrice) {
        this.lowShopPrice = lowShopPrice;
    }

    public String getPrdImg() {
        return this.prdImg;
    }

    public void setPrdImg(String prdImg) {
        this.prdImg = prdImg;
    }

    public Byte getPriceFlag() {
        return this.priceFlag;
    }

    public void setPriceFlag(Byte priceFlag) {
        this.priceFlag = priceFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GoodsSpecProduct (");

        sb.append(prdId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(prdPrice);
        sb.append(", ").append(prdMarketPrice);
        sb.append(", ").append(prdCostPrice);
        sb.append(", ").append(prdNumber);
        sb.append(", ").append(prdSn);
        sb.append(", ").append(prdCodes);
        sb.append(", ").append(prdSpecs);
        sb.append(", ").append(prdDesc);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(selfFlag);
        sb.append(", ").append(lowShopPrice);
        sb.append(", ").append(prdImg);
        sb.append(", ").append(priceFlag);

        sb.append(")");
        return sb.toString();
    }
}
