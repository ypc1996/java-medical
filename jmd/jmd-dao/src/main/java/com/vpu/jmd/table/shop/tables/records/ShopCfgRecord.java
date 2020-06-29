/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.shop.tables.records;


import com.vpu.jmd.table.shop.tables.ShopCfg;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class ShopCfgRecord extends UpdatableRecordImpl<ShopCfgRecord> implements Record5<Short, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1277985830;

    /**
     * Setter for <code>mini_shop_471752.b2c_shop_cfg.rec_id</code>.
     */
    public void setRecId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_shop_cfg.rec_id</code>.
     */
    public Short getRecId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_shop_cfg.k</code>.
     */
    public void setK(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_shop_cfg.k</code>.
     */
    public String getK() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_shop_cfg.v</code>.
     */
    public void setV(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_shop_cfg.v</code>.
     */
    public String getV() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_shop_cfg.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_shop_cfg.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_shop_cfg.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_shop_cfg.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Short, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Short, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return ShopCfg.SHOP_CFG.REC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ShopCfg.SHOP_CFG.K;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ShopCfg.SHOP_CFG.V;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ShopCfg.SHOP_CFG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ShopCfg.SHOP_CFG.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getK();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getV();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getK();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getV();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord value1(Short value) {
        setRecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord value2(String value) {
        setK(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord value3(String value) {
        setV(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfgRecord values(Short value1, String value2, String value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached ShopCfgRecord
     */
    public ShopCfgRecord() {
        super(ShopCfg.SHOP_CFG);
    }

    /**
     * Create a detached, initialised ShopCfgRecord
     */
    public ShopCfgRecord(Short recId, String k, String v, Timestamp createTime, Timestamp updateTime) {
        super(ShopCfg.SHOP_CFG);

        set(0, recId);
        set(1, k);
        set(2, v);
        set(3, createTime);
        set(4, updateTime);
    }
}
