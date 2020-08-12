/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ImSessionItemRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 问诊会话详情 记录每一条会话
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImSessionItem extends TableImpl<ImSessionItemRecord> {

    private static final long serialVersionUID = -30833531;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_im_session_item</code>
     */
    public static final ImSessionItem IM_SESSION_ITEM = new ImSessionItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImSessionItemRecord> getRecordType() {
        return ImSessionItemRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.id</code>. 主键id
     */
    public final TableField<ImSessionItemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.im_session_id</code>. 会话id
     */
    public final TableField<ImSessionItemRecord, Integer> IM_SESSION_ID = createField("im_session_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "会话id");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.from_id</code>. 本条消息发起者id 医师id或用户userId
     */
    public final TableField<ImSessionItemRecord, Integer> FROM_ID = createField("from_id", org.jooq.impl.SQLDataType.INTEGER, this, "本条消息发起者id 医师id或用户userId");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.to_id</code>. 本跳消息接收者id  医师id或用户userId
     */
    public final TableField<ImSessionItemRecord, Integer> TO_ID = createField("to_id", org.jooq.impl.SQLDataType.INTEGER, this, "本跳消息接收者id  医师id或用户userId");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.message</code>. 本条消息内容
     */
    public final TableField<ImSessionItemRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "本条消息内容");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.type</code>. 消息类型 0文本 1图片 2处方 3患者病历简略信息
     */
    public final TableField<ImSessionItemRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT, this, "消息类型 0文本 1图片 2处方 3患者病历简略信息");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.is_leaving_message</code>. 是否是留言信息
     */
    public final TableField<ImSessionItemRecord, Byte> IS_LEAVING_MESSAGE = createField("is_leaving_message", org.jooq.impl.SQLDataType.TINYINT, this, "是否是留言信息");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.send_time</code>. 用户消息发送时间
     */
    public final TableField<ImSessionItemRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "用户消息发送时间");

    /**
     * The column <code>mini_shop_471752.b2c_im_session_item.create_time</code>. 生成时间
     */
    public final TableField<ImSessionItemRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "生成时间");

    /**
     * Create a <code>mini_shop_471752.b2c_im_session_item</code> table reference
     */
    public ImSessionItem() {
        this(DSL.name("b2c_im_session_item"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_im_session_item</code> table reference
     */
    public ImSessionItem(String alias) {
        this(DSL.name(alias), IM_SESSION_ITEM);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_im_session_item</code> table reference
     */
    public ImSessionItem(Name alias) {
        this(alias, IM_SESSION_ITEM);
    }

    private ImSessionItem(Name alias, Table<ImSessionItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ImSessionItem(Name alias, Table<ImSessionItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("问诊会话详情 记录每一条会话"));
    }

    public <O extends Record> ImSessionItem(Table<O> child, ForeignKey<O, ImSessionItemRecord> key) {
        super(child, key, IM_SESSION_ITEM);
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
        return Arrays.<Index>asList(Indexes.IM_SESSION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ImSessionItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IM_SESSION_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ImSessionItemRecord> getPrimaryKey() {
        return Keys.KEY_B2C_IM_SESSION_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ImSessionItemRecord>> getKeys() {
        return Arrays.<UniqueKey<ImSessionItemRecord>>asList(Keys.KEY_B2C_IM_SESSION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItem as(String alias) {
        return new ImSessionItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImSessionItem as(Name alias) {
        return new ImSessionItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ImSessionItem rename(String name) {
        return new ImSessionItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ImSessionItem rename(Name name) {
        return new ImSessionItem(name, null);
    }
}
