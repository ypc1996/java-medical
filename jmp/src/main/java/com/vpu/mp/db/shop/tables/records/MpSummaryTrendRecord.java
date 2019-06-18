/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.MpSummaryTrend;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpSummaryTrendRecord extends TableRecordImpl<MpSummaryTrendRecord> implements Record5<String, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = -1541627311;

    /**
     * Setter for <code>mini_shop_1.b2c_mp_summary_trend.ref_date</code>. 日期
     */
    public void setRefDate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_mp_summary_trend.ref_date</code>. 日期
     */
    public String getRefDate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_mp_summary_trend.visit_total</code>. 总访问量
     */
    public void setVisitTotal(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_mp_summary_trend.visit_total</code>. 总访问量
     */
    public Integer getVisitTotal() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_mp_summary_trend.share_pv</code>. 转发次数
     */
    public void setSharePv(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_mp_summary_trend.share_pv</code>. 转发次数
     */
    public Integer getSharePv() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_mp_summary_trend.share_uv</code>. 转发人数
     */
    public void setShareUv(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_mp_summary_trend.share_uv</code>. 转发人数
     */
    public Integer getShareUv() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_mp_summary_trend.add_time</code>. 添加时间
     */
    public void setAddTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_mp_summary_trend.add_time</code>. 添加时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MpSummaryTrend.MP_SUMMARY_TREND.REF_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MpSummaryTrend.MP_SUMMARY_TREND.VISIT_TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MpSummaryTrend.MP_SUMMARY_TREND.SHARE_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MpSummaryTrend.MP_SUMMARY_TREND.SHARE_UV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return MpSummaryTrend.MP_SUMMARY_TREND.ADD_TIME;
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
        return getVisitTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSharePv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getShareUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
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
        return getVisitTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSharePv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getShareUv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord value1(String value) {
        setRefDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord value2(Integer value) {
        setVisitTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord value3(Integer value) {
        setSharePv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord value4(Integer value) {
        setShareUv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord value5(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpSummaryTrendRecord values(String value1, Integer value2, Integer value3, Integer value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MpSummaryTrendRecord
     */
    public MpSummaryTrendRecord() {
        super(MpSummaryTrend.MP_SUMMARY_TREND);
    }

    /**
     * Create a detached, initialised MpSummaryTrendRecord
     */
    public MpSummaryTrendRecord(String refDate, Integer visitTotal, Integer sharePv, Integer shareUv, Timestamp addTime) {
        super(MpSummaryTrend.MP_SUMMARY_TREND);

        set(0, refDate);
        set(1, visitTotal);
        set(2, sharePv);
        set(3, shareUv);
        set(4, addTime);
    }
}
