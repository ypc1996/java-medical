/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.ShareSplitRecord;

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
public class ShareSplit extends TableImpl<ShareSplitRecord> {

    private static final long serialVersionUID = -88692778;

    /**
     * The reference instance of <code>mini_shop_1.b2c_share_split</code>
     */
    public static final ShareSplit SHARE_SPLIT = new ShareSplit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShareSplitRecord> getRecordType() {
        return ShareSplitRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_share_split.id</code>.
     */
    public final TableField<ShareSplitRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_share_split.user</code>. 分享的user_id
     */
    public final TableField<ShareSplitRecord, UInteger> USER = createField("user", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "分享的user_id");

    /**
     * The column <code>mini_shop_1.b2c_share_split.user_id</code>. 分享领取的user_id
     */
    public final TableField<ShareSplitRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "分享领取的user_id");

    /**
     * The column <code>mini_shop_1.b2c_share_split.act_id</code>. 分裂优惠券id
     */
    public final TableField<ShareSplitRecord, UInteger> ACT_ID = createField("act_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "分裂优惠券id");

    /**
     * The column <code>mini_shop_1.b2c_share_split.create_time</code>. 领取时间
     */
    public final TableField<ShareSplitRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "领取时间");

    /**
     * The column <code>mini_shop_1.b2c_share_split.order_sn</code>.
     */
    public final TableField<ShareSplitRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_1.b2c_share_split.share_limit</code>. 可分享个数
     */
    public final TableField<ShareSplitRecord, Integer> SHARE_LIMIT = createField("share_limit", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "可分享个数");

    /**
     * Create a <code>mini_shop_1.b2c_share_split</code> table reference
     */
    public ShareSplit() {
        this(DSL.name("b2c_share_split"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_share_split</code> table reference
     */
    public ShareSplit(String alias) {
        this(DSL.name(alias), SHARE_SPLIT);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_share_split</code> table reference
     */
    public ShareSplit(Name alias) {
        this(alias, SHARE_SPLIT);
    }

    private ShareSplit(Name alias, Table<ShareSplitRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShareSplit(Name alias, Table<ShareSplitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShareSplit(Table<O> child, ForeignKey<O, ShareSplitRecord> key) {
        super(child, key, SHARE_SPLIT);
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
        return Arrays.<Index>asList(Indexes.SHARE_SPLIT_PRIMARY, Indexes.SHARE_SPLIT_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShareSplitRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_SHARE_SPLIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShareSplitRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHARE_SPLIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShareSplitRecord>> getKeys() {
        return Arrays.<UniqueKey<ShareSplitRecord>>asList(Keys.KEY_B2C_SHARE_SPLIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareSplit as(String alias) {
        return new ShareSplit(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareSplit as(Name alias) {
        return new ShareSplit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShareSplit rename(String name) {
        return new ShareSplit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShareSplit rename(Name name) {
        return new ShareSplit(name, null);
    }
}
