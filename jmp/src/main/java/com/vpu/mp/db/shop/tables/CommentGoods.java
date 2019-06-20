/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.CommentGoodsRecord;

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
public class CommentGoods extends TableImpl<CommentGoodsRecord> {

    private static final long serialVersionUID = -375507384;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_comment_goods</code>
     */
    public static final CommentGoods COMMENT_GOODS = new CommentGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentGoodsRecord> getRecordType() {
        return CommentGoodsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.id</code>.
     */
    public final TableField<CommentGoodsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.shop_id</code>. 店铺ID
     */
    public final TableField<CommentGoodsRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "店铺ID");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.user_id</code>. 用户ID
     */
    public final TableField<CommentGoodsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户ID");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.commstar</code>. 评价星级
     */
    public final TableField<CommentGoodsRecord, Byte> COMMSTAR = createField("commstar", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "评价星级");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.user_score</code>. 评价可得积分
     */
    public final TableField<CommentGoodsRecord, Integer> USER_SCORE = createField("user_score", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "评价可得积分");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.anonymousflag</code>. 匿名状态 0.未匿名；1.匿名
     */
    public final TableField<CommentGoodsRecord, Byte> ANONYMOUSFLAG = createField("anonymousflag", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "匿名状态 0.未匿名；1.匿名");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.commtag</code>. 评价标签
     */
    public final TableField<CommentGoodsRecord, String> COMMTAG = createField("commtag", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "评价标签");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.goods_id</code>. 商品id
     */
    public final TableField<CommentGoodsRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.order_sn</code>. 订单编号
     */
    public final TableField<CommentGoodsRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "订单编号");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.comm_note</code>. 评论内容
     */
    public final TableField<CommentGoodsRecord, String> COMM_NOTE = createField("comm_note", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "评论内容");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.comm_img</code>. 评论图片
     */
    public final TableField<CommentGoodsRecord, String> COMM_IMG = createField("comm_img", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "评论图片");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.in_time</code>. 创建时间
     */
    public final TableField<CommentGoodsRecord, Timestamp> IN_TIME = createField("in_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.up_time</code>. 更新时间
     */
    public final TableField<CommentGoodsRecord, Timestamp> UP_TIME = createField("up_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.flag</code>. 0:未审批,1:审批通过,2:审批未通过
     */
    public final TableField<CommentGoodsRecord, Byte> FLAG = createField("flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未审批,1:审批通过,2:审批未通过");

    /**
     * The column <code>mini_shop_471752.b2c_comment_goods.del_flag</code>. 1:删除
     */
    public final TableField<CommentGoodsRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:删除");

    /**
     * Create a <code>mini_shop_471752.b2c_comment_goods</code> table reference
     */
    public CommentGoods() {
        this(DSL.name("b2c_comment_goods"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_goods</code> table reference
     */
    public CommentGoods(String alias) {
        this(DSL.name(alias), COMMENT_GOODS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_comment_goods</code> table reference
     */
    public CommentGoods(Name alias) {
        this(alias, COMMENT_GOODS);
    }

    private CommentGoods(Name alias, Table<CommentGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommentGoods(Name alias, Table<CommentGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CommentGoods(Table<O> child, ForeignKey<O, CommentGoodsRecord> key) {
        super(child, key, COMMENT_GOODS);
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
        return Arrays.<Index>asList(Indexes.COMMENT_GOODS_PRIMARY, Indexes.COMMENT_GOODS_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentGoodsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENT_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentGoodsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_COMMENT_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentGoodsRecord>>asList(Keys.KEY_B2C_COMMENT_GOODS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentGoods as(String alias) {
        return new CommentGoods(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentGoods as(Name alias) {
        return new CommentGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentGoods rename(String name) {
        return new CommentGoods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommentGoods rename(Name name) {
        return new CommentGoods(name, null);
    }
}
