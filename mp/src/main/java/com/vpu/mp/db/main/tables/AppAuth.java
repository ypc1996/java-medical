/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.AppAuthRecord;

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
import org.jooq.types.UShort;


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
public class AppAuth extends TableImpl<AppAuthRecord> {

    private static final long serialVersionUID = -1335354861;

    /**
     * The reference instance of <code>mini_main.b2c_app_auth</code>
     */
    public static final AppAuth APP_AUTH = new AppAuth();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppAuthRecord> getRecordType() {
        return AppAuthRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_app_auth.id</code>.
     */
    public final TableField<AppAuthRecord, UShort> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.action</code>. 1：erp 2：pos
     */
    public final TableField<AppAuthRecord, Byte> ACTION = createField("action", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1：erp 2：pos");

    /**
     * The column <code>mini_main.b2c_app_auth.sys_id</code>.
     */
    public final TableField<AppAuthRecord, Integer> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.shop_id</code>. 店铺ID
     */
    public final TableField<AppAuthRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_app_auth.session_key</code>. 授权key
     */
    public final TableField<AppAuthRecord, String> SESSION_KEY = createField("session_key", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权key");

    /**
     * The column <code>mini_main.b2c_app_auth.pos_session_key</code>. pos授权key
     */
    public final TableField<AppAuthRecord, String> POS_SESSION_KEY = createField("pos_session_key", org.jooq.impl.SQLDataType.VARCHAR(100), this, "pos授权key");

    /**
     * The column <code>mini_main.b2c_app_auth.app_key</code>. crm分配的appKey
     */
    public final TableField<AppAuthRecord, String> APP_KEY = createField("app_key", org.jooq.impl.SQLDataType.VARCHAR(200), this, "crm分配的appKey");

    /**
     * The column <code>mini_main.b2c_app_auth.app_secret</code>. crm分配的appSecret
     */
    public final TableField<AppAuthRecord, String> APP_SECRET = createField("app_secret", org.jooq.impl.SQLDataType.VARCHAR(200), this, "crm分配的appSecret");

    /**
     * The column <code>mini_main.b2c_app_auth.product</code>. 产品：1 ERP企业版 2：ERP旗舰版
     */
    public final TableField<AppAuthRecord, Byte> PRODUCT = createField("product", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "产品：1 ERP企业版 2：ERP旗舰版");

    /**
     * The column <code>mini_main.b2c_app_auth.is_sync</code>. 是否已同步
     */
    public final TableField<AppAuthRecord, Byte> IS_SYNC = createField("is_sync", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否已同步");

    /**
     * The column <code>mini_main.b2c_app_auth.status</code>. 1：启用 0：禁用
     */
    public final TableField<AppAuthRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1：启用 0：禁用");

    /**
     * The column <code>mini_main.b2c_app_auth.add_time</code>.
     */
    public final TableField<AppAuthRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_app_auth.update_time</code>.
     */
    public final TableField<AppAuthRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth() {
        this(DSL.name("b2c_app_auth"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth(String alias) {
        this(DSL.name(alias), APP_AUTH);
    }

    /**
     * Create an aliased <code>mini_main.b2c_app_auth</code> table reference
     */
    public AppAuth(Name alias) {
        this(alias, APP_AUTH);
    }

    private AppAuth(Name alias, Table<AppAuthRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppAuth(Name alias, Table<AppAuthRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AppAuth(Table<O> child, ForeignKey<O, AppAuthRecord> key) {
        super(child, key, APP_AUTH);
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
        return Arrays.<Index>asList(Indexes.APP_AUTH_PRIMARY, Indexes.APP_AUTH_SESSION_KEY, Indexes.APP_AUTH_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AppAuthRecord, UShort> getIdentity() {
        return Keys.IDENTITY_APP_AUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppAuthRecord> getPrimaryKey() {
        return Keys.KEY_B2C_APP_AUTH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppAuthRecord>> getKeys() {
        return Arrays.<UniqueKey<AppAuthRecord>>asList(Keys.KEY_B2C_APP_AUTH_PRIMARY, Keys.KEY_B2C_APP_AUTH_SESSION_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAuth as(String alias) {
        return new AppAuth(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppAuth as(Name alias) {
        return new AppAuth(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAuth rename(String name) {
        return new AppAuth(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppAuth rename(Name name) {
        return new AppAuth(name, null);
    }
}
