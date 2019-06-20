/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.MpMonthlyVisit;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class MpMonthlyVisitRecord extends TableRecordImpl<MpMonthlyVisitRecord> implements Record9<String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp> {

    private static final long serialVersionUID = 348589000;

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.ref_date</code>. 时间，如："201803"
     */
    public void setRefDate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.ref_date</code>. 时间，如："201803"
     */
    public String getRefDate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.session_cnt</code>. 打开次数
     */
    public void setSessionCnt(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.session_cnt</code>. 打开次数
     */
    public Integer getSessionCnt() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_pv</code>. 访问次数
     */
    public void setVisitPv(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_pv</code>. 访问次数
     */
    public Integer getVisitPv() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_uv</code>. 访问人数
     */
    public void setVisitUv(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_uv</code>. 访问人数
     */
    public Integer getVisitUv() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_uv_new</code>. 新用户数
     */
    public void setVisitUvNew(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_uv_new</code>. 新用户数
     */
    public Integer getVisitUvNew() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public void setStayTimeUv(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.stay_time_uv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public Double getStayTimeUv() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public void setStayTimeSession(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.stay_time_session</code>. 次均停留时长 (浮点型，单位：秒)
     */
    public Double getStayTimeSession() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public void setVisitDepth(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.visit_depth</code>. 平均访问深度 (浮点型)
     */
    public Double getVisitDepth() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_mp_monthly_visit.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_mp_monthly_visit.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Integer, Integer, Integer, Integer, Double, Double, Double, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.SESSION_CNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.VISIT_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.VISIT_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.VISIT_UV_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.STAY_TIME_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.STAY_TIME_SESSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.VISIT_DEPTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return MpMonthlyVisit.MP_MONTHLY_VISIT.ADD_TIME;
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
    public Integer component2() {
        return getSessionCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getVisitPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getStayTimeUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getStayTimeSession();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getVisitDepth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
    public Integer value2() {
        return getSessionCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVisitPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVisitUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVisitUvNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getStayTimeUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getStayTimeSession();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getVisitDepth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value1(String value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value2(Integer value) {
        setSessionCnt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value3(Integer value) {
        setVisitPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value4(Integer value) {
        setVisitUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value5(Integer value) {
        setVisitUvNew(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value6(Double value) {
        setStayTimeUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value7(Double value) {
        setStayTimeSession(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value8(Double value) {
        setVisitDepth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord value9(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyVisitRecord values(String value1, Integer value2, Integer value3, Integer value4, Integer value5, Double value6, Double value7, Double value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpMonthlyVisitRecord
     */
    public MpMonthlyVisitRecord() {
        super(MpMonthlyVisit.MP_MONTHLY_VISIT);
    }

    /**
     * Create a detached, initialised MpMonthlyVisitRecord
     */
    public MpMonthlyVisitRecord(String refDate, Integer sessionCnt, Integer visitPv, Integer visitUv, Integer visitUvNew, Double stayTimeUv, Double stayTimeSession, Double visitDepth, Timestamp addTime) {
        super(MpMonthlyVisit.MP_MONTHLY_VISIT);

        set(0, refDate);
        set(1, sessionCnt);
        set(2, visitPv);
        set(3, visitUv);
        set(4, visitUvNew);
        set(5, stayTimeUv);
        set(6, stayTimeSession);
        set(7, visitDepth);
        set(8, addTime);
    }
}
