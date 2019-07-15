/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.AssessActivityRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AssessActivity extends TableImpl<AssessActivityRecord> {

    private static final long serialVersionUID = 1205674984;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_assess_activity</code>
     */
    public static final AssessActivity ASSESS_ACTIVITY = new AssessActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssessActivityRecord> getRecordType() {
        return AssessActivityRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.id</code>.
     */
    public final TableField<AssessActivityRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.shop_id</code>. 店铺ID
     */
    public final TableField<AssessActivityRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.act_code</code>. 活动编码
     */
    public final TableField<AssessActivityRecord, String> ACT_CODE = createField("act_code", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "活动编码");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.act_name</code>. 活动名称
     */
    public final TableField<AssessActivityRecord, String> ACT_NAME = createField("act_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "活动名称");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.start_time</code>. 活动起始时间
     */
    public final TableField<AssessActivityRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "活动起始时间");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.end_time</code>. 活动截止时间
     */
    public final TableField<AssessActivityRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "活动截止时间");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.due_time_type</code>. 是否永久有效：0否，1是
     */
    public final TableField<AssessActivityRecord, Byte> DUE_TIME_TYPE = createField("due_time_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否永久有效：0否，1是");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.part_times_type</code>. 单用户参与次数类型：0不限制，1限制次数
     */
    public final TableField<AssessActivityRecord, Byte> PART_TIMES_TYPE = createField("part_times_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "单用户参与次数类型：0不限制，1限制次数");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.part_times_day</code>. 每天最多参与次数：默认为1,0表示不限制
     */
    public final TableField<AssessActivityRecord, Integer> PART_TIMES_DAY = createField("part_times_day", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "每天最多参与次数：默认为1,0表示不限制");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.part_times_total</code>. 累计最多参与次数：默认为1,0表示不限制
     */
    public final TableField<AssessActivityRecord, Integer> PART_TIMES_TOTAL = createField("part_times_total", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "累计最多参与次数：默认为1,0表示不限制");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.feedback_total</code>. 活动总反馈数量：默认为0,0表示不限制
     */
    public final TableField<AssessActivityRecord, Integer> FEEDBACK_TOTAL = createField("feedback_total", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "活动总反馈数量：默认为0,0表示不限制");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.assess_judge_type</code>. 测评结果判断条件：0根据选项判断，1根据得分判断
     */
    public final TableField<AssessActivityRecord, Byte> ASSESS_JUDGE_TYPE = createField("assess_judge_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "测评结果判断条件：0根据选项判断，1根据得分判断");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.cover_style_type</code>. 封面样式类型：0默认样式，1自定义
     */
    public final TableField<AssessActivityRecord, Byte> COVER_STYLE_TYPE = createField("cover_style_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "封面样式类型：0默认样式，1自定义");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.cover_style</code>. 封面样式内容，json串
     */
    public final TableField<AssessActivityRecord, String> COVER_STYLE = createField("cover_style", org.jooq.impl.SQLDataType.CLOB, this, "封面样式内容，json串");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.assess_desc</code>. 测评介绍
     */
    public final TableField<AssessActivityRecord, String> ASSESS_DESC = createField("assess_desc", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "测评介绍");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.create_time</code>.
     */
    public final TableField<AssessActivityRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.update_time</code>. 最后修改时间
     */
    public final TableField<AssessActivityRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.is_block</code>. 活动状态：0未停用，1已停用
     */
    public final TableField<AssessActivityRecord, Byte> IS_BLOCK = createField("is_block", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "活动状态：0未停用，1已停用");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.del_flag</code>. 删除标识：0未删除，1已删除
     */
    public final TableField<AssessActivityRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标识：0未删除，1已删除");

    /**
     * The column <code>mini_shop_471752.b2c_assess_activity.pub_flag</code>. 发布标识：0未发布，1已发布
     */
    public final TableField<AssessActivityRecord, Byte> PUB_FLAG = createField("pub_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "发布标识：0未发布，1已发布");

    /**
     * Create a <code>mini_shop_471752.b2c_assess_activity</code> table reference
     */
    public AssessActivity() {
        this(DSL.name("b2c_assess_activity"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_assess_activity</code> table reference
     */
    public AssessActivity(String alias) {
        this(DSL.name(alias), ASSESS_ACTIVITY);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_assess_activity</code> table reference
     */
    public AssessActivity(Name alias) {
        this(alias, ASSESS_ACTIVITY);
    }

    private AssessActivity(Name alias, Table<AssessActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssessActivity(Name alias, Table<AssessActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AssessActivity(Table<O> child, ForeignKey<O, AssessActivityRecord> key) {
        super(child, key, ASSESS_ACTIVITY);
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
        return Arrays.<Index>asList(Indexes.ASSESS_ACTIVITY_ACT_NAME, Indexes.ASSESS_ACTIVITY_PRIMARY, Indexes.ASSESS_ACTIVITY_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AssessActivityRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_ASSESS_ACTIVITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AssessActivityRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ASSESS_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AssessActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<AssessActivityRecord>>asList(Keys.KEY_B2C_ASSESS_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessActivity as(String alias) {
        return new AssessActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssessActivity as(Name alias) {
        return new AssessActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessActivity rename(String name) {
        return new AssessActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AssessActivity rename(Name name) {
        return new AssessActivity(name, null);
    }
}
