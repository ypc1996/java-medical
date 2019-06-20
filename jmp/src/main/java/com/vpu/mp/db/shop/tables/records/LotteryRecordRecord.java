/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.LotteryRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class LotteryRecordRecord extends UpdatableRecordImpl<LotteryRecordRecord> implements Record16<Integer, Integer, Integer, Byte, Integer, Byte, String, Byte, Byte, String, String, Timestamp, Integer, Byte, String, Timestamp> {

    private static final long serialVersionUID = 1911089911;

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.user_id</code>. 用户编号
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.user_id</code>. 用户编号
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_id</code>. 抽奖编号
     */
    public void setLotteryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_id</code>. 抽奖编号
     */
    public Integer getLotteryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_source</code>. 抽奖来源:1.登录2.支付
     */
    public void setLotterySource(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_source</code>. 抽奖来源:1.登录2.支付
     */
    public Byte getLotterySource() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_act_id</code>. 抽奖来源id
     */
    public void setLotteryActId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_act_id</code>. 抽奖来源id
     */
    public Integer getLotteryActId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.chance_source</code>. 抽奖机会来源
     */
    public void setChanceSource(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.chance_source</code>. 抽奖机会来源
     */
    public Byte getChanceSource() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_cost</code>. 抽奖花费积分
     */
    public void setLotteryCost(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_cost</code>. 抽奖花费积分
     */
    public String getLotteryCost() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_grade</code>. 中奖等级：0未中奖，1一等奖，2二等奖，3三等奖，4四等奖
     */
    public void setLotteryGrade(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_grade</code>. 中奖等级：0未中奖，1一等奖，2二等奖，3三等奖，4四等奖
     */
    public Byte getLotteryGrade() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_type</code>. 奖励类型
     */
    public void setLotteryType(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_type</code>. 奖励类型
     */
    public Byte getLotteryType() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_award</code>. 获得奖励
     */
    public void setLotteryAward(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_award</code>. 获得奖励
     */
    public String getLotteryAward() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.award_info</code>. 中奖信息
     */
    public void setAwardInfo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.award_info</code>. 中奖信息
     */
    public String getAwardInfo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.add_time</code>. 抽奖时间
     */
    public void setAddTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.add_time</code>. 抽奖时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.prd_id</code>. 商品（规格）编号
     */
    public void setPrdId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.prd_id</code>. 商品（规格）编号
     */
    public Integer getPrdId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.present_status</code>. 赠品状态:0.待领取，1：已领取，2.已过期
     */
    public void setPresentStatus(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.present_status</code>. 赠品状态:0.待领取，1：已领取，2.已过期
     */
    public Byte getPresentStatus() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.order_sn</code>. 关联订单
     */
    public void setOrderSn(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.order_sn</code>. 关联订单
     */
    public String getOrderSn() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_lottery_record.lottery_expired_time</code>. 赠品过期时间
     */
    public void setLotteryExpiredTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_lottery_record.lottery_expired_time</code>. 赠品过期时间
     */
    public Timestamp getLotteryExpiredTime() {
        return (Timestamp) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Byte, Integer, Byte, String, Byte, Byte, String, String, Timestamp, Integer, Byte, String, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Byte, Integer, Byte, String, Byte, Byte, String, String, Timestamp, Integer, Byte, String, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LotteryRecord.LOTTERY_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LotteryRecord.LOTTERY_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_ACT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return LotteryRecord.LOTTERY_RECORD.CHANCE_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_AWARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return LotteryRecord.LOTTERY_RECORD.AWARD_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return LotteryRecord.LOTTERY_RECORD.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return LotteryRecord.LOTTERY_RECORD.PRD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return LotteryRecord.LOTTERY_RECORD.PRESENT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return LotteryRecord.LOTTERY_RECORD.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return LotteryRecord.LOTTERY_RECORD.LOTTERY_EXPIRED_TIME;
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
    public Byte component4() {
        return getLotterySource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getLotteryActId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getChanceSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLotteryCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getLotteryGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getLotteryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLotteryAward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAwardInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getPresentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getLotteryExpiredTime();
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
    public Byte value4() {
        return getLotterySource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLotteryActId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getChanceSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLotteryCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getLotteryGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getLotteryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLotteryAward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAwardInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getPresentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getLotteryExpiredTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value3(Integer value) {
        setLotteryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value4(Byte value) {
        setLotterySource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value5(Integer value) {
        setLotteryActId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value6(Byte value) {
        setChanceSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value7(String value) {
        setLotteryCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value8(Byte value) {
        setLotteryGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value9(Byte value) {
        setLotteryType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value10(String value) {
        setLotteryAward(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value11(String value) {
        setAwardInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value12(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value13(Integer value) {
        setPrdId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value14(Byte value) {
        setPresentStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value15(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord value16(Timestamp value) {
        setLotteryExpiredTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryRecordRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Integer value5, Byte value6, String value7, Byte value8, Byte value9, String value10, String value11, Timestamp value12, Integer value13, Byte value14, String value15, Timestamp value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LotteryRecordRecord
     */
    public LotteryRecordRecord() {
        super(LotteryRecord.LOTTERY_RECORD);
    }

    /**
     * Create a detached, initialised LotteryRecordRecord
     */
    public LotteryRecordRecord(Integer id, Integer userId, Integer lotteryId, Byte lotterySource, Integer lotteryActId, Byte chanceSource, String lotteryCost, Byte lotteryGrade, Byte lotteryType, String lotteryAward, String awardInfo, Timestamp addTime, Integer prdId, Byte presentStatus, String orderSn, Timestamp lotteryExpiredTime) {
        super(LotteryRecord.LOTTERY_RECORD);

        set(0, id);
        set(1, userId);
        set(2, lotteryId);
        set(3, lotterySource);
        set(4, lotteryActId);
        set(5, chanceSource);
        set(6, lotteryCost);
        set(7, lotteryGrade);
        set(8, lotteryType);
        set(9, lotteryAward);
        set(10, awardInfo);
        set(11, addTime);
        set(12, prdId);
        set(13, presentStatus);
        set(14, orderSn);
        set(15, lotteryExpiredTime);
    }
}
