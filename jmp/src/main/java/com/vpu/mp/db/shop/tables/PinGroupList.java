/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PinGroupListRecord;

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
public class PinGroupList extends TableImpl<PinGroupListRecord> {

    private static final long serialVersionUID = -1421034763;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_pin_group_list</code>
     */
    public static final PinGroupList PIN_GROUP_LIST = new PinGroupList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PinGroupListRecord> getRecordType() {
        return PinGroupListRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.id</code>.
     */
    public final TableField<PinGroupListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.pin_activity_id</code>. 拼团活动定义ID
     */
    public final TableField<PinGroupListRecord, Integer> PIN_ACTIVITY_ID = createField("pin_activity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "拼团活动定义ID");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.goods_id</code>.
     */
    public final TableField<PinGroupListRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.group_id</code>. 拼团ID
     */
    public final TableField<PinGroupListRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "拼团ID");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.user_id</code>.
     */
    public final TableField<PinGroupListRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.is_grouper</code>. 是否为团长 1：是 0：否
     */
    public final TableField<PinGroupListRecord, Byte> IS_GROUPER = createField("is_grouper", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否为团长 1：是 0：否");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.order_sn</code>. 订单编号
     */
    public final TableField<PinGroupListRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.status</code>. 0: 拼团中 1:拼团成功 2:拼团失败
     */
    public final TableField<PinGroupListRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0: 拼团中 1:拼团成功 2:拼团失败");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.start_time</code>. 开团时间
     */
    public final TableField<PinGroupListRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开团时间");

    /**
     * The column <code>mini_shop_471752.b2c_pin_group_list.end_time</code>. 成团时间
     */
    public final TableField<PinGroupListRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "成团时间");

    /**
     * Create a <code>mini_shop_471752.b2c_pin_group_list</code> table reference
     */
    public PinGroupList() {
        this(DSL.name("b2c_pin_group_list"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pin_group_list</code> table reference
     */
    public PinGroupList(String alias) {
        this(DSL.name(alias), PIN_GROUP_LIST);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pin_group_list</code> table reference
     */
    public PinGroupList(Name alias) {
        this(alias, PIN_GROUP_LIST);
    }

    private PinGroupList(Name alias, Table<PinGroupListRecord> aliased) {
        this(alias, aliased, null);
    }

    private PinGroupList(Name alias, Table<PinGroupListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PinGroupList(Table<O> child, ForeignKey<O, PinGroupListRecord> key) {
        super(child, key, PIN_GROUP_LIST);
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
        return Arrays.<Index>asList(Indexes.PIN_GROUP_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PinGroupListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PIN_GROUP_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PinGroupListRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PIN_GROUP_LIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PinGroupListRecord>> getKeys() {
        return Arrays.<UniqueKey<PinGroupListRecord>>asList(Keys.KEY_B2C_PIN_GROUP_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupList as(String alias) {
        return new PinGroupList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinGroupList as(Name alias) {
        return new PinGroupList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PinGroupList rename(String name) {
        return new PinGroupList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PinGroupList rename(Name name) {
        return new PinGroupList(name, null);
    }
}
