/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.IndexFootRecordRecord;

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
public class IndexFootRecord extends TableImpl<IndexFootRecordRecord> {

    private static final long serialVersionUID = 1612589643;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_index_foot_record</code>
     */
    public static final IndexFootRecord INDEX_FOOT_RECORD = new IndexFootRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndexFootRecordRecord> getRecordType() {
        return IndexFootRecordRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.id</code>.
     */
    public final TableField<IndexFootRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.page_id</code>. 自定义页面id
     */
    public final TableField<IndexFootRecordRecord, Integer> PAGE_ID = createField("page_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "自定义页面id");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.user_id</code>.
     */
    public final TableField<IndexFootRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.count</code>. 浏览次数
     */
    public final TableField<IndexFootRecordRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "浏览次数");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.type</code>. 0 老用户 1新用户
     */
    public final TableField<IndexFootRecordRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 老用户 1新用户");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.create_time</code>.
     */
    public final TableField<IndexFootRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_index_foot_record.update_time</code>. 最后修改时间
     */
    public final TableField<IndexFootRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_index_foot_record</code> table reference
     */
    public IndexFootRecord() {
        this(DSL.name("b2c_index_foot_record"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_index_foot_record</code> table reference
     */
    public IndexFootRecord(String alias) {
        this(DSL.name(alias), INDEX_FOOT_RECORD);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_index_foot_record</code> table reference
     */
    public IndexFootRecord(Name alias) {
        this(alias, INDEX_FOOT_RECORD);
    }

    private IndexFootRecord(Name alias, Table<IndexFootRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndexFootRecord(Name alias, Table<IndexFootRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IndexFootRecord(Table<O> child, ForeignKey<O, IndexFootRecordRecord> key) {
        super(child, key, INDEX_FOOT_RECORD);
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
        return Arrays.<Index>asList(Indexes.INDEX_FOOT_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndexFootRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INDEX_FOOT_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndexFootRecordRecord> getPrimaryKey() {
        return Keys.KEY_B2C_INDEX_FOOT_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndexFootRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<IndexFootRecordRecord>>asList(Keys.KEY_B2C_INDEX_FOOT_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexFootRecord as(String alias) {
        return new IndexFootRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexFootRecord as(Name alias) {
        return new IndexFootRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexFootRecord rename(String name) {
        return new IndexFootRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndexFootRecord rename(Name name) {
        return new IndexFootRecord(name, null);
    }
}
