/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.OrderGoodsRebate;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderGoodsRebateRecord extends UpdatableRecordImpl<OrderGoodsRebateRecord> implements Record11<UInteger, String, Integer, Integer, Byte, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1563801119;

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_id</code>.
     */
    public void setRebateId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_id</code>.
     */
    public UInteger getRebateId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.order_sn</code>. 订单UUID
     */
    public void setOrderSn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.order_sn</code>. 订单UUID
     */
    public String getOrderSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.goods_id</code>. 商品ID
     */
    public void setGoodsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.goods_id</code>. 商品ID
     */
    public Integer getGoodsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.product_id</code>. 产品ID
     */
    public void setProductId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.product_id</code>. 产品ID
     */
    public Integer getProductId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_level</code>. 返利级别：0自购，2二级
     */
    public void setRebateLevel(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_level</code>. 返利级别：0自购，2二级
     */
    public Byte getRebateLevel() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_user_id</code>. 返利用户ID
     */
    public void setRebateUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_user_id</code>. 返利用户ID
     */
    public Integer getRebateUserId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_percent</code>. 返利比例
     */
    public void setRebatePercent(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_percent</code>. 返利比例
     */
    public BigDecimal getRebatePercent() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_money</code>. 单商品返利金额
     */
    public void setRebateMoney(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.rebate_money</code>. 单商品返利金额
     */
    public BigDecimal getRebateMoney() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.total_rebate_money</code>. 总返利金额
     */
    public void setTotalRebateMoney(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.total_rebate_money</code>. 总返利金额
     */
    public BigDecimal getTotalRebateMoney() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_order_goods_rebate.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_order_goods_rebate.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, String, Integer, Integer, Byte, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<UInteger, String, Integer, Integer, Byte, Integer, BigDecimal, BigDecimal, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.REBATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.REBATE_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.REBATE_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.REBATE_PERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.REBATE_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.TOTAL_REBATE_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return OrderGoodsRebate.ORDER_GOODS_REBATE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getRebateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOrderSn();
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
    public Byte component5() {
        return getRebateLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRebateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getRebatePercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getTotalRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getRebateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOrderSn();
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
    public Byte value5() {
        return getRebateLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRebateUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getRebatePercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getTotalRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value1(UInteger value) {
        setRebateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value2(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value3(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value4(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value5(Byte value) {
        setRebateLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value6(Integer value) {
        setRebateUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value7(BigDecimal value) {
        setRebatePercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value8(BigDecimal value) {
        setRebateMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value9(BigDecimal value) {
        setTotalRebateMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value10(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoodsRebateRecord values(UInteger value1, String value2, Integer value3, Integer value4, Byte value5, Integer value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, Timestamp value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderGoodsRebateRecord
     */
    public OrderGoodsRebateRecord() {
        super(OrderGoodsRebate.ORDER_GOODS_REBATE);
    }

    /**
     * Create a detached, initialised OrderGoodsRebateRecord
     */
    public OrderGoodsRebateRecord(UInteger rebateId, String orderSn, Integer goodsId, Integer productId, Byte rebateLevel, Integer rebateUserId, BigDecimal rebatePercent, BigDecimal rebateMoney, BigDecimal totalRebateMoney, Timestamp addTime, Timestamp updateTime) {
        super(OrderGoodsRebate.ORDER_GOODS_REBATE);

        set(0, rebateId);
        set(1, orderSn);
        set(2, goodsId);
        set(3, productId);
        set(4, rebateLevel);
        set(5, rebateUserId);
        set(6, rebatePercent);
        set(7, rebateMoney);
        set(8, totalRebateMoney);
        set(9, addTime);
        set(10, updateTime);
    }
}
