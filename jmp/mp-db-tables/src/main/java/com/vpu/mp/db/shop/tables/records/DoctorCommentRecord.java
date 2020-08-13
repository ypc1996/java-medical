/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.DoctorComment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 医师评价和打分
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorCommentRecord extends UpdatableRecordImpl<DoctorCommentRecord> implements Record14<Integer, Integer, String, Integer, Integer, Byte, Byte, String, String, String, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -844127083;

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.user_id</code>. 用户ID
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.user_id</code>. 用户ID
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.user_name</code>. 用户昵称
     */
    public void setUserName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.user_name</code>. 用户昵称
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.doctor_id</code>. 医师id
     */
    public void setDoctorId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.doctor_id</code>. 医师id
     */
    public Integer getDoctorId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.stars</code>. 评价星级1~5
     */
    public void setStars(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.stars</code>. 评价星级1~5
     */
    public Byte getStars() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.is_anonymou</code>. 匿名状态 0.未匿名；1.匿名
     */
    public void setIsAnonymou(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.is_anonymou</code>. 匿名状态 0.未匿名；1.匿名
     */
    public Byte getIsAnonymou() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.tag</code>. 评价标签
     */
    public void setTag(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.tag</code>. 评价标签
     */
    public String getTag() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.comm_note</code>. 评论内容
     */
    public void setCommNote(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.comm_note</code>. 评论内容
     */
    public String getCommNote() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.audit_status</code>. 0:未审批,1:审批通过,2:审批未通过
     */
    public void setAuditStatus(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.audit_status</code>. 0:未审批,1:审批通过,2:审批未通过
     */
    public Byte getAuditStatus() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor_comment.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor_comment.update_time</code>. 最后修改时间
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
    public Row14<Integer, Integer, String, Integer, Integer, Byte, Byte, String, String, String, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Integer, Integer, Byte, Byte, String, String, String, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DoctorComment.DOCTOR_COMMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DoctorComment.DOCTOR_COMMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DoctorComment.DOCTOR_COMMENT.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DoctorComment.DOCTOR_COMMENT.PATIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DoctorComment.DOCTOR_COMMENT.DOCTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return DoctorComment.DOCTOR_COMMENT.STARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return DoctorComment.DOCTOR_COMMENT.IS_ANONYMOU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DoctorComment.DOCTOR_COMMENT.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DoctorComment.DOCTOR_COMMENT.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DoctorComment.DOCTOR_COMMENT.COMM_NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return DoctorComment.DOCTOR_COMMENT.AUDIT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return DoctorComment.DOCTOR_COMMENT.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return DoctorComment.DOCTOR_COMMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return DoctorComment.DOCTOR_COMMENT.UPDATE_TIME;
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
    public String component3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getStars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsAnonymou();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCommNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getAuditStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getIsDelete();
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStars();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsAnonymou();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCommNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getAuditStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsDelete();
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
    public DoctorCommentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value4(Integer value) {
        setPatientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value5(Integer value) {
        setDoctorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value6(Byte value) {
        setStars(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value7(Byte value) {
        setIsAnonymou(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value8(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value9(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value10(String value) {
        setCommNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value11(Byte value) {
        setAuditStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value12(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorCommentRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Byte value6, Byte value7, String value8, String value9, String value10, Byte value11, Byte value12, Timestamp value13, Timestamp value14) {
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
     * Create a detached DoctorCommentRecord
     */
    public DoctorCommentRecord() {
        super(DoctorComment.DOCTOR_COMMENT);
    }

    /**
     * Create a detached, initialised DoctorCommentRecord
     */
    public DoctorCommentRecord(Integer id, Integer userId, String userName, Integer patientId, Integer doctorId, Byte stars, Byte isAnonymou, String tag, String orderSn, String commNote, Byte auditStatus, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(DoctorComment.DOCTOR_COMMENT);

        set(0, id);
        set(1, userId);
        set(2, userName);
        set(3, patientId);
        set(4, doctorId);
        set(5, stars);
        set(6, isAnonymou);
        set(7, tag);
        set(8, orderSn);
        set(9, commNote);
        set(10, auditStatus);
        set(11, isDelete);
        set(12, createTime);
        set(13, updateTime);
    }
}