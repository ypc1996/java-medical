/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PurchasePriceRuleRecord;

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
public class PurchasePriceRule extends TableImpl<PurchasePriceRuleRecord> {

    private static final long serialVersionUID = -1623768275;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_purchase_price_rule</code>
     */
    public static final PurchasePriceRule PURCHASE_PRICE_RULE = new PurchasePriceRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PurchasePriceRuleRecord> getRecordType() {
        return PurchasePriceRuleRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.id</code>.
     */
    public final TableField<PurchasePriceRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.purchase_price_id</code>. 加价购活动id
     */
    public final TableField<PurchasePriceRuleRecord, Integer> PURCHASE_PRICE_ID = createField("purchase_price_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "加价购活动id");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.full_price</code>. 满多少钱
     */
    public final TableField<PurchasePriceRuleRecord, BigDecimal> FULL_PRICE = createField("full_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "满多少钱");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.purchase_price</code>. 换购多少钱的商品
     */
    public final TableField<PurchasePriceRuleRecord, BigDecimal> PURCHASE_PRICE = createField("purchase_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "换购多少钱的商品");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.product_id</code>. 换购商品
     */
    public final TableField<PurchasePriceRuleRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.CLOB, this, "换购商品");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.del_flag</code>.
     */
    public final TableField<PurchasePriceRuleRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.del_time</code>. 删除时间
     */
    public final TableField<PurchasePriceRuleRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "删除时间");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.create_time</code>.
     */
    public final TableField<PurchasePriceRuleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_rule.update_time</code>. 最后修改时间
     */
    public final TableField<PurchasePriceRuleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_purchase_price_rule</code> table reference
     */
    public PurchasePriceRule() {
        this(DSL.name("b2c_purchase_price_rule"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_purchase_price_rule</code> table reference
     */
    public PurchasePriceRule(String alias) {
        this(DSL.name(alias), PURCHASE_PRICE_RULE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_purchase_price_rule</code> table reference
     */
    public PurchasePriceRule(Name alias) {
        this(alias, PURCHASE_PRICE_RULE);
    }

    private PurchasePriceRule(Name alias, Table<PurchasePriceRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private PurchasePriceRule(Name alias, Table<PurchasePriceRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PurchasePriceRule(Table<O> child, ForeignKey<O, PurchasePriceRuleRecord> key) {
        super(child, key, PURCHASE_PRICE_RULE);
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
        return Arrays.<Index>asList(Indexes.PURCHASE_PRICE_RULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PurchasePriceRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PURCHASE_PRICE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PurchasePriceRuleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PURCHASE_PRICE_RULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PurchasePriceRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<PurchasePriceRuleRecord>>asList(Keys.KEY_B2C_PURCHASE_PRICE_RULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePriceRule as(String alias) {
        return new PurchasePriceRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePriceRule as(Name alias) {
        return new PurchasePriceRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePriceRule rename(String name) {
        return new PurchasePriceRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePriceRule rename(Name name) {
        return new PurchasePriceRule(name, null);
    }
}
