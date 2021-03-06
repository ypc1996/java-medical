/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CommentGoodsAnswerRecord;

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
public class CommentGoodsAnswer extends TableImpl<CommentGoodsAnswerRecord> {

    private static final long serialVersionUID = 592282587;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_comment_goods_answer</code>
     */
    public static final CommentGoodsAnswer COMMENT_GOODS_ANSWER = new CommentGoodsAnswer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentGoodsAnswerRecord> getRecordType() {
        return CommentGoodsAnswerRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.answer_id</code>.
     */
    public final TableField<CommentGoodsAnswerRecord, Integer> ANSWER_ID = createField("answer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.comment_id</code>. 回复的商品评论id
     */
    public final TableField<CommentGoodsAnswerRecord, Integer> COMMENT_ID = createField("comment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "回复的商品评论id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.content</code>. 回复内容
     */
    public final TableField<CommentGoodsAnswerRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "回复内容");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.del_flag</code>. 1:删除
     */
    public final TableField<CommentGoodsAnswerRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:删除");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.create_time</code>.
     */
    public final TableField<CommentGoodsAnswerRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods_answer.update_time</code>. 最后修改时间
     */
    public final TableField<CommentGoodsAnswerRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_comment_goods_answer</code> table reference
     */
    public CommentGoodsAnswer() {
        this(DSL.name("b2c_comment_goods_answer"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_goods_answer</code> table reference
     */
    public CommentGoodsAnswer(String alias) {
        this(DSL.name(alias), COMMENT_GOODS_ANSWER);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_goods_answer</code> table reference
     */
    public CommentGoodsAnswer(Name alias) {
        this(alias, COMMENT_GOODS_ANSWER);
    }

    private CommentGoodsAnswer(Name alias, Table<CommentGoodsAnswerRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommentGoodsAnswer(Name alias, Table<CommentGoodsAnswerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CommentGoodsAnswer(Table<O> child, ForeignKey<O, CommentGoodsAnswerRecord> key) {
        super(child, key, COMMENT_GOODS_ANSWER);
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
        return Arrays.<Index>asList(Indexes.COMMENT_GOODS_ANSWER_COMMENT_ID, Indexes.COMMENT_GOODS_ANSWER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentGoodsAnswerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENT_GOODS_ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentGoodsAnswerRecord> getPrimaryKey() {
        return Keys.KEY_B2C_COMMENT_GOODS_ANSWER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentGoodsAnswerRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentGoodsAnswerRecord>>asList(Keys.KEY_B2C_COMMENT_GOODS_ANSWER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentGoodsAnswer as(String alias) {
        return new CommentGoodsAnswer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentGoodsAnswer as(Name alias) {
        return new CommentGoodsAnswer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentGoodsAnswer rename(String name) {
        return new CommentGoodsAnswer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentGoodsAnswer rename(Name name) {
        return new CommentGoodsAnswer(name, null);
    }
}
