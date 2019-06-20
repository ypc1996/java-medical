/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.ReducePriceProduct;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ReducePriceProductRecord extends UpdatableRecordImpl<ReducePriceProductRecord> implements Record5<Integer, Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = -374530374;

    /**
     * Setter for <code>mini_shop_471752.b2c_reduce_price_product.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_reduce_price_product.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_reduce_price_product.reduce_price_id</code>. 限时减价活动ID
     */
    public void setReducePriceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_reduce_price_product.reduce_price_id</code>. 限时减价活动ID
     */
    public Integer getReducePriceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_reduce_price_product.goods_id</code>. 商品ID
     */
    public void setGoodsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_reduce_price_product.goods_id</code>. 商品ID
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_reduce_price_product.product_id</code>. 规格ID
     */
    public void setProductId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_reduce_price_product.product_id</code>. 规格ID
     */
    public Integer getProductId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_reduce_price_product.prd_price</code>. 折后价格
     */
    public void setPrdPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_reduce_price_product.prd_price</code>. 折后价格
     */
    public BigDecimal getPrdPrice() {
        return (BigDecimal) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReducePriceProduct.REDUCE_PRICE_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReducePriceProduct.REDUCE_PRICE_PRODUCT.REDUCE_PRICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReducePriceProduct.REDUCE_PRICE_PRODUCT.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReducePriceProduct.REDUCE_PRICE_PRODUCT.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ReducePriceProduct.REDUCE_PRICE_PRODUCT.PRD_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getReducePriceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getPrdPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getReducePriceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPrdPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord value2(Integer value) {
        setReducePriceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord value4(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord value5(BigDecimal value) {
        setPrdPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProductRecord values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReducePriceProductRecord
     */
    public ReducePriceProductRecord() {
        super(ReducePriceProduct.REDUCE_PRICE_PRODUCT);
    }

    /**
     * Create a detached, initialised ReducePriceProductRecord
     */
    public ReducePriceProductRecord(Integer id, Integer reducePriceId, Integer goodsId, Integer productId, BigDecimal prdPrice) {
        super(ReducePriceProduct.REDUCE_PRICE_PRODUCT);

        set(0, id);
        set(1, reducePriceId);
        set(2, goodsId);
        set(3, productId);
        set(4, prdPrice);
    }
}
