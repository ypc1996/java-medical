/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserRebatePriceRecord;

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
public class UserRebatePrice extends TableImpl<UserRebatePriceRecord> {

    private static final long serialVersionUID = -1844236330;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_rebate_price</code>
     */
    public static final UserRebatePrice USER_REBATE_PRICE = new UserRebatePrice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRebatePriceRecord> getRecordType() {
        return UserRebatePriceRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.id</code>.
     */
    public final TableField<UserRebatePriceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.user_id</code>. 用户id
     */
    public final TableField<UserRebatePriceRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.goods_id</code>. 商品id
     */
    public final TableField<UserRebatePriceRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.product_id</code>. 产品id
     */
    public final TableField<UserRebatePriceRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "产品id");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.advice_price</code>. 分销价格
     */
    public final TableField<UserRebatePriceRecord, BigDecimal> ADVICE_PRICE = createField("advice_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "分销价格");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.expire_time</code>. 过期时间
     */
    public final TableField<UserRebatePriceRecord, Timestamp> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "过期时间");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.create_time</code>.
     */
    public final TableField<UserRebatePriceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_rebate_price.update_time</code>. 最后修改时间
     */
    public final TableField<UserRebatePriceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_rebate_price</code> table reference
     */
    public UserRebatePrice() {
        this(DSL.name("b2c_user_rebate_price"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_rebate_price</code> table reference
     */
    public UserRebatePrice(String alias) {
        this(DSL.name(alias), USER_REBATE_PRICE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_rebate_price</code> table reference
     */
    public UserRebatePrice(Name alias) {
        this(alias, USER_REBATE_PRICE);
    }

    private UserRebatePrice(Name alias, Table<UserRebatePriceRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRebatePrice(Name alias, Table<UserRebatePriceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserRebatePrice(Table<O> child, ForeignKey<O, UserRebatePriceRecord> key) {
        super(child, key, USER_REBATE_PRICE);
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
        return Arrays.<Index>asList(Indexes.USER_REBATE_PRICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRebatePriceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_REBATE_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRebatePriceRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_REBATE_PRICE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRebatePriceRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRebatePriceRecord>>asList(Keys.KEY_B2C_USER_REBATE_PRICE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRebatePrice as(String alias) {
        return new UserRebatePrice(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRebatePrice as(Name alias) {
        return new UserRebatePrice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRebatePrice rename(String name) {
        return new UserRebatePrice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRebatePrice rename(Name name) {
        return new UserRebatePrice(name, null);
    }
}
