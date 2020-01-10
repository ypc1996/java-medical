/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CouponPayrewardRecordRecord;

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
public class CouponPayrewardRecord extends TableImpl<CouponPayrewardRecordRecord> {

    private static final long serialVersionUID = 490983434;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_coupon_payreward_record</code>
     */
    public static final CouponPayrewardRecord COUPON_PAYREWARD_RECORD = new CouponPayrewardRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CouponPayrewardRecordRecord> getRecordType() {
        return CouponPayrewardRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.id</code>.
     */
    public final TableField<CouponPayrewardRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.activity_id</code>. 活动id
     */
    public final TableField<CouponPayrewardRecordRecord, Integer> ACTIVITY_ID = createField("activity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "活动id");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.user_id</code>.
     */
    public final TableField<CouponPayrewardRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.receive_time</code>. 领取时间
     */
    public final TableField<CouponPayrewardRecordRecord, Timestamp> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "领取时间");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.mrking_voucher_id</code>. 已领取的优惠券
     */
    public final TableField<CouponPayrewardRecordRecord, String> MRKING_VOUCHER_ID = createField("mrking_voucher_id", org.jooq.impl.SQLDataType.VARCHAR(500), this, "已领取的优惠券");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.order_sn</code>. 订单编号
     */
    public final TableField<CouponPayrewardRecordRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.create_time</code>.
     */
    public final TableField<CouponPayrewardRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_coupon_payreward_record.update_time</code>. 最后修改时间
     */
    public final TableField<CouponPayrewardRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_coupon_payreward_record</code> table reference
     */
    public CouponPayrewardRecord() {
        this(DSL.name("b2c_coupon_payreward_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_coupon_payreward_record</code> table reference
     */
    public CouponPayrewardRecord(String alias) {
        this(DSL.name(alias), COUPON_PAYREWARD_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_coupon_payreward_record</code> table reference
     */
    public CouponPayrewardRecord(Name alias) {
        this(alias, COUPON_PAYREWARD_RECORD);
    }

    private CouponPayrewardRecord(Name alias, Table<CouponPayrewardRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private CouponPayrewardRecord(Name alias, Table<CouponPayrewardRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CouponPayrewardRecord(Table<O> child, ForeignKey<O, CouponPayrewardRecordRecord> key) {
        super(child, key, COUPON_PAYREWARD_RECORD);
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
        return Arrays.<Index>asList(Indexes.COUPON_PAYREWARD_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CouponPayrewardRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COUPON_PAYREWARD_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CouponPayrewardRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_COUPON_PAYREWARD_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CouponPayrewardRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<CouponPayrewardRecordRecord>>asList(Keys.KEY_B2C_COUPON_PAYREWARD_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponPayrewardRecord as(String alias) {
        return new CouponPayrewardRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponPayrewardRecord as(Name alias) {
        return new CouponPayrewardRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponPayrewardRecord rename(String name) {
        return new CouponPayrewardRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponPayrewardRecord rename(Name name) {
        return new CouponPayrewardRecord(name, null);
    }
}
