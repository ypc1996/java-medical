/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.SpecValsRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpecVals extends TableImpl<SpecValsRecord> {

    private static final long serialVersionUID = -786826196;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_spec_vals</code>
     */
    public static final SpecVals SPEC_VALS = new SpecVals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpecValsRecord> getRecordType() {
        return SpecValsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_spec_vals.specvalid</code>.
     */
    public final TableField<SpecValsRecord, Integer> SPECVALID = createField("specvalid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_spec_vals.spec_id</code>.
     */
    public final TableField<SpecValsRecord, Integer> SPEC_ID = createField("spec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_spec_vals.specvalname</code>.
     */
    public final TableField<SpecValsRecord, String> SPECVALNAME = createField("specvalname", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_spec_vals.del_flag</code>.
     */
    public final TableField<SpecValsRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_spec_vals.shop_id</code>. 店铺ID
     */
    public final TableField<SpecValsRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * Create a <code>mini_shop_471752.b2c_spec_vals</code> table reference
     */
    public SpecVals() {
        this(DSL.name("b2c_spec_vals"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_spec_vals</code> table reference
     */
    public SpecVals(String alias) {
        this(DSL.name(alias), SPEC_VALS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_spec_vals</code> table reference
     */
    public SpecVals(Name alias) {
        this(alias, SPEC_VALS);
    }

    private SpecVals(Name alias, Table<SpecValsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpecVals(Name alias, Table<SpecValsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SpecVals(Table<O> child, ForeignKey<O, SpecValsRecord> key) {
        super(child, key, SPEC_VALS);
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
        return Arrays.<Index>asList(Indexes.SPEC_VALS_PRIMARY, Indexes.SPEC_VALS_SPEC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SpecValsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SPEC_VALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpecValsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SPEC_VALS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpecValsRecord>> getKeys() {
        return Arrays.<UniqueKey<SpecValsRecord>>asList(Keys.KEY_B2C_SPEC_VALS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecVals as(String alias) {
        return new SpecVals(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecVals as(Name alias) {
        return new SpecVals(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpecVals rename(String name) {
        return new SpecVals(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpecVals rename(Name name) {
        return new SpecVals(name, null);
    }
}
