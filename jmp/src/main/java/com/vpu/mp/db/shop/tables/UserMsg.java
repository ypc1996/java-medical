/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserMsgRecord;

import java.sql.Date;
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
public class UserMsg extends TableImpl<UserMsgRecord> {

    private static final long serialVersionUID = 15717540;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_msg</code>
     */
    public static final UserMsg USER_MSG = new UserMsg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserMsgRecord> getRecordType() {
        return UserMsgRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.id</code>.
     */
    public final TableField<UserMsgRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.user_id</code>.
     */
    public final TableField<UserMsgRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.shop_id</code>. 店铺ID
     */
    public final TableField<UserMsgRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.msg_type</code>. login,comment,order_finish,discount,upgrade,return_order,deliver_goods,article
     */
    public final TableField<UserMsgRecord, String> MSG_TYPE = createField("msg_type", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "login,comment,order_finish,discount,upgrade,return_order,deliver_goods,article");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.msg_desc</code>.
     */
    public final TableField<UserMsgRecord, String> MSG_DESC = createField("msg_desc", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.msg_date</code>.
     */
    public final TableField<UserMsgRecord, Date> MSG_DATE = createField("msg_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.msg_id</code>. 评论时是商品id，订单是订单id
     */
    public final TableField<UserMsgRecord, String> MSG_ID = createField("msg_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "评论时是商品id，订单是订单id");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.status</code>. 0:未读，1:已读
     */
    public final TableField<UserMsgRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未读，1:已读");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.url</code>.
     */
    public final TableField<UserMsgRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_msg.in_time</code>.
     */
    public final TableField<UserMsgRecord, Timestamp> IN_TIME = createField("in_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_user_msg</code> table reference
     */
    public UserMsg() {
        this(DSL.name("b2c_user_msg"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_msg</code> table reference
     */
    public UserMsg(String alias) {
        this(DSL.name(alias), USER_MSG);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_msg</code> table reference
     */
    public UserMsg(Name alias) {
        this(alias, USER_MSG);
    }

    private UserMsg(Name alias, Table<UserMsgRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMsg(Name alias, Table<UserMsgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserMsg(Table<O> child, ForeignKey<O, UserMsgRecord> key) {
        super(child, key, USER_MSG);
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
        return Arrays.<Index>asList(Indexes.USER_MSG_PRIMARY, Indexes.USER_MSG_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserMsgRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserMsgRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_MSG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserMsgRecord>> getKeys() {
        return Arrays.<UniqueKey<UserMsgRecord>>asList(Keys.KEY_B2C_USER_MSG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMsg as(String alias) {
        return new UserMsg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMsg as(Name alias) {
        return new UserMsg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMsg rename(String name) {
        return new UserMsg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMsg rename(Name name) {
        return new UserMsg(name, null);
    }
}
