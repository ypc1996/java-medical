/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.OrderMustRecord;

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
public class OrderMust extends TableImpl<OrderMustRecord> {

    private static final long serialVersionUID = 548427854;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_order_must</code>
     */
    public static final OrderMust ORDER_MUST = new OrderMust();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderMustRecord> getRecordType() {
        return OrderMustRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_order_must.id</code>.
     */
    public final TableField<OrderMustRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.order_sn</code>. 订单号
     */
    public final TableField<OrderMustRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "订单号");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.must_content</code>. 必填信息
     */
    public final TableField<OrderMustRecord, String> MUST_CONTENT = createField("must_content", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "必填信息");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.order_real_name</code>. 下单人真实姓名
     */
    public final TableField<OrderMustRecord, String> ORDER_REAL_NAME = createField("order_real_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "下单人真实姓名");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.order_cid</code>. 下单人身份证号码
     */
    public final TableField<OrderMustRecord, String> ORDER_CID = createField("order_cid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "下单人身份证号码");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.consignee_real_name</code>. 收货人真实姓名
     */
    public final TableField<OrderMustRecord, String> CONSIGNEE_REAL_NAME = createField("consignee_real_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "收货人真实姓名");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.consignee_cid</code>. 收货人身份证号码
     */
    public final TableField<OrderMustRecord, String> CONSIGNEE_CID = createField("consignee_cid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "收货人身份证号码");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.custom_title</code>. 自定义信息标题
     */
    public final TableField<OrderMustRecord, String> CUSTOM_TITLE = createField("custom_title", org.jooq.impl.SQLDataType.VARCHAR(50), this, "自定义信息标题");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.custom</code>. 自定义信息内容
     */
    public final TableField<OrderMustRecord, String> CUSTOM = createField("custom", org.jooq.impl.SQLDataType.VARCHAR(50), this, "自定义信息内容");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.create_time</code>.
     */
    public final TableField<OrderMustRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_order_must.update_time</code>. 最后修改时间
     */
    public final TableField<OrderMustRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_order_must</code> table reference
     */
    public OrderMust() {
        this(DSL.name("b2c_order_must"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_must</code> table reference
     */
    public OrderMust(String alias) {
        this(DSL.name(alias), ORDER_MUST);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_order_must</code> table reference
     */
    public OrderMust(Name alias) {
        this(alias, ORDER_MUST);
    }

    private OrderMust(Name alias, Table<OrderMustRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderMust(Name alias, Table<OrderMustRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderMust(Table<O> child, ForeignKey<O, OrderMustRecord> key) {
        super(child, key, ORDER_MUST);
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
        return Arrays.<Index>asList(Indexes.ORDER_MUST_ORDER_SN, Indexes.ORDER_MUST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderMustRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_MUST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderMustRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ORDER_MUST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderMustRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderMustRecord>>asList(Keys.KEY_B2C_ORDER_MUST_PRIMARY, Keys.KEY_B2C_ORDER_MUST_ORDER_SN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderMust as(String alias) {
        return new OrderMust(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderMust as(Name alias) {
        return new OrderMust(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderMust rename(String name) {
        return new OrderMust(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderMust rename(Name name) {
        return new OrderMust(name, null);
    }
}
