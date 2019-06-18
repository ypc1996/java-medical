/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.SmsRecord;

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
import org.jooq.types.UByte;


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
public class Sms extends TableImpl<SmsRecord> {

    private static final long serialVersionUID = -819923885;

    /**
     * The reference instance of <code>mini_main.b2c_sms</code>
     */
    public static final Sms SMS = new Sms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmsRecord> getRecordType() {
        return SmsRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_sms.id</code>.
     */
    public final TableField<SmsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_sms.mobile</code>.
     */
    public final TableField<SmsRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_sms.sms_code</code>.
     */
    public final TableField<SmsRecord, String> SMS_CODE = createField("sms_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_sms.add_time</code>.
     */
    public final TableField<SmsRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_main.b2c_sms.ip</code>.
     */
    public final TableField<SmsRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_sms.status</code>. 0:发送失败 1：发送成功
     */
    public final TableField<SmsRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "0:发送失败 1：发送成功");

    /**
     * The column <code>mini_main.b2c_sms.type</code>.
     */
    public final TableField<SmsRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>mini_main.b2c_sms.content</code>. 发送短信内容
     */
    public final TableField<SmsRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "发送短信内容");

    /**
     * Create a <code>mini_main.b2c_sms</code> table reference
     */
    public Sms() {
        this(DSL.name("b2c_sms"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_sms</code> table reference
     */
    public Sms(String alias) {
        this(DSL.name(alias), SMS);
    }

    /**
     * Create an aliased <code>mini_main.b2c_sms</code> table reference
     */
    public Sms(Name alias) {
        this(alias, SMS);
    }

    private Sms(Name alias, Table<SmsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sms(Name alias, Table<SmsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sms(Table<O> child, ForeignKey<O, SmsRecord> key) {
        super(child, key, SMS);
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
        return Arrays.<Index>asList(Indexes.SMS_MOBILE, Indexes.SMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SmsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SmsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SmsRecord>> getKeys() {
        return Arrays.<UniqueKey<SmsRecord>>asList(Keys.KEY_B2C_SMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sms as(String alias) {
        return new Sms(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sms as(Name alias) {
        return new Sms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sms rename(String name) {
        return new Sms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sms rename(Name name) {
        return new Sms(name, null);
    }
}
