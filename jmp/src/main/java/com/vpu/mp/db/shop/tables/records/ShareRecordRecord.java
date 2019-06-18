/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.ShareRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ShareRecordRecord extends UpdatableRecordImpl<ShareRecordRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Integer> {

    private static final long serialVersionUID = -1934488834;

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.activity_id</code>. 活动id或商品id
     */
    public void setActivityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.activity_id</code>. 活动id或商品id
     */
    public Integer getActivityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.activity_type</code>. 活动类型
     */
    public void setActivityType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.activity_type</code>. 活动类型
     */
    public Integer getActivityType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.add_time</code>. 浏览时间
     */
    public void setAddTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.add_time</code>. 浏览时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_share_record.count</code>. 次数
     */
    public void setCount(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_share_record.count</code>. 次数
     */
    public Integer getCount() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShareRecord.SHARE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShareRecord.SHARE_RECORD.ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShareRecord.SHARE_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShareRecord.SHARE_RECORD.ACTIVITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ShareRecord.SHARE_RECORD.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ShareRecord.SHARE_RECORD.COUNT;
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCount();
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
        return getActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getActivityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value2(Integer value) {
        setActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value4(Integer value) {
        setActivityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value5(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord value6(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareRecordRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShareRecordRecord
     */
    public ShareRecordRecord() {
        super(ShareRecord.SHARE_RECORD);
    }

    /**
     * Create a detached, initialised ShareRecordRecord
     */
    public ShareRecordRecord(Integer id, Integer activityId, Integer userId, Integer activityType, Timestamp addTime, Integer count) {
        super(ShareRecord.SHARE_RECORD);

        set(0, id);
        set(1, activityId);
        set(2, userId);
        set(3, activityType);
        set(4, addTime);
        set(5, count);
    }
}
