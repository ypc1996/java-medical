/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.PinIntegrationDefine;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class PinIntegrationDefineRecord extends UpdatableRecordImpl<PinIntegrationDefineRecord> implements Record20<Integer, Integer, String, Integer, Integer, Short, Short, Byte, Timestamp, Timestamp, Byte, Timestamp, Timestamp, Byte, Integer, Integer, Byte, Double, Byte, String> {

    private static final long serialVersionUID = 1910002743;

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.name</code>. 活动名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.name</code>. 活动名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.inte_total</code>. 总抽奖积分
     */
    public void setInteTotal(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.inte_total</code>. 总抽奖积分
     */
    public Integer getInteTotal() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.inte_group</code>. 每个团总积分
     */
    public void setInteGroup(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.inte_group</code>. 每个团总积分
     */
    public Integer getInteGroup() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.limit_amount</code>. 成团人数
     */
    public void setLimitAmount(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.limit_amount</code>. 成团人数
     */
    public Short getLimitAmount() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.join_limit</code>. 参团限制
     */
    public void setJoinLimit(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.join_limit</code>. 参团限制
     */
    public Short getJoinLimit() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.divide_type</code>. 瓜分方式：0：按邀请好友数量瓜分，1：好友均分，2：随机瓜分
     */
    public void setDivideType(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.divide_type</code>. 瓜分方式：0：按邀请好友数量瓜分，1：好友均分，2：随机瓜分
     */
    public Byte getDivideType() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.start_time</code>. 开始时间
     */
    public void setStartTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.end_time</code>. 结束时间
     */
    public void setEndTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.end_time</code>. 结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public void setStatus(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public Byte getStatus() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.add_time</code>.
     */
    public void setAddTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.add_time</code>.
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.del_time</code>.
     */
    public void setDelTime(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.del_time</code>.
     */
    public Integer getDelTime() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.inte_remain</code>. 剩余积分
     */
    public void setInteRemain(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.inte_remain</code>. 剩余积分
     */
    public Integer getInteRemain() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.is_day_divide</code>. 是否开团24小时自动开奖
     */
    public void setIsDayDivide(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.is_day_divide</code>. 是否开团24小时自动开奖
     */
    public Byte getIsDayDivide() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.param_n</code>. 常数n
     */
    public void setParamN(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.param_n</code>. 常数n
     */
    public Double getParamN() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.is_continue</code>. 继续： 1：继续  0： 结束
     */
    public void setIsContinue(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.is_continue</code>. 继续： 1：继续  0： 结束
     */
    public Byte getIsContinue() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_pin_integration_define.advertise</code>. 活动宣传语
     */
    public void setAdvertise(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_pin_integration_define.advertise</code>. 活动宣传语
     */
    public String getAdvertise() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, String, Integer, Integer, Short, Short, Byte, Timestamp, Timestamp, Byte, Timestamp, Timestamp, Byte, Integer, Integer, Byte, Double, Byte, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, String, Integer, Integer, Short, Short, Byte, Timestamp, Timestamp, Byte, Timestamp, Timestamp, Byte, Integer, Integer, Byte, Double, Byte, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.INTE_TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.INTE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.LIMIT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.JOIN_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.DIVIDE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.INTE_REMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.IS_DAY_DIVIDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.PARAM_N;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field19() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.IS_CONTINUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return PinIntegrationDefine.PIN_INTEGRATION_DEFINE.ADVERTISE;
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
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getInteTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getInteGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getLimitAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getJoinLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getDivideType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getStatus();
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
    public Timestamp component13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getInteRemain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component17() {
        return getIsDayDivide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component18() {
        return getParamN();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component19() {
        return getIsContinue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getAdvertise();
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
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getInteTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getInteGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getLimitAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getJoinLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDivideType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getStatus();
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
    public Timestamp value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getInteRemain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getIsDayDivide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getParamN();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value19() {
        return getIsContinue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getAdvertise();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value4(Integer value) {
        setInteTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value5(Integer value) {
        setInteGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value6(Short value) {
        setLimitAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value7(Short value) {
        setJoinLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value8(Byte value) {
        setDivideType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value9(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value10(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value11(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value12(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value14(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value15(Integer value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value16(Integer value) {
        setInteRemain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value17(Byte value) {
        setIsDayDivide(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value18(Double value) {
        setParamN(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value19(Byte value) {
        setIsContinue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord value20(String value) {
        setAdvertise(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefineRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Short value6, Short value7, Byte value8, Timestamp value9, Timestamp value10, Byte value11, Timestamp value12, Timestamp value13, Byte value14, Integer value15, Integer value16, Byte value17, Double value18, Byte value19, String value20) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PinIntegrationDefineRecord
     */
    public PinIntegrationDefineRecord() {
        super(PinIntegrationDefine.PIN_INTEGRATION_DEFINE);
    }

    /**
     * Create a detached, initialised PinIntegrationDefineRecord
     */
    public PinIntegrationDefineRecord(Integer id, Integer shopId, String name, Integer inteTotal, Integer inteGroup, Short limitAmount, Short joinLimit, Byte divideType, Timestamp startTime, Timestamp endTime, Byte status, Timestamp addTime, Timestamp updateTime, Byte delFlag, Integer delTime, Integer inteRemain, Byte isDayDivide, Double paramN, Byte isContinue, String advertise) {
        super(PinIntegrationDefine.PIN_INTEGRATION_DEFINE);

        set(0, id);
        set(1, shopId);
        set(2, name);
        set(3, inteTotal);
        set(4, inteGroup);
        set(5, limitAmount);
        set(6, joinLimit);
        set(7, divideType);
        set(8, startTime);
        set(9, endTime);
        set(10, status);
        set(11, addTime);
        set(12, updateTime);
        set(13, delFlag);
        set(14, delTime);
        set(15, inteRemain);
        set(16, isDayDivide);
        set(17, paramN);
        set(18, isContinue);
        set(19, advertise);
    }
}
