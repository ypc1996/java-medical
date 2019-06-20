/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.GiftRecord;

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
public class Gift extends TableImpl<GiftRecord> {

    private static final long serialVersionUID = -1581721265;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_gift</code>
     */
    public static final Gift GIFT = new Gift();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GiftRecord> getRecordType() {
        return GiftRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_gift.id</code>.
     */
    public final TableField<GiftRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_gift.name</code>. 活动名称
     */
    public final TableField<GiftRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_gift.level</code>. 优先级
     */
    public final TableField<GiftRecord, Short> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "优先级");

    /**
     * The column <code>mini_shop_471752.b2c_gift.start_time</code>. 开始时间
     */
    public final TableField<GiftRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_gift.end_time</code>. 结束时间
     */
    public final TableField<GiftRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_gift.goods_id</code>. 活动商品
     */
    public final TableField<GiftRecord, String> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.CLOB, this, "活动商品");

    /**
     * The column <code>mini_shop_471752.b2c_gift.rule</code>. 赠品策略
     */
    public final TableField<GiftRecord, String> RULE = createField("rule", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "赠品策略");

    /**
     * The column <code>mini_shop_471752.b2c_gift.explain</code>. 说明
     */
    public final TableField<GiftRecord, String> EXPLAIN = createField("explain", org.jooq.impl.SQLDataType.CLOB, this, "说明");

    /**
     * The column <code>mini_shop_471752.b2c_gift.status</code>.
     */
    public final TableField<GiftRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_gift.add_time</code>.
     */
    public final TableField<GiftRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_gift.update_time</code>.
     */
    public final TableField<GiftRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_gift.del_flag</code>.
     */
    public final TableField<GiftRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_gift.del_time</code>.
     */
    public final TableField<GiftRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_gift</code> table reference
     */
    public Gift() {
        this(DSL.name("b2c_gift"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_gift</code> table reference
     */
    public Gift(String alias) {
        this(DSL.name(alias), GIFT);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_gift</code> table reference
     */
    public Gift(Name alias) {
        this(alias, GIFT);
    }

    private Gift(Name alias, Table<GiftRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gift(Name alias, Table<GiftRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gift(Table<O> child, ForeignKey<O, GiftRecord> key) {
        super(child, key, GIFT);
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
        return Arrays.<Index>asList(Indexes.GIFT_LEVEL, Indexes.GIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GiftRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GIFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GiftRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GIFT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GiftRecord>> getKeys() {
        return Arrays.<UniqueKey<GiftRecord>>asList(Keys.KEY_B2C_GIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gift as(String alias) {
        return new Gift(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gift as(Name alias) {
        return new Gift(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gift rename(String name) {
        return new Gift(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gift rename(Name name) {
        return new Gift(name, null);
    }
}
