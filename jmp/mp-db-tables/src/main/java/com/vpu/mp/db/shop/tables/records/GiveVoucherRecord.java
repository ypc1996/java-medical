/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.GiveVoucher;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class GiveVoucherRecord extends UpdatableRecordImpl<GiveVoucherRecord> implements Record19<Integer, String, Integer, Integer, Integer, Integer, Integer, String, String, Integer, BigDecimal, BigDecimal, String, String, Byte, Byte, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -736834002;

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.act_name</code>. 活动名称
     */
    public void setActName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.act_name</code>. 活动名称
     */
    public String getActName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.number</code>. 参与人数
     */
    public void setNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.number</code>. 参与人数
     */
    public Integer getNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.have_pay</code>. 有交易记录
     */
    public void setHavePay(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.have_pay</code>. 有交易记录
     */
    public Integer getHavePay() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.no_pay</code>. 无交易记录
     */
    public void setNoPay(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.no_pay</code>. 无交易记录
     */
    public Integer getNoPay() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.max_count</code>. 购买次数大于
     */
    public void setMaxCount(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.max_count</code>. 购买次数大于
     */
    public Integer getMaxCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.min_count</code>. 购买次数小于
     */
    public void setMinCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.min_count</code>. 购买次数小于
     */
    public Integer getMinCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.card_id</code>. 会员卡
     */
    public void setCardId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.card_id</code>. 会员卡
     */
    public String getCardId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.tag_id</code>. 标签
     */
    public void setTagId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.tag_id</code>. 标签
     */
    public String getTagId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.act_id</code>. 优惠券
     */
    public void setActId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.act_id</code>. 优惠券
     */
    public Integer getActId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.max_ave_price</code>. 均价大于
     */
    public void setMaxAvePrice(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.max_ave_price</code>. 均价大于
     */
    public BigDecimal getMaxAvePrice() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.min_ave_price</code>. 均价小于
     */
    public void setMinAvePrice(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.min_ave_price</code>. 均价小于
     */
    public BigDecimal getMinAvePrice() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.user</code>. 手动添加会员
     */
    public void setUser(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.user</code>. 手动添加会员
     */
    public String getUser() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.send_condition</code>. 筛选发放人条件
     */
    public void setSendCondition(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.send_condition</code>. 筛选发放人条件
     */
    public String getSendCondition() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.send_status</code>. 发放状态:0未发放，1已发放
     */
    public void setSendStatus(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.send_status</code>. 发放状态:0未发放，1已发放
     */
    public Byte getSendStatus() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.send_action</code>. 发放类型:0立即发放，1定时发放
     */
    public void setSendAction(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.send_action</code>. 发放类型:0立即发放，1定时发放
     */
    public Byte getSendAction() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.start_time</code>. 发放开始时间
     */
    public void setStartTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.start_time</code>. 发放开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_give_voucher.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_give_voucher.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, Integer, Integer, Integer, Integer, Integer, String, String, Integer, BigDecimal, BigDecimal, String, String, Byte, Byte, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, Integer, Integer, Integer, Integer, Integer, String, String, Integer, BigDecimal, BigDecimal, String, String, Byte, Byte, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GiveVoucher.GIVE_VOUCHER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GiveVoucher.GIVE_VOUCHER.ACT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GiveVoucher.GIVE_VOUCHER.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GiveVoucher.GIVE_VOUCHER.HAVE_PAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GiveVoucher.GIVE_VOUCHER.NO_PAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GiveVoucher.GIVE_VOUCHER.MAX_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return GiveVoucher.GIVE_VOUCHER.MIN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GiveVoucher.GIVE_VOUCHER.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GiveVoucher.GIVE_VOUCHER.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return GiveVoucher.GIVE_VOUCHER.ACT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return GiveVoucher.GIVE_VOUCHER.MAX_AVE_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return GiveVoucher.GIVE_VOUCHER.MIN_AVE_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return GiveVoucher.GIVE_VOUCHER.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return GiveVoucher.GIVE_VOUCHER.SEND_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return GiveVoucher.GIVE_VOUCHER.SEND_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return GiveVoucher.GIVE_VOUCHER.SEND_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return GiveVoucher.GIVE_VOUCHER.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return GiveVoucher.GIVE_VOUCHER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return GiveVoucher.GIVE_VOUCHER.UPDATE_TIME;
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
    public String component2() {
        return getActName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getHavePay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNoPay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getMaxCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getMinCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getActId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getMaxAvePrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getMinAvePrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSendCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getSendStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getSendAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
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
    public String value2() {
        return getActName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getHavePay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNoPay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMaxCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMinCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getActId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getMaxAvePrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getMinAvePrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSendCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getSendStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getSendAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value2(String value) {
        setActName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value3(Integer value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value4(Integer value) {
        setHavePay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value5(Integer value) {
        setNoPay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value6(Integer value) {
        setMaxCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value7(Integer value) {
        setMinCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value8(String value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value9(String value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value10(Integer value) {
        setActId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value11(BigDecimal value) {
        setMaxAvePrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value12(BigDecimal value) {
        setMinAvePrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value13(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value14(String value) {
        setSendCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value15(Byte value) {
        setSendStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value16(Byte value) {
        setSendAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value17(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord value19(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GiveVoucherRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, String value8, String value9, Integer value10, BigDecimal value11, BigDecimal value12, String value13, String value14, Byte value15, Byte value16, Timestamp value17, Timestamp value18, Timestamp value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GiveVoucherRecord
     */
    public GiveVoucherRecord() {
        super(GiveVoucher.GIVE_VOUCHER);
    }

    /**
     * Create a detached, initialised GiveVoucherRecord
     */
    public GiveVoucherRecord(Integer id, String actName, Integer number, Integer havePay, Integer noPay, Integer maxCount, Integer minCount, String cardId, String tagId, Integer actId, BigDecimal maxAvePrice, BigDecimal minAvePrice, String user, String sendCondition, Byte sendStatus, Byte sendAction, Timestamp startTime, Timestamp createTime, Timestamp updateTime) {
        super(GiveVoucher.GIVE_VOUCHER);

        set(0, id);
        set(1, actName);
        set(2, number);
        set(3, havePay);
        set(4, noPay);
        set(5, maxCount);
        set(6, minCount);
        set(7, cardId);
        set(8, tagId);
        set(9, actId);
        set(10, maxAvePrice);
        set(11, minAvePrice);
        set(12, user);
        set(13, sendCondition);
        set(14, sendStatus);
        set(15, sendAction);
        set(16, startTime);
        set(17, createTime);
        set(18, updateTime);
    }
}
