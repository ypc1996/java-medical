/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.MpMonthlyRetainRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class MpMonthlyRetain extends TableImpl<MpMonthlyRetainRecord> {

    private static final long serialVersionUID = -1609830393;

    /**
     * The reference instance of <code>mini_shop_1.b2c_mp_monthly_retain</code>
     */
    public static final MpMonthlyRetain MP_MONTHLY_RETAIN = new MpMonthlyRetain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpMonthlyRetainRecord> getRecordType() {
        return MpMonthlyRetainRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_mp_monthly_retain.ref_date</code>. 时间，如："201803"
     */
    public final TableField<MpMonthlyRetainRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(6).nullable(false), this, "时间，如：\"201803\"");

    /**
     * The column <code>mini_shop_1.b2c_mp_monthly_retain.visit_uv_new</code>. 新增用户留存
     */
    public final TableField<MpMonthlyRetainRecord, String> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.CLOB, this, "新增用户留存");

    /**
     * The column <code>mini_shop_1.b2c_mp_monthly_retain.visit_uv</code>. 活跃用户留存
     */
    public final TableField<MpMonthlyRetainRecord, String> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.CLOB, this, "活跃用户留存");

    /**
     * The column <code>mini_shop_1.b2c_mp_monthly_retain.add_time</code>. 添加时间
     */
    public final TableField<MpMonthlyRetainRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * Create a <code>mini_shop_1.b2c_mp_monthly_retain</code> table reference
     */
    public MpMonthlyRetain() {
        this(DSL.name("b2c_mp_monthly_retain"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_mp_monthly_retain</code> table reference
     */
    public MpMonthlyRetain(String alias) {
        this(DSL.name(alias), MP_MONTHLY_RETAIN);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_mp_monthly_retain</code> table reference
     */
    public MpMonthlyRetain(Name alias) {
        this(alias, MP_MONTHLY_RETAIN);
    }

    private MpMonthlyRetain(Name alias, Table<MpMonthlyRetainRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpMonthlyRetain(Name alias, Table<MpMonthlyRetainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpMonthlyRetain(Table<O> child, ForeignKey<O, MpMonthlyRetainRecord> key) {
        super(child, key, MP_MONTHLY_RETAIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_1.MINI_SHOP_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetain as(String alias) {
        return new MpMonthlyRetain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpMonthlyRetain as(Name alias) {
        return new MpMonthlyRetain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpMonthlyRetain rename(String name) {
        return new MpMonthlyRetain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpMonthlyRetain rename(Name name) {
        return new MpMonthlyRetain(name, null);
    }
}
