/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.LotteryShare;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class LotteryShareRecord extends UpdatableRecordImpl<LotteryShareRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -912473704;

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.user_id</code>. 用户编号
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.user_id</code>. 用户编号
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.lottery_id</code>. 抽奖编号
     */
    public void setLotteryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.lottery_id</code>. 抽奖编号
     */
    public Integer getLotteryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.share_times</code>. 分享次数
     */
    public void setShareTimes(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.share_times</code>. 分享次数
     */
    public Integer getShareTimes() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.use_share_times</code>. 抽奖次数
     */
    public void setUseShareTimes(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.use_share_times</code>. 抽奖次数
     */
    public Integer getUseShareTimes() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.use_score_times</code>.
     */
    public void setUseScoreTimes(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.use_score_times</code>.
     */
    public Integer getUseScoreTimes() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_share.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_share.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LotteryShare.LOTTERY_SHARE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LotteryShare.LOTTERY_SHARE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LotteryShare.LOTTERY_SHARE.LOTTERY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return LotteryShare.LOTTERY_SHARE.SHARE_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LotteryShare.LOTTERY_SHARE.USE_SHARE_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return LotteryShare.LOTTERY_SHARE.USE_SCORE_TIMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return LotteryShare.LOTTERY_SHARE.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return LotteryShare.LOTTERY_SHARE.UPDATE_TIME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLotteryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getShareTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUseShareTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUseScoreTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLotteryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getShareTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUseShareTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUseScoreTimes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value3(Integer value) {
        setLotteryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value4(Integer value) {
        setShareTimes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value5(Integer value) {
        setUseShareTimes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value6(Integer value) {
        setUseScoreTimes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value7(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryShareRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LotteryShareRecord
     */
    public LotteryShareRecord() {
        super(LotteryShare.LOTTERY_SHARE);
    }

    /**
     * Create a detached, initialised LotteryShareRecord
     */
    public LotteryShareRecord(Integer id, Integer userId, Integer lotteryId, Integer shareTimes, Integer useShareTimes, Integer useScoreTimes, Timestamp addTime, Timestamp updateTime) {
        super(LotteryShare.LOTTERY_SHARE);

        set(0, id);
        set(1, userId);
        set(2, lotteryId);
        set(3, shareTimes);
        set(4, useShareTimes);
        set(5, useScoreTimes);
        set(6, addTime);
        set(7, updateTime);
    }
}
