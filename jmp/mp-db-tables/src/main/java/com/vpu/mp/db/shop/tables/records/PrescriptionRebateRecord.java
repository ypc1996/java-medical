/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.PrescriptionRebate;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 处方药品返利表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrescriptionRebateRecord extends UpdatableRecordImpl<PrescriptionRebateRecord> implements Record13<Integer, String, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, String, Timestamp, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -985655072;

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.prescription_code</code>. 处方号
     */
    public void setPrescriptionCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.prescription_code</code>. 处方号
     */
    public String getPrescriptionCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.doctor_id</code>. 医师id
     */
    public void setDoctorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.doctor_id</code>. 医师id
     */
    public Integer getDoctorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.total_money</code>. 处方包含药品总金额
     */
    public void setTotalMoney(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.total_money</code>. 处方包含药品总金额
     */
    public BigDecimal getTotalMoney() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.can_calculate_money</code>. 可计算返利金额
     */
    public void setCanCalculateMoney(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.can_calculate_money</code>. 可计算返利金额
     */
    public BigDecimal getCanCalculateMoney() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.total_rebate_money</code>. 返利总金额
     */
    public void setTotalRebateMoney(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.total_rebate_money</code>. 返利总金额
     */
    public BigDecimal getTotalRebateMoney() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.real_rebate_money</code>. 实际返利总金额
     */
    public void setRealRebateMoney(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.real_rebate_money</code>. 实际返利总金额
     */
    public BigDecimal getRealRebateMoney() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.status</code>. 0待返利 1已返利 2未返利
     */
    public void setStatus(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.status</code>. 0待返利 1已返利 2未返利
     */
    public Byte getStatus() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.reason</code>. 未返利原因
     */
    public void setReason(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.reason</code>. 未返利原因
     */
    public String getReason() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.rebate_time</code>. 返利日期
     */
    public void setRebateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.rebate_time</code>. 返利日期
     */
    public Timestamp getRebateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_rebate.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_rebate.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
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
    public Row13<Integer, String, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, String, Timestamp, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Byte, String, Timestamp, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.PRESCRIPTION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.DOCTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.TOTAL_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.CAN_CALCULATE_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.TOTAL_REBATE_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.REAL_REBATE_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.REBATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return PrescriptionRebate.PRESCRIPTION_REBATE.UPDATE_TIME;
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
        return getPrescriptionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getTotalMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getCanCalculateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getTotalRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getRealRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getRebateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreateTime();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPrescriptionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDoctorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getTotalMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCanCalculateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getTotalRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getRealRebateMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getRebateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreateTime();
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
    public PrescriptionRebateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value2(String value) {
        setPrescriptionCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value3(Integer value) {
        setDoctorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value4(BigDecimal value) {
        setTotalMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value5(BigDecimal value) {
        setCanCalculateMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value6(BigDecimal value) {
        setTotalRebateMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value7(BigDecimal value) {
        setRealRebateMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value8(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value9(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value10(Timestamp value) {
        setRebateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value11(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value12(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionRebateRecord values(Integer value1, String value2, Integer value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Byte value8, String value9, Timestamp value10, Byte value11, Timestamp value12, Timestamp value13) {
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
     * Create a detached PrescriptionRebateRecord
     */
    public PrescriptionRebateRecord() {
        super(PrescriptionRebate.PRESCRIPTION_REBATE);
    }

    /**
     * Create a detached, initialised PrescriptionRebateRecord
     */
    public PrescriptionRebateRecord(Integer id, String prescriptionCode, Integer doctorId, BigDecimal totalMoney, BigDecimal canCalculateMoney, BigDecimal totalRebateMoney, BigDecimal realRebateMoney, Byte status, String reason, Timestamp rebateTime, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(PrescriptionRebate.PRESCRIPTION_REBATE);

        set(0, id);
        set(1, prescriptionCode);
        set(2, doctorId);
        set(3, totalMoney);
        set(4, canCalculateMoney);
        set(5, totalRebateMoney);
        set(6, realRebateMoney);
        set(7, status);
        set(8, reason);
        set(9, rebateTime);
        set(10, isDelete);
        set(11, createTime);
        set(12, updateTime);
    }
}
