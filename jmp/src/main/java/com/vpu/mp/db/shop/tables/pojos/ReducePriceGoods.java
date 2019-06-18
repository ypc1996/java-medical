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
public class ReducePriceGoods implements Serializable {

    private static final long serialVersionUID = -1301994421;

    private Integer    id;
    private Integer    reducePriceId;
    private Integer    goodsId;
    private BigDecimal discount;
    private BigDecimal reducePrice;
    private BigDecimal goodsPrice;
    private Byte       isChecked;

    public ReducePriceGoods() {}

    public ReducePriceGoods(ReducePriceGoods value) {
        this.id = value.id;
        this.reducePriceId = value.reducePriceId;
        this.goodsId = value.goodsId;
        this.discount = value.discount;
        this.reducePrice = value.reducePrice;
        this.goodsPrice = value.goodsPrice;
        this.isChecked = value.isChecked;
    }

    public ReducePriceGoods(
        Integer    id,
        Integer    reducePriceId,
        Integer    goodsId,
        BigDecimal discount,
        BigDecimal reducePrice,
        BigDecimal goodsPrice,
        Byte       isChecked
    ) {
        this.id = id;
        this.reducePriceId = reducePriceId;
        this.goodsId = goodsId;
        this.discount = discount;
        this.reducePrice = reducePrice;
        this.goodsPrice = goodsPrice;
        this.isChecked = isChecked;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReducePriceId() {
        return this.reducePriceId;
    }

    public void setReducePriceId(Integer reducePriceId) {
        this.reducePriceId = reducePriceId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getReducePrice() {
        return this.reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    public BigDecimal getGoodsPrice() {
        return this.goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Byte getIsChecked() {
        return this.isChecked;
    }

    public void setIsChecked(Byte isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReducePriceGoods (");

        sb.append(id);
        sb.append(", ").append(reducePriceId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(discount);
        sb.append(", ").append(reducePrice);
        sb.append(", ").append(goodsPrice);
        sb.append(", ").append(isChecked);

        sb.append(")");
        return sb.toString();
    }
}
