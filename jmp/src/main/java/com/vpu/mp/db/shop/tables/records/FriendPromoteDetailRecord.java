/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.FriendPromoteDetail;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class FriendPromoteDetailRecord extends UpdatableRecordImpl<FriendPromoteDetailRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1157512669;

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.launch_id</code>. 助力活动发起ID
     */
    public void setLaunchId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.launch_id</code>. 助力活动发起ID
     */
    public Integer getLaunchId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.user_id</code>. 助力会员ID
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.user_id</code>. 助力会员ID
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_id</code>. 助力活动ID
     */
    public void setPromoteId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_id</code>. 助力活动ID
     */
    public Integer getPromoteId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_value</code>. 助力值
     */
    public void setPromoteValue(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_value</code>. 助力值
     */
    public Integer getPromoteValue() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_time</code>. 助力时间
     */
    public void setPromoteTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.promote_time</code>. 助力时间
     */
    public Timestamp getPromoteTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_friend_promote_detail.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_friend_promote_detail.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.LAUNCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.PROMOTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.PROMOTE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.PROMOTE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return FriendPromoteDetail.FRIEND_PROMOTE_DETAIL.UPDATE_TIME;
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
        return getLaunchId();
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
        return getPromoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPromoteValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPromoteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdateTime();
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
        return getLaunchId();
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
        return getPromoteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPromoteValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPromoteTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value2(Integer value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value4(Integer value) {
        setPromoteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value5(Integer value) {
        setPromoteValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value6(Timestamp value) {
        setPromoteTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendPromoteDetailRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FriendPromoteDetailRecord
     */
    public FriendPromoteDetailRecord() {
        super(FriendPromoteDetail.FRIEND_PROMOTE_DETAIL);
    }

    /**
     * Create a detached, initialised FriendPromoteDetailRecord
     */
    public FriendPromoteDetailRecord(Integer id, Integer launchId, Integer userId, Integer promoteId, Integer promoteValue, Timestamp promoteTime, Timestamp updateTime) {
        super(FriendPromoteDetail.FRIEND_PROMOTE_DETAIL);

        set(0, id);
        set(1, launchId);
        set(2, userId);
        set(3, promoteId);
        set(4, promoteValue);
        set(5, promoteTime);
        set(6, updateTime);
    }
}
