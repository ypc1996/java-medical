/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.BargainRecord;

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
public class Bargain extends TableImpl<BargainRecord> {

    private static final long serialVersionUID = 1140676405;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_bargain</code>
     */
    public static final Bargain BARGAIN = new Bargain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BargainRecord> getRecordType() {
        return BargainRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_bargain.id</code>.
     */
    public final TableField<BargainRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_name</code>. 活动名称
     */
    public final TableField<BargainRecord, String> BARGAIN_NAME = createField("bargain_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.goods_id</code>. 商品id
     */
    public final TableField<BargainRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.start_time</code>. 开始时间
     */
    public final TableField<BargainRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.end_time</code>. 结束时间
     */
    public final TableField<BargainRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.expectation_number</code>. 砍价预期人数
     */
    public final TableField<BargainRecord, Integer> EXPECTATION_NUMBER = createField("expectation_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "砍价预期人数");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.expectation_price</code>. 预期砍价最低金额
     */
    public final TableField<BargainRecord, BigDecimal> EXPECTATION_PRICE = createField("expectation_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "预期砍价最低金额");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_min</code>. 首次返利比例小
     */
    public final TableField<BargainRecord, Double> BARGAIN_MIN = createField("bargain_min", org.jooq.impl.SQLDataType.FLOAT, this, "首次返利比例小");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_max</code>. 首次返利比例大
     */
    public final TableField<BargainRecord, Double> BARGAIN_MAX = createField("bargain_max", org.jooq.impl.SQLDataType.FLOAT, this, "首次返利比例大");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.stock</code>. 库存
     */
    public final TableField<BargainRecord, Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "库存");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.sale_num</code>. 销售量
     */
    public final TableField<BargainRecord, Integer> SALE_NUM = createField("sale_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "销售量");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.mrking_voucher_id</code>.
     */
    public final TableField<BargainRecord, String> MRKING_VOUCHER_ID = createField("mrking_voucher_id", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.status</code>. 状态0可用1停用
     */
    public final TableField<BargainRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态0可用1停用");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.del_flag</code>. 1删除
     */
    public final TableField<BargainRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1删除");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.create_time</code>.
     */
    public final TableField<BargainRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.update_time</code>. 最后修改时间
     */
    public final TableField<BargainRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.del_time</code>.
     */
    public final TableField<BargainRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.reward_coupon_id</code>. 砍价失败发放优惠券
     */
    public final TableField<BargainRecord, String> REWARD_COUPON_ID = createField("reward_coupon_id", org.jooq.impl.SQLDataType.VARCHAR(200), this, "砍价失败发放优惠券");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.share_config</code>. 分享设置
     */
    public final TableField<BargainRecord, String> SHARE_CONFIG = createField("share_config", org.jooq.impl.SQLDataType.CLOB, this, "分享设置");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_type</code>. 砍价类型0定人1任意价
     */
    public final TableField<BargainRecord, Byte> BARGAIN_TYPE = createField("bargain_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "砍价类型0定人1任意价");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.floor_price</code>. 任意低价
     */
    public final TableField<BargainRecord, BigDecimal> FLOOR_PRICE = createField("floor_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "任意低价");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_money_type</code>. 砍价计算模式
     */
    public final TableField<BargainRecord, Byte> BARGAIN_MONEY_TYPE = createField("bargain_money_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "砍价计算模式");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_fixed_money</code>. 固定金额
     */
    public final TableField<BargainRecord, BigDecimal> BARGAIN_FIXED_MONEY = createField("bargain_fixed_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "固定金额");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_min_money</code>. 最低价
     */
    public final TableField<BargainRecord, BigDecimal> BARGAIN_MIN_MONEY = createField("bargain_min_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "最低价");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.bargain_max_money</code>. 最高价
     */
    public final TableField<BargainRecord, BigDecimal> BARGAIN_MAX_MONEY = createField("bargain_max_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "最高价");

    /**
     * The column <code>mini_shop_471752.b2c_bargain.free_freight</code>. 0不免运费，使用原商品运费模板   1免运费
     */
    public final TableField<BargainRecord, Byte> FREE_FREIGHT = createField("free_freight", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0不免运费，使用原商品运费模板   1免运费");

    /**
     * Create a <code>mini_shop_471752.b2c_bargain</code> table reference
     */
    public Bargain() {
        this(DSL.name("b2c_bargain"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_bargain</code> table reference
     */
    public Bargain(String alias) {
        this(DSL.name(alias), BARGAIN);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_bargain</code> table reference
     */
    public Bargain(Name alias) {
        this(alias, BARGAIN);
    }

    private Bargain(Name alias, Table<BargainRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bargain(Name alias, Table<BargainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Bargain(Table<O> child, ForeignKey<O, BargainRecord> key) {
        super(child, key, BARGAIN);
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
        return Arrays.<Index>asList(Indexes.BARGAIN_GOODS_ID, Indexes.BARGAIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BargainRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BARGAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BargainRecord> getPrimaryKey() {
        return Keys.KEY_B2C_BARGAIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BargainRecord>> getKeys() {
        return Arrays.<UniqueKey<BargainRecord>>asList(Keys.KEY_B2C_BARGAIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bargain as(String alias) {
        return new Bargain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bargain as(Name alias) {
        return new Bargain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bargain rename(String name) {
        return new Bargain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Bargain rename(Name name) {
        return new Bargain(name, null);
    }
}
