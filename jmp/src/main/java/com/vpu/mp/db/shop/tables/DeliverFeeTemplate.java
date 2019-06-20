/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.DeliverFeeTemplateRecord;

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
public class DeliverFeeTemplate extends TableImpl<DeliverFeeTemplateRecord> {

    private static final long serialVersionUID = -1833408568;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_deliver_fee_template</code>
     */
    public static final DeliverFeeTemplate DELIVER_FEE_TEMPLATE = new DeliverFeeTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeliverFeeTemplateRecord> getRecordType() {
        return DeliverFeeTemplateRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.deliver_template_id</code>.
     */
    public final TableField<DeliverFeeTemplateRecord, Integer> DELIVER_TEMPLATE_ID = createField("deliver_template_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.template_name</code>. 模板名称
     */
    public final TableField<DeliverFeeTemplateRecord, String> TEMPLATE_NAME = createField("template_name", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板名称");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.template_content</code>. 模板内容，json存储
     */
    public final TableField<DeliverFeeTemplateRecord, String> TEMPLATE_CONTENT = createField("template_content", org.jooq.impl.SQLDataType.CLOB, this, "模板内容，json存储");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.update_time</code>.
     */
    public final TableField<DeliverFeeTemplateRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.created</code>.
     */
    public final TableField<DeliverFeeTemplateRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.shop_id</code>. 店铺ID
     */
    public final TableField<DeliverFeeTemplateRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_deliver_fee_template.flag</code>. 0运费模板,1重量运费模板
     */
    public final TableField<DeliverFeeTemplateRecord, Byte> FLAG = createField("flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0运费模板,1重量运费模板");

    /**
     * Create a <code>mini_shop_471752.b2c_deliver_fee_template</code> table reference
     */
    public DeliverFeeTemplate() {
        this(DSL.name("b2c_deliver_fee_template"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_deliver_fee_template</code> table reference
     */
    public DeliverFeeTemplate(String alias) {
        this(DSL.name(alias), DELIVER_FEE_TEMPLATE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_deliver_fee_template</code> table reference
     */
    public DeliverFeeTemplate(Name alias) {
        this(alias, DELIVER_FEE_TEMPLATE);
    }

    private DeliverFeeTemplate(Name alias, Table<DeliverFeeTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeliverFeeTemplate(Name alias, Table<DeliverFeeTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DeliverFeeTemplate(Table<O> child, ForeignKey<O, DeliverFeeTemplateRecord> key) {
        super(child, key, DELIVER_FEE_TEMPLATE);
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
        return Arrays.<Index>asList(Indexes.DELIVER_FEE_TEMPLATE_PRIMARY, Indexes.DELIVER_FEE_TEMPLATE_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DeliverFeeTemplateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DELIVER_FEE_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DeliverFeeTemplateRecord> getPrimaryKey() {
        return Keys.KEY_B2C_DELIVER_FEE_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DeliverFeeTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<DeliverFeeTemplateRecord>>asList(Keys.KEY_B2C_DELIVER_FEE_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliverFeeTemplate as(String alias) {
        return new DeliverFeeTemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeliverFeeTemplate as(Name alias) {
        return new DeliverFeeTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliverFeeTemplate rename(String name) {
        return new DeliverFeeTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliverFeeTemplate rename(Name name) {
        return new DeliverFeeTemplate(name, null);
    }
}
