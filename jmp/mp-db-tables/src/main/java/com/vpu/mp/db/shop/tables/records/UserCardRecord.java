/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.UserCard;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 会员绑定的会员卡信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCardRecord extends UpdatableRecordImpl<UserCardRecord> implements Record13<Integer, Integer, Byte, String, Timestamp, Byte, BigDecimal, Integer, Timestamp, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1847958786;

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.user_id</code>. 会员id
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.user_id</code>. 会员id
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.card_id</code>. 会员卡id
     */
    public void setCardId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.card_id</code>. 会员卡id
     */
    public Integer getCardId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.flag</code>. 0:正常，1:删除
     */
    public void setFlag(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.flag</code>. 0:正常，1:删除
     */
    public Byte getFlag() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.card_no</code>. 会员卡号
     */
    public void setCardNo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.card_no</code>. 会员卡号
     */
    public String getCardNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.expire_time</code>.
     */
    public void setExpireTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.expire_time</code>.
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.is_default</code>. 1:默认会员卡
     */
    public void setIsDefault(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.is_default</code>. 1:默认会员卡
     */
    public Byte getIsDefault() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.money</code>. 卡余额
     */
    public void setMoney(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.money</code>. 卡余额
     */
    public BigDecimal getMoney() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.surplus</code>. 卡剩余次数
     */
    public void setSurplus(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.surplus</code>. 卡剩余次数
     */
    public Integer getSurplus() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.activation_time</code>. 激活时间
     */
    public void setActivationTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.activation_time</code>. 激活时间
     */
    public Timestamp getActivationTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.exchang_surplus</code>. 卡剩余兑换次数
     */
    public void setExchangSurplus(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.exchang_surplus</code>. 卡剩余兑换次数
     */
    public Integer getExchangSurplus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>jmini_shop_666666.b2c_user_card.id</code>.
     */
    public void setId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>jmini_shop_666666.b2c_user_card.id</code>.
     */
    public Integer getId() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Byte, String, Timestamp, Byte, BigDecimal, Integer, Timestamp, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Byte, String, Timestamp, Byte, BigDecimal, Integer, Timestamp, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserCard.USER_CARD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserCard.USER_CARD.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return UserCard.USER_CARD.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserCard.USER_CARD.CARD_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserCard.USER_CARD.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return UserCard.USER_CARD.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return UserCard.USER_CARD.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UserCard.USER_CARD.SURPLUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return UserCard.USER_CARD.ACTIVATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UserCard.USER_CARD.EXCHANG_SURPLUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return UserCard.USER_CARD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return UserCard.USER_CARD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return UserCard.USER_CARD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCardNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSurplus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getActivationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getExchangSurplus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCardNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSurplus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getActivationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getExchangSurplus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value2(Integer value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value3(Byte value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value4(String value) {
        setCardNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value5(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value6(Byte value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value7(BigDecimal value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value8(Integer value) {
        setSurplus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value9(Timestamp value) {
        setActivationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value10(Integer value) {
        setExchangSurplus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord value13(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCardRecord values(Integer value1, Integer value2, Byte value3, String value4, Timestamp value5, Byte value6, BigDecimal value7, Integer value8, Timestamp value9, Integer value10, Timestamp value11, Timestamp value12, Integer value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserCardRecord
     */
    public UserCardRecord() {
        super(UserCard.USER_CARD);
    }

    /**
     * Create a detached, initialised UserCardRecord
     */
    public UserCardRecord(Integer userId, Integer cardId, Byte flag, String cardNo, Timestamp expireTime, Byte isDefault, BigDecimal money, Integer surplus, Timestamp activationTime, Integer exchangSurplus, Timestamp createTime, Timestamp updateTime, Integer id) {
        super(UserCard.USER_CARD);

        set(0, userId);
        set(1, cardId);
        set(2, flag);
        set(3, cardNo);
        set(4, expireTime);
        set(5, isDefault);
        set(6, money);
        set(7, surplus);
        set(8, activationTime);
        set(9, exchangSurplus);
        set(10, createTime);
        set(11, updateTime);
        set(12, id);
    }
}
