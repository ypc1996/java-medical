/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class GradePrd implements Serializable {

    private static final long serialVersionUID = 82587489;

    private UInteger   id;
    private UInteger   prdId;
    private UInteger   goodsId;
    private Integer    shopId;
    private BigDecimal gradePrice;
    private String     grade;

    public GradePrd() {}

    public GradePrd(GradePrd value) {
        this.id = value.id;
        this.prdId = value.prdId;
        this.goodsId = value.goodsId;
        this.shopId = value.shopId;
        this.gradePrice = value.gradePrice;
        this.grade = value.grade;
    }

    public GradePrd(
        UInteger   id,
        UInteger   prdId,
        UInteger   goodsId,
        Integer    shopId,
        BigDecimal gradePrice,
        String     grade
    ) {
        this.id = id;
        this.prdId = prdId;
        this.goodsId = goodsId;
        this.shopId = shopId;
        this.gradePrice = gradePrice;
        this.grade = grade;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public UInteger getPrdId() {
        return this.prdId;
    }

    public void setPrdId(UInteger prdId) {
        this.prdId = prdId;
    }

    public UInteger getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(UInteger goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public BigDecimal getGradePrice() {
        return this.gradePrice;
    }

    public void setGradePrice(BigDecimal gradePrice) {
        this.gradePrice = gradePrice;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GradePrd (");

        sb.append(id);
        sb.append(", ").append(prdId);
        sb.append(", ").append(goodsId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(gradePrice);
        sb.append(", ").append(grade);

        sb.append(")");
        return sb.toString();
    }
}
