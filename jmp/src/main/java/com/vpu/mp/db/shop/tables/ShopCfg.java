/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ShopCfgRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShopCfg extends TableImpl<ShopCfgRecord> {

    private static final long serialVersionUID = -1976024678;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_shop_cfg</code>
     */
    public static final ShopCfg SHOP_CFG = new ShopCfg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopCfgRecord> getRecordType() {
        return ShopCfgRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.rec_id</code>.
     */
    public final TableField<ShopCfgRecord, Short> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.shop_id</code>. 店铺id
     */
    public final TableField<ShopCfgRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.k</code>.
     */
    public final TableField<ShopCfgRecord, String> K = createField("k", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.v</code>.
     */
    public final TableField<ShopCfgRecord, String> V = createField("v", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.create_time</code>.
     */
    public final TableField<ShopCfgRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_shop_cfg.update_time</code>. 最后修改时间
     */
    public final TableField<ShopCfgRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_shop_cfg</code> table reference
     */
    public ShopCfg() {
        this(DSL.name("b2c_shop_cfg"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_shop_cfg</code> table reference
     */
    public ShopCfg(String alias) {
        this(DSL.name(alias), SHOP_CFG);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_shop_cfg</code> table reference
     */
    public ShopCfg(Name alias) {
        this(alias, SHOP_CFG);
    }

    private ShopCfg(Name alias, Table<ShopCfgRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShopCfg(Name alias, Table<ShopCfgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShopCfg(Table<O> child, ForeignKey<O, ShopCfgRecord> key) {
        super(child, key, SHOP_CFG);
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
        return Arrays.<Index>asList(Indexes.SHOP_CFG_PRIMARY, Indexes.SHOP_CFG_SHOP_ID_K);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopCfgRecord, Short> getIdentity() {
        return Keys.IDENTITY_SHOP_CFG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopCfgRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_CFG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopCfgRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopCfgRecord>>asList(Keys.KEY_B2C_SHOP_CFG_PRIMARY, Keys.KEY_B2C_SHOP_CFG_SHOP_ID_K);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfg as(String alias) {
        return new ShopCfg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopCfg as(Name alias) {
        return new ShopCfg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopCfg rename(String name) {
        return new ShopCfg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopCfg rename(Name name) {
        return new ShopCfg(name, null);
    }
}
