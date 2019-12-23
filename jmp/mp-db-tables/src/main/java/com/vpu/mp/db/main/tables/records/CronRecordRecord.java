/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.CronRecord;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 定时任务执行结果记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CronRecordRecord extends UpdatableRecordImpl<CronRecordRecord> implements Record6<Integer, Integer, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -434291180;

    /**
     * Setter for <code>mini_main.b2c_cron_record.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_cron_record.cron_id</code>. 定时任务id
     */
    public void setCronId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.cron_id</code>. 定时任务id
     */
    public Integer getCronId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_cron_record.execute_num</code>. 执行次数（小于等于失败重试次数）
     */
    public void setExecuteNum(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.execute_num</code>. 执行次数（小于等于失败重试次数）
     */
    public Byte getExecuteNum() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_cron_record.failed_reason</code>. 最后一次执行失败原因
     */
    public void setFailedReason(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.failed_reason</code>. 最后一次执行失败原因
     */
    public String getFailedReason() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_cron_record.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_cron_record.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_cron_record.update_time</code>. 最后修改时间
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
    public Row6<Integer, Integer, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CronRecord.CRON_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CronRecord.CRON_RECORD.CRON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return CronRecord.CRON_RECORD.EXECUTE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CronRecord.CRON_RECORD.FAILED_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CronRecord.CRON_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CronRecord.CRON_RECORD.UPDATE_TIME;
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
        return getCronId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getExecuteNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFailedReason();
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
        return getCronId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getExecuteNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFailedReason();
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
    public CronRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord value2(Integer value) {
        setCronId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord value3(Byte value) {
        setExecuteNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord value4(String value) {
        setFailedReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecordRecord values(Integer value1, Integer value2, Byte value3, String value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached CronRecordRecord
     */
    public CronRecordRecord() {
        super(CronRecord.CRON_RECORD);
    }

    /**
     * Create a detached, initialised CronRecordRecord
     */
    public CronRecordRecord(Integer id, Integer cronId, Byte executeNum, String failedReason, Timestamp createTime, Timestamp updateTime) {
        super(CronRecord.CRON_RECORD);

        set(0, id);
        set(1, cronId);
        set(2, executeNum);
        set(3, failedReason);
        set(4, createTime);
        set(5, updateTime);
    }
}
