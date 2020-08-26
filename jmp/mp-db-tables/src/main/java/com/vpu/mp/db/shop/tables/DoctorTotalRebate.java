/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DoctorTotalRebateRecord;

import java.math.BigDecimal;
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
 * 医师返利数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorTotalRebate extends TableImpl<DoctorTotalRebateRecord> {

    private static final long serialVersionUID = 997141215;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_doctor_total_rebate</code>
     */
    public static final DoctorTotalRebate DOCTOR_TOTAL_REBATE = new DoctorTotalRebate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DoctorTotalRebateRecord> getRecordType() {
        return DoctorTotalRebateRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.id</code>.
     */
    public final TableField<DoctorTotalRebateRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.doctor_id</code>. 医师id
     */
    public final TableField<DoctorTotalRebateRecord, Integer> DOCTOR_ID = createField("doctor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "医师id");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.total_money</code>. 累计获得返利金额
     */
    public final TableField<DoctorTotalRebateRecord, BigDecimal> TOTAL_MONEY = createField("total_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "累计获得返利金额");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.blocked_money</code>. 冻结余额
     */
    public final TableField<DoctorTotalRebateRecord, BigDecimal> BLOCKED_MONEY = createField("blocked_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "冻结余额");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.final_money</code>. 总返利金额，total_money为提现后金额
     */
    public final TableField<DoctorTotalRebateRecord, BigDecimal> FINAL_MONEY = createField("final_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "总返利金额，total_money为提现后金额");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.is_delete</code>.
     */
    public final TableField<DoctorTotalRebateRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.create_time</code>.
     */
    public final TableField<DoctorTotalRebateRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_doctor_total_rebate.update_time</code>. 最后修改时间
     */
    public final TableField<DoctorTotalRebateRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_doctor_total_rebate</code> table reference
     */
    public DoctorTotalRebate() {
        this(DSL.name("b2c_doctor_total_rebate"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_total_rebate</code> table reference
     */
    public DoctorTotalRebate(String alias) {
        this(DSL.name(alias), DOCTOR_TOTAL_REBATE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_doctor_total_rebate</code> table reference
     */
    public DoctorTotalRebate(Name alias) {
        this(alias, DOCTOR_TOTAL_REBATE);
    }

    private DoctorTotalRebate(Name alias, Table<DoctorTotalRebateRecord> aliased) {
        this(alias, aliased, null);
    }

    private DoctorTotalRebate(Name alias, Table<DoctorTotalRebateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("医师返利数据表"));
    }

    public <O extends Record> DoctorTotalRebate(Table<O> child, ForeignKey<O, DoctorTotalRebateRecord> key) {
        super(child, key, DOCTOR_TOTAL_REBATE);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DOCTOR_TOTAL_REBATE_DOCTOR_ID, Indexes.DOCTOR_TOTAL_REBATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DoctorTotalRebateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DOCTOR_TOTAL_REBATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DoctorTotalRebateRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DOCTOR_TOTAL_REBATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DoctorTotalRebateRecord>> getKeys() {
        return Arrays.<UniqueKey<DoctorTotalRebateRecord>>asList(Keys.KEY_B2C_DOCTOR_TOTAL_REBATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorTotalRebate as(String alias) {
        return new DoctorTotalRebate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DoctorTotalRebate as(Name alias) {
        return new DoctorTotalRebate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorTotalRebate rename(String name) {
        return new DoctorTotalRebate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DoctorTotalRebate rename(Name name) {
        return new DoctorTotalRebate(name, null);
    }
}
