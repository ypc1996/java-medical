/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.ImSessionItem;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 问诊会话详情 记录每一条会话
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImSessionItemRecord extends UpdatableRecordImpl<ImSessionItemRecord> implements Record8<Integer, Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1209941702;

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.im_session_id</code>. 会话id
     */
    public void setImSessionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.im_session_id</code>. 会话id
     */
    public Integer getImSessionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.form_id</code>. 本条消息发起者id 医师id或用户userId
     */
    public void setFormId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.form_id</code>. 本条消息发起者id 医师id或用户userId
     */
    public Integer getFormId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.to_id</code>. 本跳消息接收者id  医师id或用户userId
     */
    public void setToId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.to_id</code>. 本跳消息接收者id  医师id或用户userId
     */
    public Integer getToId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.message</code>. 本条消息内容
     */
    public void setMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.message</code>. 本条消息内容
     */
    public String getMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.type</code>. 消息类型
     */
    public void setType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.type</code>. 消息类型
     */
    public Byte getType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.send_time</code>. 用户消息发送时间
     */
    public void setSendTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.send_time</code>. 用户消息发送时间
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_im_session_item.create_time</code>. 生成时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_im_session_item.create_time</code>. 生成时间
     */
    public Timestamp getCreateTime() {
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
    public Row8<Integer, Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ImSessionItem.IM_SESSION_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ImSessionItem.IM_SESSION_ITEM.IM_SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ImSessionItem.IM_SESSION_ITEM.FORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ImSessionItem.IM_SESSION_ITEM.TO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ImSessionItem.IM_SESSION_ITEM.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ImSessionItem.IM_SESSION_ITEM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ImSessionItem.IM_SESSION_ITEM.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ImSessionItem.IM_SESSION_ITEM.CREATE_TIME;
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
        return getImSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getToId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
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
        return getImSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getToId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value2(Integer value) {
        setImSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value3(Integer value) {
        setFormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value4(Integer value) {
        setToId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value5(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value6(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value7(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItemRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Byte value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached ImSessionItemRecord
     */
    public ImSessionItemRecord() {
        super(ImSessionItem.IM_SESSION_ITEM);
    }

    /**
     * Create a detached, initialised ImSessionItemRecord
     */
    public ImSessionItemRecord(Integer id, Integer imSessionId, Integer formId, Integer toId, String message, Byte type, Timestamp sendTime, Timestamp createTime) {
        super(ImSessionItem.IM_SESSION_ITEM);

        set(0, id);
        set(1, imSessionId);
        set(2, formId);
        set(3, toId);
        set(4, message);
        set(5, type);
        set(6, sendTime);
        set(7, createTime);
    }
}
