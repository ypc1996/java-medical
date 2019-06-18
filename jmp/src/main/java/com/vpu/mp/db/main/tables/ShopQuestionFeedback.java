/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.ShopQuestionFeedbackRecord;

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
public class ShopQuestionFeedback extends TableImpl<ShopQuestionFeedbackRecord> {

    private static final long serialVersionUID = 1467328982;

    /**
     * The reference instance of <code>mini_main.b2c_shop_question_feedback</code>
     */
    public static final ShopQuestionFeedback SHOP_QUESTION_FEEDBACK = new ShopQuestionFeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopQuestionFeedbackRecord> getRecordType() {
        return ShopQuestionFeedbackRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.question_feedback_id</code>.
     */
    public final TableField<ShopQuestionFeedbackRecord, Integer> QUESTION_FEEDBACK_ID = createField("question_feedback_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.shop_id</code>. 反馈店铺ID
     */
    public final TableField<ShopQuestionFeedbackRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "反馈店铺ID");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.category_id</code>. 反馈问题分类
     */
    public final TableField<ShopQuestionFeedbackRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "反馈问题分类");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.mobile</code>. 填写的手机号
     */
    public final TableField<ShopQuestionFeedbackRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "填写的手机号");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.content</code>.
     */
    public final TableField<ShopQuestionFeedbackRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.is_look</code>. 1:已查看
     */
    public final TableField<ShopQuestionFeedbackRecord, Byte> IS_LOOK = createField("is_look", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:已查看");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.create_time</code>. 反馈时间
     */
    public final TableField<ShopQuestionFeedbackRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "反馈时间");

    /**
     * The column <code>mini_main.b2c_shop_question_feedback.qf_img</code>. 图片
     */
    public final TableField<ShopQuestionFeedbackRecord, String> QF_IMG = createField("qf_img", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "图片");

    /**
     * Create a <code>mini_main.b2c_shop_question_feedback</code> table reference
     */
    public ShopQuestionFeedback() {
        this(DSL.name("b2c_shop_question_feedback"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_question_feedback</code> table reference
     */
    public ShopQuestionFeedback(String alias) {
        this(DSL.name(alias), SHOP_QUESTION_FEEDBACK);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop_question_feedback</code> table reference
     */
    public ShopQuestionFeedback(Name alias) {
        this(alias, SHOP_QUESTION_FEEDBACK);
    }

    private ShopQuestionFeedback(Name alias, Table<ShopQuestionFeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShopQuestionFeedback(Name alias, Table<ShopQuestionFeedbackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShopQuestionFeedback(Table<O> child, ForeignKey<O, ShopQuestionFeedbackRecord> key) {
        super(child, key, SHOP_QUESTION_FEEDBACK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniMain.MINI_MAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SHOP_QUESTION_FEEDBACK_IS_LOOK, Indexes.SHOP_QUESTION_FEEDBACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopQuestionFeedbackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOP_QUESTION_FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopQuestionFeedbackRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_QUESTION_FEEDBACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopQuestionFeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopQuestionFeedbackRecord>>asList(Keys.KEY_B2C_SHOP_QUESTION_FEEDBACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopQuestionFeedback as(String alias) {
        return new ShopQuestionFeedback(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopQuestionFeedback as(Name alias) {
        return new ShopQuestionFeedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopQuestionFeedback rename(String name) {
        return new ShopQuestionFeedback(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShopQuestionFeedback rename(Name name) {
        return new ShopQuestionFeedback(name, null);
    }
}
