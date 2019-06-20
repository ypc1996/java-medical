/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ReducePriceGoodsRecord;

import java.math.BigDecimal;
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
public class ReducePriceGoods extends TableImpl<ReducePriceGoodsRecord> {

    private static final long serialVersionUID = 704583231;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_reduce_price_goods</code>
     */
    public static final ReducePriceGoods REDUCE_PRICE_GOODS = new ReducePriceGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReducePriceGoodsRecord> getRecordType() {
        return ReducePriceGoodsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.id</code>.
     */
    public final TableField<ReducePriceGoodsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.reduce_price_id</code>. 限时减价活动ID
     */
    public final TableField<ReducePriceGoodsRecord, Integer> REDUCE_PRICE_ID = createField("reduce_price_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "限时减价活动ID");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.goods_id</code>. 商品ID
     */
    public final TableField<ReducePriceGoodsRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.discount</code>. 打几折
     */
    public final TableField<ReducePriceGoodsRecord, BigDecimal> DISCOUNT = createField("discount", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "打几折");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.reduce_price</code>. 减多少钱
     */
    public final TableField<ReducePriceGoodsRecord, BigDecimal> REDUCE_PRICE = createField("reduce_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "减多少钱");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.goods_price</code>. 折后价格
     */
    public final TableField<ReducePriceGoodsRecord, BigDecimal> GOODS_PRICE = createField("goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "折后价格");

    /**
     * The column <code>mini_shop_471752.b2c_reduce_price_goods.is_checked</code>. 是否选中
     */
    public final TableField<ReducePriceGoodsRecord, Byte> IS_CHECKED = createField("is_checked", org.jooq.impl.SQLDataType.TINYINT, this, "是否选中");

    /**
     * Create a <code>mini_shop_471752.b2c_reduce_price_goods</code> table reference
     */
    public ReducePriceGoods() {
        this(DSL.name("b2c_reduce_price_goods"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_reduce_price_goods</code> table reference
     */
    public ReducePriceGoods(String alias) {
        this(DSL.name(alias), REDUCE_PRICE_GOODS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_reduce_price_goods</code> table reference
     */
    public ReducePriceGoods(Name alias) {
        this(alias, REDUCE_PRICE_GOODS);
    }

    private ReducePriceGoods(Name alias, Table<ReducePriceGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReducePriceGoods(Name alias, Table<ReducePriceGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReducePriceGoods(Table<O> child, ForeignKey<O, ReducePriceGoodsRecord> key) {
        super(child, key, REDUCE_PRICE_GOODS);
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
        return Arrays.<Index>asList(Indexes.REDUCE_PRICE_GOODS_PRIMARY, Indexes.REDUCE_PRICE_GOODS_REDUCE_GOODS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReducePriceGoodsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REDUCE_PRICE_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReducePriceGoodsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_REDUCE_PRICE_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReducePriceGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<ReducePriceGoodsRecord>>asList(Keys.KEY_B2C_REDUCE_PRICE_GOODS_PRIMARY, Keys.KEY_B2C_REDUCE_PRICE_GOODS_REDUCE_GOODS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceGoods as(String alias) {
        return new ReducePriceGoods(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducePriceGoods as(Name alias) {
        return new ReducePriceGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReducePriceGoods rename(String name) {
        return new ReducePriceGoods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReducePriceGoods rename(Name name) {
        return new ReducePriceGoods(name, null);
    }
}
