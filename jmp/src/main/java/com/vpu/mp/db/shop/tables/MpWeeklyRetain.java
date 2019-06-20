/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.MpWeeklyRetainRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpWeeklyRetain extends TableImpl<MpWeeklyRetainRecord> {

    private static final long serialVersionUID = 1933287365;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_mp_weekly_retain</code>
     */
    public static final MpWeeklyRetain MP_WEEKLY_RETAIN = new MpWeeklyRetain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpWeeklyRetainRecord> getRecordType() {
        return MpWeeklyRetainRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_mp_weekly_retain.ref_date</code>. 时间，如："20180306-20180312"
     */
    public final TableField<MpWeeklyRetainRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(20).nullable(false), this, "时间，如：\"20180306-20180312\"");

    /**
     * The column <code>mini_shop_471752.b2c_mp_weekly_retain.visit_uv_new</code>. 新增用户留存
     */
    public final TableField<MpWeeklyRetainRecord, String> VISIT_UV_NEW = createField("visit_uv_new", org.jooq.impl.SQLDataType.CLOB, this, "新增用户留存");

    /**
     * The column <code>mini_shop_471752.b2c_mp_weekly_retain.visit_uv</code>. 活跃用户留存
     */
    public final TableField<MpWeeklyRetainRecord, String> VISIT_UV = createField("visit_uv", org.jooq.impl.SQLDataType.CLOB, this, "活跃用户留存");

    /**
     * The column <code>mini_shop_471752.b2c_mp_weekly_retain.add_time</code>. 添加时间
     */
    public final TableField<MpWeeklyRetainRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * Create a <code>mini_shop_471752.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain() {
        this(DSL.name("b2c_mp_weekly_retain"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain(String alias) {
        this(DSL.name(alias), MP_WEEKLY_RETAIN);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_mp_weekly_retain</code> table reference
     */
    public MpWeeklyRetain(Name alias) {
        this(alias, MP_WEEKLY_RETAIN);
    }

    private MpWeeklyRetain(Name alias, Table<MpWeeklyRetainRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpWeeklyRetain(Name alias, Table<MpWeeklyRetainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpWeeklyRetain(Table<O> child, ForeignKey<O, MpWeeklyRetainRecord> key) {
        super(child, key, MP_WEEKLY_RETAIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpWeeklyRetain as(String alias) {
        return new MpWeeklyRetain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpWeeklyRetain as(Name alias) {
        return new MpWeeklyRetain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyRetain rename(String name) {
        return new MpWeeklyRetain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpWeeklyRetain rename(Name name) {
        return new MpWeeklyRetain(name, null);
    }
}
