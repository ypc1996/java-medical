/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.GoodsDeliverTemplateLinkRecord;

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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoodsDeliverTemplateLink extends TableImpl<GoodsDeliverTemplateLinkRecord> {

    private static final long serialVersionUID = 571508751;

    /**
     * The reference instance of <code>mini_shop_1.b2c_goods_deliver_template_link</code>
     */
    public static final GoodsDeliverTemplateLink GOODS_DELIVER_TEMPLATE_LINK = new GoodsDeliverTemplateLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsDeliverTemplateLinkRecord> getRecordType() {
        return GoodsDeliverTemplateLinkRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_goods_deliver_template_link.rec_id</code>.
     */
    public final TableField<GoodsDeliverTemplateLinkRecord, UInteger> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_goods_deliver_template_link.goods_id</code>.
     */
    public final TableField<GoodsDeliverTemplateLinkRecord, UInteger> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>mini_shop_1.b2c_goods_deliver_template_link.deliver_template_id</code>.
     */
    public final TableField<GoodsDeliverTemplateLinkRecord, UInteger> DELIVER_TEMPLATE_ID = createField("deliver_template_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>mini_shop_1.b2c_goods_deliver_template_link.created</code>.
     */
    public final TableField<GoodsDeliverTemplateLinkRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mini_shop_1.b2c_goods_deliver_template_link</code> table reference
     */
    public GoodsDeliverTemplateLink() {
        this(DSL.name("b2c_goods_deliver_template_link"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_goods_deliver_template_link</code> table reference
     */
    public GoodsDeliverTemplateLink(String alias) {
        this(DSL.name(alias), GOODS_DELIVER_TEMPLATE_LINK);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_goods_deliver_template_link</code> table reference
     */
    public GoodsDeliverTemplateLink(Name alias) {
        this(alias, GOODS_DELIVER_TEMPLATE_LINK);
    }

    private GoodsDeliverTemplateLink(Name alias, Table<GoodsDeliverTemplateLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoodsDeliverTemplateLink(Name alias, Table<GoodsDeliverTemplateLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GoodsDeliverTemplateLink(Table<O> child, ForeignKey<O, GoodsDeliverTemplateLinkRecord> key) {
        super(child, key, GOODS_DELIVER_TEMPLATE_LINK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_1.MINI_SHOP_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GOODS_DELIVER_TEMPLATE_LINK_GOODS_ID, Indexes.GOODS_DELIVER_TEMPLATE_LINK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GoodsDeliverTemplateLinkRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_GOODS_DELIVER_TEMPLATE_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GoodsDeliverTemplateLinkRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GOODS_DELIVER_TEMPLATE_LINK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GoodsDeliverTemplateLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsDeliverTemplateLinkRecord>>asList(Keys.KEY_B2C_GOODS_DELIVER_TEMPLATE_LINK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsDeliverTemplateLink as(String alias) {
        return new GoodsDeliverTemplateLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsDeliverTemplateLink as(Name alias) {
        return new GoodsDeliverTemplateLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsDeliverTemplateLink rename(String name) {
        return new GoodsDeliverTemplateLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GoodsDeliverTemplateLink rename(Name name) {
        return new GoodsDeliverTemplateLink(name, null);
    }
}
