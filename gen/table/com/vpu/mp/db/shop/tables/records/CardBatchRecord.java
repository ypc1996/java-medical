/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.CardBatch;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class CardBatchRecord extends UpdatableRecordImpl<CardBatchRecord> implements Record14<Integer, Integer, Byte, String, Byte, Byte, Byte, Integer, String, String, Byte, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2036410409;

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.card_id</code>. 卡号id
     */
    public void setCardId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.card_id</code>. 卡号id
     */
    public Integer getCardId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.action</code>. 领取码获得方式 1：自动生成 2：导入
     */
    public void setAction(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.action</code>. 领取码获得方式 1：自动生成 2：导入
     */
    public Byte getAction() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.name</code>. 批次名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.name</code>. 批次名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.code_size</code>. 领取码位数
     */
    public void setCodeSize(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.code_size</code>. 领取码位数
     */
    public Byte getCodeSize() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.card_size</code>. 卡号位数
     */
    public void setCardSize(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.card_size</code>. 卡号位数
     */
    public Byte getCardSize() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.card_pwd_size</code>. 卡密码位数
     */
    public void setCardPwdSize(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.card_pwd_size</code>. 卡密码位数
     */
    public Byte getCardPwdSize() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.number</code>. 发放数量
     */
    public void setNumber(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.number</code>. 发放数量
     */
    public Integer getNumber() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.code_prefix</code>. 领取码前缀
     */
    public void setCodePrefix(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.code_prefix</code>. 领取码前缀
     */
    public String getCodePrefix() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.card_prefix</code>. 卡前缀
     */
    public void setCardPrefix(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.card_prefix</code>. 卡前缀
     */
    public String getCardPrefix() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.del_time</code>. 删除时间
     */
    public void setDelTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.del_time</code>. 删除时间
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_card_batch.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_card_batch.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Byte, String, Byte, Byte, Byte, Integer, String, String, Byte, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Byte, String, Byte, Byte, Byte, Integer, String, String, Byte, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CardBatch.CARD_BATCH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CardBatch.CARD_BATCH.CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CardBatch.CARD_BATCH.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CardBatch.CARD_BATCH.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return CardBatch.CARD_BATCH.CODE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return CardBatch.CARD_BATCH.CARD_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return CardBatch.CARD_BATCH.CARD_PWD_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CardBatch.CARD_BATCH.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CardBatch.CARD_BATCH.CODE_PREFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CardBatch.CARD_BATCH.CARD_PREFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return CardBatch.CARD_BATCH.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CardBatch.CARD_BATCH.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return CardBatch.CARD_BATCH.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CardBatch.CARD_BATCH.UPDATE_TIME;
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
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getCodeSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getCardSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getCardPwdSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCodePrefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCardPrefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
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
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getCodeSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getCardSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getCardPwdSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCodePrefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCardPrefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value2(Integer value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value3(Byte value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value5(Byte value) {
        setCodeSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value6(Byte value) {
        setCardSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value7(Byte value) {
        setCardPwdSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value8(Integer value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value9(String value) {
        setCodePrefix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value10(String value) {
        setCardPrefix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value11(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value12(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CardBatchRecord values(Integer value1, Integer value2, Byte value3, String value4, Byte value5, Byte value6, Byte value7, Integer value8, String value9, String value10, Byte value11, Timestamp value12, Timestamp value13, Timestamp value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CardBatchRecord
     */
    public CardBatchRecord() {
        super(CardBatch.CARD_BATCH);
    }

    /**
     * Create a detached, initialised CardBatchRecord
     */
    public CardBatchRecord(Integer id, Integer cardId, Byte action, String name, Byte codeSize, Byte cardSize, Byte cardPwdSize, Integer number, String codePrefix, String cardPrefix, Byte delFlag, Timestamp delTime, Timestamp createTime, Timestamp updateTime) {
        super(CardBatch.CARD_BATCH);

        set(0, id);
        set(1, cardId);
        set(2, action);
        set(3, name);
        set(4, codeSize);
        set(5, cardSize);
        set(6, cardPwdSize);
        set(7, number);
        set(8, codePrefix);
        set(9, cardPrefix);
        set(10, delFlag);
        set(11, delTime);
        set(12, createTime);
        set(13, updateTime);
    }
}
