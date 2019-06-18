/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.SystemCfgRecord;

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
import org.jooq.types.UInteger;
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
public class SystemCfg extends TableImpl<SystemCfgRecord> {

    private static final long serialVersionUID = 1393914603;

    /**
     * The reference instance of <code>mini_main.b2c_system_cfg</code>
     */
    public static final SystemCfg SYSTEM_CFG = new SystemCfg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemCfgRecord> getRecordType() {
        return SystemCfgRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_system_cfg.rec_id</code>.
     */
    public final TableField<SystemCfgRecord, UShort> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_system_cfg.sys_id</code>.
     */
    public final TableField<SystemCfgRecord, UInteger> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_system_cfg.k</code>.
     */
    public final TableField<SystemCfgRecord, String> K = createField("k", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_system_cfg.v</code>.
     */
    public final TableField<SystemCfgRecord, String> V = createField("v", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>mini_main.b2c_system_cfg</code> table reference
     */
    public SystemCfg() {
        this(DSL.name("b2c_system_cfg"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_cfg</code> table reference
     */
    public SystemCfg(String alias) {
        this(DSL.name(alias), SYSTEM_CFG);
    }

    /**
     * Create an aliased <code>mini_main.b2c_system_cfg</code> table reference
     */
    public SystemCfg(Name alias) {
        this(alias, SYSTEM_CFG);
    }

    private SystemCfg(Name alias, Table<SystemCfgRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemCfg(Name alias, Table<SystemCfgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SystemCfg(Table<O> child, ForeignKey<O, SystemCfgRecord> key) {
        super(child, key, SYSTEM_CFG);
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
        return Arrays.<Index>asList(Indexes.SYSTEM_CFG_PRIMARY, Indexes.SYSTEM_CFG_SYS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SystemCfgRecord, UShort> getIdentity() {
        return Keys.IDENTITY_SYSTEM_CFG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SystemCfgRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SYSTEM_CFG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SystemCfgRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemCfgRecord>>asList(Keys.KEY_B2C_SYSTEM_CFG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemCfg as(String alias) {
        return new SystemCfg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemCfg as(Name alias) {
        return new SystemCfg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemCfg rename(String name) {
        return new SystemCfg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemCfg rename(Name name) {
        return new SystemCfg(name, null);
    }
}
