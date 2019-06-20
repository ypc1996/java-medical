/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PinIntegrationDefineRecord;

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
public class PinIntegrationDefine extends TableImpl<PinIntegrationDefineRecord> {

    private static final long serialVersionUID = -1378668012;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_pin_integration_define</code>
     */
    public static final PinIntegrationDefine PIN_INTEGRATION_DEFINE = new PinIntegrationDefine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PinIntegrationDefineRecord> getRecordType() {
        return PinIntegrationDefineRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.id</code>.
     */
    public final TableField<PinIntegrationDefineRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.shop_id</code>. 店铺ID
     */
    public final TableField<PinIntegrationDefineRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.name</code>. 活动名称
     */
    public final TableField<PinIntegrationDefineRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.inte_total</code>. 总抽奖积分
     */
    public final TableField<PinIntegrationDefineRecord, Integer> INTE_TOTAL = createField("inte_total", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "总抽奖积分");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.inte_group</code>. 每个团总积分
     */
    public final TableField<PinIntegrationDefineRecord, Integer> INTE_GROUP = createField("inte_group", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "每个团总积分");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.limit_amount</code>. 成团人数
     */
    public final TableField<PinIntegrationDefineRecord, Short> LIMIT_AMOUNT = createField("limit_amount", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "成团人数");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.join_limit</code>. 参团限制
     */
    public final TableField<PinIntegrationDefineRecord, Short> JOIN_LIMIT = createField("join_limit", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "参团限制");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.divide_type</code>. 瓜分方式：0：按邀请好友数量瓜分，1：好友均分，2：随机瓜分
     */
    public final TableField<PinIntegrationDefineRecord, Byte> DIVIDE_TYPE = createField("divide_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "瓜分方式：0：按邀请好友数量瓜分，1：好友均分，2：随机瓜分");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.start_time</code>. 开始时间
     */
    public final TableField<PinIntegrationDefineRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.end_time</code>. 结束时间
     */
    public final TableField<PinIntegrationDefineRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.status</code>. 状态： 1：启用  0： 禁用
     */
    public final TableField<PinIntegrationDefineRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "状态： 1：启用  0： 禁用");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.add_time</code>.
     */
    public final TableField<PinIntegrationDefineRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.update_time</code>.
     */
    public final TableField<PinIntegrationDefineRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.del_flag</code>.
     */
    public final TableField<PinIntegrationDefineRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.del_time</code>.
     */
    public final TableField<PinIntegrationDefineRecord, Integer> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.inte_remain</code>. 剩余积分
     */
    public final TableField<PinIntegrationDefineRecord, Integer> INTE_REMAIN = createField("inte_remain", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "剩余积分");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.is_day_divide</code>. 是否开团24小时自动开奖
     */
    public final TableField<PinIntegrationDefineRecord, Byte> IS_DAY_DIVIDE = createField("is_day_divide", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "是否开团24小时自动开奖");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.param_n</code>. 常数n
     */
    public final TableField<PinIntegrationDefineRecord, Double> PARAM_N = createField("param_n", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.FLOAT)), this, "常数n");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.is_continue</code>. 继续： 1：继续  0： 结束
     */
    public final TableField<PinIntegrationDefineRecord, Byte> IS_CONTINUE = createField("is_continue", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "继续： 1：继续  0： 结束");

    /**
     * The column <code>mini_shop_471752.b2c_pin_integration_define.advertise</code>. 活动宣传语
     */
    public final TableField<PinIntegrationDefineRecord, String> ADVERTISE = createField("advertise", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "活动宣传语");

    /**
     * Create a <code>mini_shop_471752.b2c_pin_integration_define</code> table reference
     */
    public PinIntegrationDefine() {
        this(DSL.name("b2c_pin_integration_define"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pin_integration_define</code> table reference
     */
    public PinIntegrationDefine(String alias) {
        this(DSL.name(alias), PIN_INTEGRATION_DEFINE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pin_integration_define</code> table reference
     */
    public PinIntegrationDefine(Name alias) {
        this(alias, PIN_INTEGRATION_DEFINE);
    }

    private PinIntegrationDefine(Name alias, Table<PinIntegrationDefineRecord> aliased) {
        this(alias, aliased, null);
    }

    private PinIntegrationDefine(Name alias, Table<PinIntegrationDefineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PinIntegrationDefine(Table<O> child, ForeignKey<O, PinIntegrationDefineRecord> key) {
        super(child, key, PIN_INTEGRATION_DEFINE);
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
        return Arrays.<Index>asList(Indexes.PIN_INTEGRATION_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PinIntegrationDefineRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PIN_INTEGRATION_DEFINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PinIntegrationDefineRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PIN_INTEGRATION_DEFINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PinIntegrationDefineRecord>> getKeys() {
        return Arrays.<UniqueKey<PinIntegrationDefineRecord>>asList(Keys.KEY_B2C_PIN_INTEGRATION_DEFINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefine as(String alias) {
        return new PinIntegrationDefine(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationDefine as(Name alias) {
        return new PinIntegrationDefine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PinIntegrationDefine rename(String name) {
        return new PinIntegrationDefine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PinIntegrationDefine rename(Name name) {
        return new PinIntegrationDefine(name, null);
    }
}
