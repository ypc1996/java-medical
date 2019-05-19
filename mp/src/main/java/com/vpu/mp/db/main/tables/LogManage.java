/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.LogManageRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class LogManage extends TableImpl<LogManageRecord> {

    private static final long serialVersionUID = -295729757;

    /**
     * The reference instance of <code>mini_main.b2c_log_manage</code>
     */
    public static final LogManage LOG_MANAGE = new LogManage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogManageRecord> getRecordType() {
        return LogManageRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_log_manage.log_id</code>.
     */
    public final TableField<LogManageRecord, Long> LOG_ID = createField("log_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_log_manage.shop_id</code>. 店铺ID
     */
    public final TableField<LogManageRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_log_manage.error_level</code>. 错误等级：0正常，1debug，2info，3error
     */
    public final TableField<LogManageRecord, Byte> ERROR_LEVEL = createField("error_level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "错误等级：0正常，1debug，2info，3error");

    /**
     * The column <code>mini_main.b2c_log_manage.error_code</code>. 错误编码
     */
    public final TableField<LogManageRecord, String> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "错误编码");

    /**
     * The column <code>mini_main.b2c_log_manage.error_msg</code>. 错误说明
     */
    public final TableField<LogManageRecord, String> ERROR_MSG = createField("error_msg", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "错误说明");

    /**
     * The column <code>mini_main.b2c_log_manage.error_content</code>. 错误内容
     */
    public final TableField<LogManageRecord, String> ERROR_CONTENT = createField("error_content", org.jooq.impl.SQLDataType.CLOB, this, "错误内容");

    /**
     * The column <code>mini_main.b2c_log_manage.error_source</code>. 错误来源：0无，1erp，2crm，3pos，4寺库，5欧派，...
     */
    public final TableField<LogManageRecord, Byte> ERROR_SOURCE = createField("error_source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "错误来源：0无，1erp，2crm，3pos，4寺库，5欧派，...");

    /**
     * The column <code>mini_main.b2c_log_manage.deal_status</code>. 处理结果：0待处理，1已处理
     */
    public final TableField<LogManageRecord, Byte> DEAL_STATUS = createField("deal_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "处理结果：0待处理，1已处理");

    /**
     * The column <code>mini_main.b2c_log_manage.action</code>. 动作方法
     */
    public final TableField<LogManageRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "动作方法");

    /**
     * The column <code>mini_main.b2c_log_manage.action_name</code>. 动作方法名称
     */
    public final TableField<LogManageRecord, String> ACTION_NAME = createField("action_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "动作方法名称");

    /**
     * The column <code>mini_main.b2c_log_manage.request_content</code>. 请求内容 json串
     */
    public final TableField<LogManageRecord, String> REQUEST_CONTENT = createField("request_content", org.jooq.impl.SQLDataType.CLOB, this, "请求内容 json串");

    /**
     * The column <code>mini_main.b2c_log_manage.response_content</code>. 响应内容 json串
     */
    public final TableField<LogManageRecord, String> RESPONSE_CONTENT = createField("response_content", org.jooq.impl.SQLDataType.CLOB, this, "响应内容 json串");

    /**
     * The column <code>mini_main.b2c_log_manage.ip</code>. 请求ip
     */
    public final TableField<LogManageRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(100), this, "请求ip");

    /**
     * The column <code>mini_main.b2c_log_manage.deal_time</code>. 处理时间
     */
    public final TableField<LogManageRecord, Timestamp> DEAL_TIME = createField("deal_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "处理时间");

    /**
     * The column <code>mini_main.b2c_log_manage.deal_person</code>. 处理人员
     */
    public final TableField<LogManageRecord, String> DEAL_PERSON = createField("deal_person", org.jooq.impl.SQLDataType.VARCHAR(32), this, "处理人员");

    /**
     * The column <code>mini_main.b2c_log_manage.in_time</code>. 添加时间
     */
    public final TableField<LogManageRecord, Timestamp> IN_TIME = createField("in_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "添加时间");

    /**
     * The column <code>mini_main.b2c_log_manage.up_time</code>. 更新时间
     */
    public final TableField<LogManageRecord, Timestamp> UP_TIME = createField("up_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>mini_main.b2c_log_manage.remark</code>. 备注
     */
    public final TableField<LogManageRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(600), this, "备注");

    /**
     * The column <code>mini_main.b2c_log_manage.identity_id</code>. 关联外部表
     */
    public final TableField<LogManageRecord, Integer> IDENTITY_ID = createField("identity_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "关联外部表");

    /**
     * Create a <code>mini_main.b2c_log_manage</code> table reference
     */
    public LogManage() {
        this(DSL.name("b2c_log_manage"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_log_manage</code> table reference
     */
    public LogManage(String alias) {
        this(DSL.name(alias), LOG_MANAGE);
    }

    /**
     * Create an aliased <code>mini_main.b2c_log_manage</code> table reference
     */
    public LogManage(Name alias) {
        this(alias, LOG_MANAGE);
    }

    private LogManage(Name alias, Table<LogManageRecord> aliased) {
        this(alias, aliased, null);
    }

    private LogManage(Name alias, Table<LogManageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LogManage(Table<O> child, ForeignKey<O, LogManageRecord> key) {
        super(child, key, LOG_MANAGE);
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
        return Arrays.<Index>asList(Indexes.LOG_MANAGE_PRIMARY, Indexes.LOG_MANAGE_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LogManageRecord, Long> getIdentity() {
        return Keys.IDENTITY_LOG_MANAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LogManageRecord> getPrimaryKey() {
        return Keys.KEY_B2C_LOG_MANAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LogManageRecord>> getKeys() {
        return Arrays.<UniqueKey<LogManageRecord>>asList(Keys.KEY_B2C_LOG_MANAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogManage as(String alias) {
        return new LogManage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogManage as(Name alias) {
        return new LogManage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LogManage rename(String name) {
        return new LogManage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LogManage rename(Name name) {
        return new LogManage(name, null);
    }
}
