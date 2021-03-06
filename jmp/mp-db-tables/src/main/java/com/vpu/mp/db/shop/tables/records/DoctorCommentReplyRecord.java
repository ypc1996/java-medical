/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.DoctorCommentReply;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 医师评价回复
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorCommentReplyRecord extends UpdatableRecordImpl<DoctorCommentReplyRecord> implements Record6<Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 426777562;

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.comment_id</code>. 医师评价表id
     */
    public void setCommentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.comment_id</code>. 医师评价表id
     */
    public Integer getCommentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.reply_note</code>. 回复内容
     */
    public void setReplyNote(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.reply_note</code>. 回复内容
     */
    public String getReplyNote() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.is_delete</code>. 删除
     */
    public void setIsDelete(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.is_delete</code>. 删除
     */
    public Byte getIsDelete() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment_reply.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment_reply.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    public Row6<Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.REPLY_NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return DoctorCommentReply.DOCTOR_COMMENT_REPLY.UPDATE_TIME;
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
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReplyNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReplyNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value2(Integer value) {
        setCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value3(String value) {
        setReplyNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value4(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentReplyRecord values(Integer value1, Integer value2, String value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached DoctorCommentReplyRecord
     */
    public DoctorCommentReplyRecord() {
        super(DoctorCommentReply.DOCTOR_COMMENT_REPLY);
    }

    /**
     * Create a detached, initialised DoctorCommentReplyRecord
     */
    public DoctorCommentReplyRecord(Integer id, Integer commentId, String replyNote, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(DoctorCommentReply.DOCTOR_COMMENT_REPLY);

        set(0, id);
        set(1, commentId);
        set(2, replyNote);
        set(3, isDelete);
        set(4, createTime);
        set(5, updateTime);
    }
}
