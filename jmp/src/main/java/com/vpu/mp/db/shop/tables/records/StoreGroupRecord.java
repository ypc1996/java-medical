/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.StoreGroup;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class StoreGroupRecord extends UpdatableRecordImpl<StoreGroupRecord> implements Record3<Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 1953133944;

    /**
     * Setter for <code>mini_shop_1.b2c_store_group.store_id</code>.
     */
    public void setStoreId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_group.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_group.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_group.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_group.add_time</code>.
     */
    public void setAddTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_group.add_time</code>.
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StoreGroup.STORE_GROUP.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StoreGroup.STORE_GROUP.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return StoreGroup.STORE_GROUP.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroupRecord value1(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroupRecord value2(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroupRecord value3(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGroupRecord values(Integer value1, Integer value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreGroupRecord
     */
    public StoreGroupRecord() {
        super(StoreGroup.STORE_GROUP);
    }

    /**
     * Create a detached, initialised StoreGroupRecord
     */
    public StoreGroupRecord(Integer storeId, Integer groupId, Timestamp addTime) {
        super(StoreGroup.STORE_GROUP);

        set(0, storeId);
        set(1, groupId);
        set(2, addTime);
    }
}
