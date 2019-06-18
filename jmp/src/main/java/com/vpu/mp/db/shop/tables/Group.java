/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.GroupRecord;

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
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Group extends TableImpl<GroupRecord> {

    private static final long serialVersionUID = 1818719436;

    /**
     * The reference instance of <code>mini_shop_1.b2c_group</code>
     */
    public static final Group GROUP = new Group();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupRecord> getRecordType() {
        return GroupRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_group.group_id</code>.
     */
    public final TableField<GroupRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_group.group_name</code>.
     */
    public final TableField<GroupRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>mini_shop_1.b2c_group.in_time</code>.
     */
    public final TableField<GroupRecord, Timestamp> IN_TIME = createField("in_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mini_shop_1.b2c_group</code> table reference
     */
    public Group() {
        this(DSL.name("b2c_group"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_group</code> table reference
     */
    public Group(String alias) {
        this(DSL.name(alias), GROUP);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_group</code> table reference
     */
    public Group(Name alias) {
        this(alias, GROUP);
    }

    private Group(Name alias, Table<GroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Group(Name alias, Table<GroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Group(Table<O> child, ForeignKey<O, GroupRecord> key) {
        super(child, key, GROUP);
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
        return Arrays.<Index>asList(Indexes.GROUP_GROUP_NAME, Indexes.GROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupRecord> getPrimaryKey() {
        return Keys.KEY_B2C_GROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupRecord>>asList(Keys.KEY_B2C_GROUP_PRIMARY, Keys.KEY_B2C_GROUP_GROUP_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Group as(String alias) {
        return new Group(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Group as(Name alias) {
        return new Group(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(String name) {
        return new Group(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(Name name) {
        return new Group(name, null);
    }
}
