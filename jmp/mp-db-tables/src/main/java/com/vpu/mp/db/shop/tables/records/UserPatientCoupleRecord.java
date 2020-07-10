/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.UserPatientCouple;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户患者关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPatientCoupleRecord extends UpdatableRecordImpl<UserPatientCoupleRecord> implements Record7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1136913225;

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.is_default</code>.
     */
    public void setIsDefault(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.is_default</code>.
     */
    public Byte getIsDefault() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.update_time</code>. 最后修改时间
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
    public Row7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserPatientCouple.USER_PATIENT_COUPLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserPatientCouple.USER_PATIENT_COUPLE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserPatientCouple.USER_PATIENT_COUPLE.PATIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UserPatientCouple.USER_PATIENT_COUPLE.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return UserPatientCouple.USER_PATIENT_COUPLE.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return UserPatientCouple.USER_PATIENT_COUPLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return UserPatientCouple.USER_PATIENT_COUPLE.UPDATE_TIME;
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
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateTime();
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
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
    public UserPatientCoupleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value3(Integer value) {
        setPatientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value4(Byte value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value5(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Byte value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached UserPatientCoupleRecord
     */
    public UserPatientCoupleRecord() {
        super(UserPatientCouple.USER_PATIENT_COUPLE);
    }

    /**
     * Create a detached, initialised UserPatientCoupleRecord
     */
    public UserPatientCoupleRecord(Integer id, Integer userId, Integer patientId, Byte isDefault, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(UserPatientCouple.USER_PATIENT_COUPLE);

        set(0, id);
        set(1, userId);
        set(2, patientId);
        set(3, isDefault);
        set(4, isDelete);
        set(5, createTime);
        set(6, updateTime);
    }
}
