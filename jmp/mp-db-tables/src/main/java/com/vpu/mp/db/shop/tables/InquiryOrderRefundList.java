/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.InquiryOrderRefundListRecord;

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
 * 问诊订单退款记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InquiryOrderRefundList extends TableImpl<InquiryOrderRefundListRecord> {

    private static final long serialVersionUID = 706313369;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_inquiry_order_refund_list</code>
     */
    public static final InquiryOrderRefundList INQUIRY_ORDER_REFUND_LIST = new InquiryOrderRefundList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InquiryOrderRefundListRecord> getRecordType() {
        return InquiryOrderRefundListRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.id</code>.
     */
    public final TableField<InquiryOrderRefundListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.order_sn</code>. 订单号
     */
    public final TableField<InquiryOrderRefundListRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订单号");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.user_id</code>. 用户id
     */
    public final TableField<InquiryOrderRefundListRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.money_amount</code>. 退款金额
     */
    public final TableField<InquiryOrderRefundListRecord, BigDecimal> MONEY_AMOUNT = createField("money_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "退款金额");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.refund_reason</code>. 退款原因
     */
    public final TableField<InquiryOrderRefundListRecord, String> REFUND_REASON = createField("refund_reason", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "退款原因");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.refund_time</code>. 订单退款时间
     */
    public final TableField<InquiryOrderRefundListRecord, Timestamp> REFUND_TIME = createField("refund_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "订单退款时间");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.is_success</code>. 处理状态，1：退款成功，2：退款失败
     */
    public final TableField<InquiryOrderRefundListRecord, Byte> IS_SUCCESS = createField("is_success", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "处理状态，1：退款成功，2：退款失败");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.is_delete</code>. 删除
     */
    public final TableField<InquiryOrderRefundListRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.create_time</code>.
     */
    public final TableField<InquiryOrderRefundListRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_inquiry_order_refund_list.update_time</code>. 最后修改时间
     */
    public final TableField<InquiryOrderRefundListRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_inquiry_order_refund_list</code> table reference
     */
    public InquiryOrderRefundList() {
        this(DSL.name("b2c_inquiry_order_refund_list"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_inquiry_order_refund_list</code> table reference
     */
    public InquiryOrderRefundList(String alias) {
        this(DSL.name(alias), INQUIRY_ORDER_REFUND_LIST);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_inquiry_order_refund_list</code> table reference
     */
    public InquiryOrderRefundList(Name alias) {
        this(alias, INQUIRY_ORDER_REFUND_LIST);
    }

    private InquiryOrderRefundList(Name alias, Table<InquiryOrderRefundListRecord> aliased) {
        this(alias, aliased, null);
    }

    private InquiryOrderRefundList(Name alias, Table<InquiryOrderRefundListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("问诊订单退款记录"));
    }

    public <O extends Record> InquiryOrderRefundList(Table<O> child, ForeignKey<O, InquiryOrderRefundListRecord> key) {
        super(child, key, INQUIRY_ORDER_REFUND_LIST);
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
        return Arrays.<Index>asList(Indexes.INQUIRY_ORDER_REFUND_LIST_ORDER_SN, Indexes.INQUIRY_ORDER_REFUND_LIST_PRIMARY, Indexes.INQUIRY_ORDER_REFUND_LIST_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InquiryOrderRefundListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INQUIRY_ORDER_REFUND_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InquiryOrderRefundListRecord> getPrimaryKey() {
        return Keys.KEY_B2C_INQUIRY_ORDER_REFUND_LIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InquiryOrderRefundListRecord>> getKeys() {
        return Arrays.<UniqueKey<InquiryOrderRefundListRecord>>asList(Keys.KEY_B2C_INQUIRY_ORDER_REFUND_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryOrderRefundList as(String alias) {
        return new InquiryOrderRefundList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryOrderRefundList as(Name alias) {
        return new InquiryOrderRefundList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InquiryOrderRefundList rename(String name) {
        return new InquiryOrderRefundList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InquiryOrderRefundList rename(Name name) {
        return new InquiryOrderRefundList(name, null);
    }
}
