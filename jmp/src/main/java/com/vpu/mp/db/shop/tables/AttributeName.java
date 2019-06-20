/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.AttributeNameRecord;

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
public class AttributeName extends TableImpl<AttributeNameRecord> {

    private static final long serialVersionUID = -297420053;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_attribute_name</code>
     */
    public static final AttributeName ATTRIBUTE_NAME = new AttributeName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributeNameRecord> getRecordType() {
        return AttributeNameRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.attr_name_id</code>.
     */
    public final TableField<AttributeNameRecord, Integer> ATTR_NAME_ID = createField("attr_name_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.attr_type</code>. 0下拉选择，1文本输入
     */
    public final TableField<AttributeNameRecord, Byte> ATTR_TYPE = createField("attr_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0下拉选择，1文本输入");

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.for_search</code>. 1用于搜索
     */
    public final TableField<AttributeNameRecord, Byte> FOR_SEARCH = createField("for_search", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1用于搜索");

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.attr_name</code>. 属性名
     */
    public final TableField<AttributeNameRecord, String> ATTR_NAME = createField("attr_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false), this, "属性名");

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.attr_id</code>.
     */
    public final TableField<AttributeNameRecord, Integer> ATTR_ID = createField("attr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_attribute_name.is_del</code>.
     */
    public final TableField<AttributeNameRecord, Byte> IS_DEL = createField("is_del", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_attribute_name</code> table reference
     */
    public AttributeName() {
        this(DSL.name("b2c_attribute_name"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_attribute_name</code> table reference
     */
    public AttributeName(String alias) {
        this(DSL.name(alias), ATTRIBUTE_NAME);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_attribute_name</code> table reference
     */
    public AttributeName(Name alias) {
        this(alias, ATTRIBUTE_NAME);
    }

    private AttributeName(Name alias, Table<AttributeNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private AttributeName(Name alias, Table<AttributeNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AttributeName(Table<O> child, ForeignKey<O, AttributeNameRecord> key) {
        super(child, key, ATTRIBUTE_NAME);
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
        return Arrays.<Index>asList(Indexes.ATTRIBUTE_NAME_ATTR_ID, Indexes.ATTRIBUTE_NAME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AttributeNameRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ATTRIBUTE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AttributeNameRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ATTRIBUTE_NAME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AttributeNameRecord>> getKeys() {
        return Arrays.<UniqueKey<AttributeNameRecord>>asList(Keys.KEY_B2C_ATTRIBUTE_NAME_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeName as(String alias) {
        return new AttributeName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeName as(Name alias) {
        return new AttributeName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AttributeName rename(String name) {
        return new AttributeName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AttributeName rename(Name name) {
        return new AttributeName(name, null);
    }
}
