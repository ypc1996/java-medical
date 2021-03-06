/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DistributionOrderRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 交易订单地区分布
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributionOrder extends TableImpl<DistributionOrderRecord> {

    private static final long serialVersionUID = -467028683;

    /**
     * The reference instance of <code>jmini_shop_666666.b2c_distribution_order</code>
     */
    public static final DistributionOrder DISTRIBUTION_ORDER = new DistributionOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DistributionOrderRecord> getRecordType() {
        return DistributionOrderRecord.class;
    }

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.ref_date</code>. 2018-07
     */
    public final TableField<DistributionOrderRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(7), this, "2018-07");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.province</code>. 省
     */
    public final TableField<DistributionOrderRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR(20), this, "省");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.city</code>. 市
     */
    public final TableField<DistributionOrderRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(20), this, "市");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.district</code>. 区
     */
    public final TableField<DistributionOrderRecord, String> DISTRICT = createField("district", org.jooq.impl.SQLDataType.VARCHAR(20), this, "区");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.province_code</code>. 省份编号
     */
    public final TableField<DistributionOrderRecord, Integer> PROVINCE_CODE = createField("province_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "省份编号");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.city_code</code>. 城市编号
     */
    public final TableField<DistributionOrderRecord, Integer> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "城市编号");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.district_code</code>. 区县编号
     */
    public final TableField<DistributionOrderRecord, Integer> DISTRICT_CODE = createField("district_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "区县编号");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.pay_order_money</code>. 付款金额
     */
    public final TableField<DistributionOrderRecord, BigDecimal> PAY_ORDER_MONEY = createField("pay_order_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "付款金额");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.pay_user_num</code>. 付款人数
     */
    public final TableField<DistributionOrderRecord, Integer> PAY_USER_NUM = createField("pay_user_num", org.jooq.impl.SQLDataType.INTEGER, this, "付款人数");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.uv</code>. 访客数
     */
    public final TableField<DistributionOrderRecord, Integer> UV = createField("uv", org.jooq.impl.SQLDataType.INTEGER, this, "访客数");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.uv_pay_ratio</code>. 转化率
     */
    public final TableField<DistributionOrderRecord, BigDecimal> UV_PAY_RATIO = createField("uv_pay_ratio", org.jooq.impl.SQLDataType.DECIMAL(4, 2), this, "转化率");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.order_num</code>. 订单数
     */
    public final TableField<DistributionOrderRecord, Integer> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGER, this, "订单数");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.create_time</code>.
     */
    public final TableField<DistributionOrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.update_time</code>. 最后修改时间
     */
    public final TableField<DistributionOrderRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_666666.b2c_distribution_order.id</code>.
     */
    public final TableField<DistributionOrderRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jmini_shop_666666.b2c_distribution_order</code> table reference
     */
    public DistributionOrder() {
        this(DSL.name("b2c_distribution_order"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_distribution_order</code> table reference
     */
    public DistributionOrder(String alias) {
        this(DSL.name(alias), DISTRIBUTION_ORDER);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_distribution_order</code> table reference
     */
    public DistributionOrder(Name alias) {
        this(alias, DISTRIBUTION_ORDER);
    }

    private DistributionOrder(Name alias, Table<DistributionOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private DistributionOrder(Name alias, Table<DistributionOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("交易订单地区分布"));
    }

    public <O extends Record> DistributionOrder(Table<O> child, ForeignKey<O, DistributionOrderRecord> key) {
        super(child, key, DISTRIBUTION_ORDER);
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
        return Arrays.<Index>asList(Indexes.DISTRIBUTION_ORDER_PAY_ORDER_MONEY, Indexes.DISTRIBUTION_ORDER_PRIMARY, Indexes.DISTRIBUTION_ORDER_REF_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DistributionOrderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DISTRIBUTION_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DistributionOrderRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DISTRIBUTION_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DistributionOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<DistributionOrderRecord>>asList(Keys.KEY_B2C_DISTRIBUTION_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionOrder as(String alias) {
        return new DistributionOrder(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionOrder as(Name alias) {
        return new DistributionOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributionOrder rename(String name) {
        return new DistributionOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DistributionOrder rename(Name name) {
        return new DistributionOrder(name, null);
    }
}
