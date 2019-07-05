/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ReducePriceProductRecord;

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
public class ReducePriceProduct extends TableImpl<ReducePriceProductRecord> {

    private static final long serialVersionUID = -1681910035;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_reduce_price_product</code>
     */
    public static final ReducePriceProduct REDUCE_PRICE_PRODUCT = new ReducePriceProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReducePriceProductRecord> getRecordType() {
        return ReducePriceProductRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.id</code>.
     */
    public final TableField<ReducePriceProductRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.reduce_price_id</code>. 限时减价活动id
     */
    public final TableField<ReducePriceProductRecord, Integer> REDUCE_PRICE_ID = createField("reduce_price_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "限时减价活动id");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.goods_id</code>. 商品id
     */
    public final TableField<ReducePriceProductRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.product_id</code>. 规格id
     */
    public final TableField<ReducePriceProductRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "规格id");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.prd_price</code>. 折后价格
     */
    public final TableField<ReducePriceProductRecord, BigDecimal> PRD_PRICE = createField("prd_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "折后价格");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.create_time</code>.
     */
    public final TableField<ReducePriceProductRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_product.update_time</code>. 最后修改时间
     */
    public final TableField<ReducePriceProductRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_reduce_price_product</code> table reference
     */
    public ReducePriceProduct() {
        this(DSL.name("b2c_reduce_price_product"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_reduce_price_product</code> table reference
     */
    public ReducePriceProduct(String alias) {
        this(DSL.name(alias), REDUCE_PRICE_PRODUCT);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_reduce_price_product</code> table reference
     */
    public ReducePriceProduct(Name alias) {
        this(alias, REDUCE_PRICE_PRODUCT);
    }

    private ReducePriceProduct(Name alias, Table<ReducePriceProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReducePriceProduct(Name alias, Table<ReducePriceProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReducePriceProduct(Table<O> child, ForeignKey<O, ReducePriceProductRecord> key) {
        super(child, key, REDUCE_PRICE_PRODUCT);
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
        return Arrays.<Index>asList(Indexes.REDUCE_PRICE_PRODUCT_PRIMARY, Indexes.REDUCE_PRICE_PRODUCT_REDUCE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReducePriceProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REDUCE_PRICE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReducePriceProductRecord> getPrimaryKey() {
        return Keys.KEY_B2C_REDUCE_PRICE_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReducePriceProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ReducePriceProductRecord>>asList(Keys.KEY_B2C_REDUCE_PRICE_PRODUCT_PRIMARY, Keys.KEY_B2C_REDUCE_PRICE_PRODUCT_REDUCE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProduct as(String alias) {
        return new ReducePriceProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceProduct as(Name alias) {
        return new ReducePriceProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReducePriceProduct rename(String name) {
        return new ReducePriceProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReducePriceProduct rename(Name name) {
        return new ReducePriceProduct(name, null);
    }
}
