/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PurchasePriceDefineRecord;

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
public class PurchasePriceDefine extends TableImpl<PurchasePriceDefineRecord> {

    private static final long serialVersionUID = 119700623;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_purchase_price_define</code>
     */
    public static final PurchasePriceDefine PURCHASE_PRICE_DEFINE = new PurchasePriceDefine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PurchasePriceDefineRecord> getRecordType() {
        return PurchasePriceDefineRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.id</code>.
     */
    public final TableField<PurchasePriceDefineRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.name</code>. 活动名称
     */
    public final TableField<PurchasePriceDefineRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.level</code>. 优先级
     */
    public final TableField<PurchasePriceDefineRecord, Short> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "优先级");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.max_change_purchase</code>. 最大换购数
     */
    public final TableField<PurchasePriceDefineRecord, Short> MAX_CHANGE_PURCHASE = createField("max_change_purchase", org.jooq.impl.SQLDataType.SMALLINT, this, "最大换购数");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.goods_id</code>. 主商品
     */
    public final TableField<PurchasePriceDefineRecord, String> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.CLOB, this, "主商品");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.start_time</code>. 开始时间
     */
    public final TableField<PurchasePriceDefineRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.end_time</code>. 结束时间
     */
    public final TableField<PurchasePriceDefineRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.status</code>. 状态 1: 启用 0:禁用
     */
    public final TableField<PurchasePriceDefineRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "状态 1: 启用 0:禁用");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.del_flag</code>.
     */
    public final TableField<PurchasePriceDefineRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.del_time</code>. 删除时间
     */
    public final TableField<PurchasePriceDefineRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "删除时间");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.create_time</code>.
     */
    public final TableField<PurchasePriceDefineRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.update_time</code>. 最后修改时间
     */
    public final TableField<PurchasePriceDefineRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.redemption_freight</code>. 换购商品运费策略，0免运费，1使用原商品运费模板
     */
    public final TableField<PurchasePriceDefineRecord, Byte> REDEMPTION_FREIGHT = createField("redemption_freight", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "换购商品运费策略，0免运费，1使用原商品运费模板");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.activity_tag</code>. 是否给参加活动的用户打标签，1是
     */
    public final TableField<PurchasePriceDefineRecord, Byte> ACTIVITY_TAG = createField("activity_tag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否给参加活动的用户打标签，1是");

    /**
     * The column <code>mini_shop_471752.b2c_purchase_price_define.activity_tag_id</code>. 参加活动打标签id
     */
    public final TableField<PurchasePriceDefineRecord, String> ACTIVITY_TAG_ID = createField("activity_tag_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "参加活动打标签id");

    /**
     * Create a <code>mini_shop_471752.b2c_purchase_price_define</code> table reference
     */
    public PurchasePriceDefine() {
        this(DSL.name("b2c_purchase_price_define"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_purchase_price_define</code> table reference
     */
    public PurchasePriceDefine(String alias) {
        this(DSL.name(alias), PURCHASE_PRICE_DEFINE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_purchase_price_define</code> table reference
     */
    public PurchasePriceDefine(Name alias) {
        this(alias, PURCHASE_PRICE_DEFINE);
    }

    private PurchasePriceDefine(Name alias, Table<PurchasePriceDefineRecord> aliased) {
        this(alias, aliased, null);
    }

    private PurchasePriceDefine(Name alias, Table<PurchasePriceDefineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PurchasePriceDefine(Table<O> child, ForeignKey<O, PurchasePriceDefineRecord> key) {
        super(child, key, PURCHASE_PRICE_DEFINE);
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
        return Arrays.<Index>asList(Indexes.PURCHASE_PRICE_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PurchasePriceDefineRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PURCHASE_PRICE_DEFINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PurchasePriceDefineRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PURCHASE_PRICE_DEFINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PurchasePriceDefineRecord>> getKeys() {
        return Arrays.<UniqueKey<PurchasePriceDefineRecord>>asList(Keys.KEY_B2C_PURCHASE_PRICE_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePriceDefine as(String alias) {
        return new PurchasePriceDefine(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasePriceDefine as(Name alias) {
        return new PurchasePriceDefine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePriceDefine rename(String name) {
        return new PurchasePriceDefine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasePriceDefine rename(Name name) {
        return new PurchasePriceDefine(name, null);
    }
}
