/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CouponActivityRecord;

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
public class CouponActivity extends TableImpl<CouponActivityRecord> {

    private static final long serialVersionUID = -87098319;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_coupon_activity</code>
     */
    public static final CouponActivity COUPON_ACTIVITY = new CouponActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CouponActivityRecord> getRecordType() {
        return CouponActivityRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.id</code>.
     */
    public final TableField<CouponActivityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.activity_action</code>. 活动类型：1：活动送券 2：大转盘抽奖
     */
    public final TableField<CouponActivityRecord, Byte> ACTIVITY_ACTION = createField("activity_action", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "活动类型：1：活动送券 2：大转盘抽奖");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.action</code>. 针对用户群体： 1: 新用户 2: 全部用户
     */
    public final TableField<CouponActivityRecord, Byte> ACTION = createField("action", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "针对用户群体： 1: 新用户 2: 全部用户");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.name</code>. 活动名称
     */
    public final TableField<CouponActivityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.title</code>. 宣传语
     */
    public final TableField<CouponActivityRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "宣传语");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.bg_action</code>. 背景图
     */
    public final TableField<CouponActivityRecord, Byte> BG_ACTION = createField("bg_action", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "背景图");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.start_date</code>. 有效期-起始
     */
    public final TableField<CouponActivityRecord, Timestamp> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "有效期-起始");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.end_date</code>. 有效期-结束
     */
    public final TableField<CouponActivityRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "有效期-结束");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.mrking_voucher_id</code>. 活动优惠券，逗号分隔
     */
    public final TableField<CouponActivityRecord, String> MRKING_VOUCHER_ID = createField("mrking_voucher_id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "活动优惠券，逗号分隔");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.status</code>. 状态： 1: 正常 0: 关闭
     */
    public final TableField<CouponActivityRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "状态： 1: 正常 0: 关闭");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.del_flag</code>.
     */
    public final TableField<CouponActivityRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.del_time</code>.
     */
    public final TableField<CouponActivityRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.create_time</code>.
     */
    public final TableField<CouponActivityRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_activity.update_time</code>. 最后修改时间
     */
    public final TableField<CouponActivityRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_coupon_activity</code> table reference
     */
    public CouponActivity() {
        this(DSL.name("b2c_coupon_activity"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_coupon_activity</code> table reference
     */
    public CouponActivity(String alias) {
        this(DSL.name(alias), COUPON_ACTIVITY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_coupon_activity</code> table reference
     */
    public CouponActivity(Name alias) {
        this(alias, COUPON_ACTIVITY);
    }

    private CouponActivity(Name alias, Table<CouponActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private CouponActivity(Name alias, Table<CouponActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CouponActivity(Table<O> child, ForeignKey<O, CouponActivityRecord> key) {
        super(child, key, COUPON_ACTIVITY);
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
        return Arrays.<Index>asList(Indexes.COUPON_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CouponActivityRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COUPON_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CouponActivityRecord> getPrimaryKey() {
        return Keys.KEY_B2C_COUPON_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CouponActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<CouponActivityRecord>>asList(Keys.KEY_B2C_COUPON_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivity as(String alias) {
        return new CouponActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponActivity as(Name alias) {
        return new CouponActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponActivity rename(String name) {
        return new CouponActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponActivity rename(Name name) {
        return new CouponActivity(name, null);
    }
}
