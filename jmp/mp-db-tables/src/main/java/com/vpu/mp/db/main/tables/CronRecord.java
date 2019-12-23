/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.CronRecordRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class CronRecord extends TableImpl<CronRecordRecord> {

    private static final long serialVersionUID = -1625303244;

    /**
     * The reference instance of <code>mini_main.b2c_cron_record</code>
     */
    public static final CronRecord CRON_RECORD = new CronRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CronRecordRecord> getRecordType() {
        return CronRecordRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_cron_record.id</code>. 主键id
     */
    public final TableField<CronRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>mini_main.b2c_cron_record.cron_id</code>. 定时任务id
     */
    public final TableField<CronRecordRecord, Integer> CRON_ID = createField("cron_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "定时任务id");

    /**
     * The column <code>mini_main.b2c_cron_record.execute_num</code>. 执行次数（小于等于失败重试次数）
     */
    public final TableField<CronRecordRecord, Byte> EXECUTE_NUM = createField("execute_num", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "执行次数（小于等于失败重试次数）");

    /**
     * The column <code>mini_main.b2c_cron_record.failed_reason</code>. 最后一次执行失败原因
     */
    public final TableField<CronRecordRecord, String> FAILED_REASON = createField("failed_reason", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "最后一次执行失败原因");

    /**
     * The column <code>mini_main.b2c_cron_record.create_time</code>. 创建时间
     */
    public final TableField<CronRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>mini_main.b2c_cron_record.update_time</code>. 最后修改时间
     */
    public final TableField<CronRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_main.b2c_cron_record</code> table reference
     */
    public CronRecord() {
        this(DSL.name("b2c_cron_record"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_cron_record</code> table reference
     */
    public CronRecord(String alias) {
        this(DSL.name(alias), CRON_RECORD);
    }

    /**
     * Create an aliased <code>mini_main.b2c_cron_record</code> table reference
     */
    public CronRecord(Name alias) {
        this(alias, CRON_RECORD);
    }

    private CronRecord(Name alias, Table<CronRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private CronRecord(Name alias, Table<CronRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("定时任务执行结果记录表"));
    }

    public <O extends Record> CronRecord(Table<O> child, ForeignKey<O, CronRecordRecord> key) {
        super(child, key, CRON_RECORD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CRON_RECORD_PRIMARY, Indexes.CRON_RECORD_UNIQUE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CronRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CRON_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CronRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_CRON_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CronRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<CronRecordRecord>>asList(Keys.KEY_B2C_CRON_RECORD_PRIMARY, Keys.KEY_B2C_CRON_RECORD_UNIQUE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecord as(String alias) {
        return new CronRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronRecord as(Name alias) {
        return new CronRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CronRecord rename(String name) {
        return new CronRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CronRecord rename(Name name) {
        return new CronRecord(name, null);
    }
}
