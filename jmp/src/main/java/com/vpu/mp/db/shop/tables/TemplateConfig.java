/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.TemplateConfigRecord;

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
public class TemplateConfig extends TableImpl<TemplateConfigRecord> {

    private static final long serialVersionUID = -1408278453;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_template_config</code>
     */
    public static final TemplateConfig TEMPLATE_CONFIG = new TemplateConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TemplateConfigRecord> getRecordType() {
        return TemplateConfigRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_template_config.id</code>.
     */
    public final TableField<TemplateConfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.name</code>. 消息名称
     */
    public final TableField<TemplateConfigRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "消息名称");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.action</code>. 消息类型： 1： 业务处理通知 2： 商家活动通知 3： 活动加入成功提醒
     */
    public final TableField<TemplateConfigRecord, Byte> ACTION = createField("action", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "消息类型： 1： 业务处理通知 2： 商家活动通知 3： 活动加入成功提醒");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.title</code>. 业务标题
     */
    public final TableField<TemplateConfigRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "业务标题");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.template_id</code>. 选择的模板id
     */
    public final TableField<TemplateConfigRecord, Integer> TEMPLATE_ID = createField("template_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "选择的模板id");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.content</code>. 业务内容
     */
    public final TableField<TemplateConfigRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "业务内容");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.page_link</code>. 页面链接
     */
    public final TableField<TemplateConfigRecord, String> PAGE_LINK = createField("page_link", org.jooq.impl.SQLDataType.VARCHAR(255), this, "页面链接");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.send_condition</code>. 筛选发送人条件
     */
    public final TableField<TemplateConfigRecord, String> SEND_CONDITION = createField("send_condition", org.jooq.impl.SQLDataType.CLOB, this, "筛选发送人条件");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.to_user</code>. 发送人，逗号分隔，* 代表全部
     */
    public final TableField<TemplateConfigRecord, String> TO_USER = createField("to_user", org.jooq.impl.SQLDataType.CLOB, this, "发送人，逗号分隔，* 代表全部");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.send_action</code>. 发送方式： 1：立即发送  2： 持续发送  3：定时发送
     */
    public final TableField<TemplateConfigRecord, Byte> SEND_ACTION = createField("send_action", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "发送方式： 1：立即发送  2： 持续发送  3：定时发送");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.send_status</code>. 发送完成 1： 完成
     */
    public final TableField<TemplateConfigRecord, Byte> SEND_STATUS = createField("send_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "发送完成 1： 完成");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.start_time</code>. 发送起始时间
     */
    public final TableField<TemplateConfigRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "发送起始时间");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.end_time</code>. 发送终止时间
     */
    public final TableField<TemplateConfigRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "发送终止时间");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.del_flag</code>. 删除标识
     */
    public final TableField<TemplateConfigRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标识");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.del_time</code>.
     */
    public final TableField<TemplateConfigRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.create_time</code>.
     */
    public final TableField<TemplateConfigRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_template_config.update_time</code>. 最后修改时间
     */
    public final TableField<TemplateConfigRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_template_config</code> table reference
     */
    public TemplateConfig() {
        this(DSL.name("b2c_template_config"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_template_config</code> table reference
     */
    public TemplateConfig(String alias) {
        this(DSL.name(alias), TEMPLATE_CONFIG);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_template_config</code> table reference
     */
    public TemplateConfig(Name alias) {
        this(alias, TEMPLATE_CONFIG);
    }

    private TemplateConfig(Name alias, Table<TemplateConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private TemplateConfig(Name alias, Table<TemplateConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TemplateConfig(Table<O> child, ForeignKey<O, TemplateConfigRecord> key) {
        super(child, key, TEMPLATE_CONFIG);
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
        return Arrays.<Index>asList(Indexes.TEMPLATE_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TemplateConfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TEMPLATE_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TemplateConfigRecord> getPrimaryKey() {
        return Keys.KEY_B2C_TEMPLATE_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TemplateConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<TemplateConfigRecord>>asList(Keys.KEY_B2C_TEMPLATE_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TemplateConfig as(String alias) {
        return new TemplateConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TemplateConfig as(Name alias) {
        return new TemplateConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateConfig rename(String name) {
        return new TemplateConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateConfig rename(Name name) {
        return new TemplateConfig(name, null);
    }
}
