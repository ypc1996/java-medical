/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.MpMonthlyRetain;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class MpMonthlyRetainRecord extends TableRecordImpl<MpMonthlyRetainRecord> implements Record4<String, String, String, Timestamp> {

    private static final long serialVersionUID = 1983251005;

    /**
     * Setter for <code>mini_main.b2c_mp_monthly_retain.ref_date</code>. 时间，如："201803"
     */
    public void setRefDate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_monthly_retain.ref_date</code>. 时间，如："201803"
     */
    public String getRefDate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_monthly_retain.visit_uv_new</code>. 新增用户留存
     */
    public void setVisitUvNew(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_monthly_retain.visit_uv_new</code>. 新增用户留存
     */
    public String getVisitUvNew() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_monthly_retain.visit_uv</code>. 活跃用户留存
     */
    public void setVisitUv(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_monthly_retain.visit_uv</code>. 活跃用户留存
     */
    public String getVisitUv() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_mp_monthly_retain.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_mp_monthly_retain.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MpMonthlyRetain.MP_MONTHLY_RETAIN.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MpMonthlyRetain.MP_MONTHLY_RETAIN.VISIT_UV_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MpMonthlyRetain.MP_MONTHLY_RETAIN.VISIT_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MpMonthlyRetain.MP_MONTHLY_RETAIN.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRefDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetainRecord value1(String value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetainRecord value2(String value) {
        setVisitUvNew(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetainRecord value3(String value) {
        setVisitUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetainRecord value4(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetainRecord values(String value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpMonthlyRetainRecord
     */
    public MpMonthlyRetainRecord() {
        super(MpMonthlyRetain.MP_MONTHLY_RETAIN);
    }

    /**
     * Create a detached, initialised MpMonthlyRetainRecord
     */
    public MpMonthlyRetainRecord(String refDate, String visitUvNew, String visitUv, Timestamp addTime) {
        super(MpMonthlyRetain.MP_MONTHLY_RETAIN);

        set(0, refDate);
        set(1, visitUvNew);
        set(2, visitUv);
        set(3, addTime);
    }
}
