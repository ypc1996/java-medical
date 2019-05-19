/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.OrderGoodsRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


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
public class OrderGoods extends TableImpl<OrderGoodsRecord> {

    private static final long serialVersionUID = 380107296;

    /**
     * The reference instance of <code>mini_main.b2c_order_goods</code>
     */
    public static final OrderGoods ORDER_GOODS = new OrderGoods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderGoodsRecord> getRecordType() {
        return OrderGoodsRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_order_goods.id</code>.
     */
    public final TableField<OrderGoodsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.rec_id</code>.
     */
    public final TableField<OrderGoodsRecord, UInteger> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.shop_id</code>. 店铺ID
     */
    public final TableField<OrderGoodsRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_order_goods.order_id</code>.
     */
    public final TableField<OrderGoodsRecord, UInteger> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.order_sn</code>.
     */
    public final TableField<OrderGoodsRecord, String> ORDER_SN = createField("order_sn", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_id</code>.
     */
    public final TableField<OrderGoodsRecord, UInteger> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_name</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_NAME = createField("goods_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_sn</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_SN = createField("goods_sn", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.product_id</code>.
     */
    public final TableField<OrderGoodsRecord, UInteger> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.product_sn</code>.
     */
    public final TableField<OrderGoodsRecord, String> PRODUCT_SN = createField("product_sn", org.jooq.impl.SQLDataType.VARCHAR(65).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_number</code>.
     */
    public final TableField<OrderGoodsRecord, UShort> GOODS_NUMBER = createField("goods_number", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.market_price</code>.
     */
    public final TableField<OrderGoodsRecord, BigDecimal> MARKET_PRICE = createField("market_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_price</code>.
     */
    public final TableField<OrderGoodsRecord, BigDecimal> GOODS_PRICE = createField("goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_attr</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_ATTR = createField("goods_attr", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.send_number</code>.
     */
    public final TableField<OrderGoodsRecord, UShort> SEND_NUMBER = createField("send_number", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.return_number</code>. 退货/退款成功数量
     */
    public final TableField<OrderGoodsRecord, UShort> RETURN_NUMBER = createField("return_number", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED)), this, "退货/退款成功数量");

    /**
     * The column <code>mini_main.b2c_order_goods.is_real</code>.
     */
    public final TableField<OrderGoodsRecord, UByte> IS_REAL = createField("is_real", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_attr_id</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_ATTR_ID = createField("goods_attr_id", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_img</code>.
     */
    public final TableField<OrderGoodsRecord, String> GOODS_IMG = createField("goods_img", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_order_goods.refund_status</code>. 1是审核中，2是通过审核，3退货没通过审核，4买家再次提交申请，5：退款退货成功，6是拒绝退款退货
     */
    public final TableField<OrderGoodsRecord, Byte> REFUND_STATUS = createField("refund_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1是审核中，2是通过审核，3退货没通过审核，4买家再次提交申请，5：退款退货成功，6是拒绝退款退货");

    /**
     * The column <code>mini_main.b2c_order_goods.comment_flag</code>. 0:未评论，1:已评论，2：已晒单
     */
    public final TableField<OrderGoodsRecord, Byte> COMMENT_FLAG = createField("comment_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未评论，1:已评论，2：已晒单");

    /**
     * The column <code>mini_main.b2c_order_goods.stra_id</code>. 商品参与的促销活动id
     */
    public final TableField<OrderGoodsRecord, Integer> STRA_ID = createField("stra_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品参与的促销活动id");

    /**
     * The column <code>mini_main.b2c_order_goods.per_discount</code>. 促销折扣均摊到每件商品的折扣
     */
    public final TableField<OrderGoodsRecord, BigDecimal> PER_DISCOUNT = createField("per_discount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "促销折扣均摊到每件商品的折扣");

    /**
     * The column <code>mini_main.b2c_order_goods.is_gift</code>. 是否是赠品
     */
    public final TableField<OrderGoodsRecord, Integer> IS_GIFT = createField("is_gift", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否是赠品");

    /**
     * The column <code>mini_main.b2c_order_goods.r_goods</code>. 赠品的关联商品
     */
    public final TableField<OrderGoodsRecord, String> R_GOODS = createField("r_goods", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "赠品的关联商品");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_score</code>. 商品积分
     */
    public final TableField<OrderGoodsRecord, Integer> GOODS_SCORE = createField("goods_score", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品积分");

    /**
     * The column <code>mini_main.b2c_order_goods.goods_growth</code>. 商品成长值
     */
    public final TableField<OrderGoodsRecord, Integer> GOODS_GROWTH = createField("goods_growth", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品成长值");

    /**
     * The column <code>mini_main.b2c_order_goods.discounted_goods_price</code>. 折后单价
     */
    public final TableField<OrderGoodsRecord, BigDecimal> DISCOUNTED_GOODS_PRICE = createField("discounted_goods_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "折后单价");

    /**
     * The column <code>mini_main.b2c_order_goods.discount_detail</code>. 打折详情，json存储
     */
    public final TableField<OrderGoodsRecord, String> DISCOUNT_DETAIL = createField("discount_detail", org.jooq.impl.SQLDataType.CLOB, this, "打折详情，json存储");

    /**
     * The column <code>mini_main.b2c_order_goods.fanli_type</code>. 0:不返利商品，1：返利商品
     */
    public final TableField<OrderGoodsRecord, Byte> FANLI_TYPE = createField("fanli_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:不返利商品，1：返利商品");

    /**
     * The column <code>mini_main.b2c_order_goods.can_calculate_money</code>. 单品可计算返利金额，刨除优惠券和其他折扣后的金额
     */
    public final TableField<OrderGoodsRecord, BigDecimal> CAN_CALCULATE_MONEY = createField("can_calculate_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "单品可计算返利金额，刨除优惠券和其他折扣后的金额");

    /**
     * The column <code>mini_main.b2c_order_goods.fanli_money</code>. 单品返利金额
     */
    public final TableField<OrderGoodsRecord, BigDecimal> FANLI_MONEY = createField("fanli_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "单品返利金额");

    /**
     * The column <code>mini_main.b2c_order_goods.discounted_total_price</code>. 折后总价
     */
    public final TableField<OrderGoodsRecord, BigDecimal> DISCOUNTED_TOTAL_PRICE = createField("discounted_total_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "折后总价");

    /**
     * The column <code>mini_main.b2c_order_goods.total_fanli_money</code>. 商品返利总金额
     */
    public final TableField<OrderGoodsRecord, BigDecimal> TOTAL_FANLI_MONEY = createField("total_fanli_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品返利总金额");

    /**
     * The column <code>mini_main.b2c_order_goods.purchase_price_id</code>. 加价购ID
     */
    public final TableField<OrderGoodsRecord, Integer> PURCHASE_PRICE_ID = createField("purchase_price_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "加价购ID");

    /**
     * The column <code>mini_main.b2c_order_goods.purchase_price_rule_id</code>. 换购挡位ID
     */
    public final TableField<OrderGoodsRecord, Integer> PURCHASE_PRICE_RULE_ID = createField("purchase_price_rule_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "换购挡位ID");

    /**
     * The column <code>mini_main.b2c_order_goods.reduce_price_id</code>. 限时降价ID
     */
    public final TableField<OrderGoodsRecord, Integer> REDUCE_PRICE_ID = createField("reduce_price_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "限时降价ID");

    /**
     * The column <code>mini_main.b2c_order_goods.fanli_strategy</code>. 返利比例
     */
    public final TableField<OrderGoodsRecord, String> FANLI_STRATEGY = createField("fanli_strategy", org.jooq.impl.SQLDataType.VARCHAR(299).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "返利比例");

    /**
     * The column <code>mini_main.b2c_order_goods.fanli_percent</code>. 返利比例
     */
    public final TableField<OrderGoodsRecord, BigDecimal> FANLI_PERCENT = createField("fanli_percent", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "返利比例");

    /**
     * The column <code>mini_main.b2c_order_goods.cost_price</code>. 成本价
     */
    public final TableField<OrderGoodsRecord, BigDecimal> COST_PRICE = createField("cost_price", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "成本价");

    /**
     * The column <code>mini_main.b2c_order_goods.is_card_exclusive</code>. 是否会员卡专属
     */
    public final TableField<OrderGoodsRecord, Byte> IS_CARD_EXCLUSIVE = createField("is_card_exclusive", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否会员卡专属");

    /**
     * The column <code>mini_main.b2c_order_goods.promote_info</code>. 推广信息
     */
    public final TableField<OrderGoodsRecord, String> PROMOTE_INFO = createField("promote_info", org.jooq.impl.SQLDataType.VARCHAR(500), this, "推广信息");

    /**
     * The column <code>mini_main.b2c_order_goods.gift_id</code>. 赠品ID
     */
    public final TableField<OrderGoodsRecord, Integer> GIFT_ID = createField("gift_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "赠品ID");

    /**
     * Create a <code>mini_main.b2c_order_goods</code> table reference
     */
    public OrderGoods() {
        this(DSL.name("b2c_order_goods"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_order_goods</code> table reference
     */
    public OrderGoods(String alias) {
        this(DSL.name(alias), ORDER_GOODS);
    }

    /**
     * Create an aliased <code>mini_main.b2c_order_goods</code> table reference
     */
    public OrderGoods(Name alias) {
        this(alias, ORDER_GOODS);
    }

    private OrderGoods(Name alias, Table<OrderGoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderGoods(Name alias, Table<OrderGoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OrderGoods(Table<O> child, ForeignKey<O, OrderGoodsRecord> key) {
        super(child, key, ORDER_GOODS);
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
        return Arrays.<Index>asList(Indexes.ORDER_GOODS_GOODS_ID, Indexes.ORDER_GOODS_ORDER_ID, Indexes.ORDER_GOODS_ORDER_SN, Indexes.ORDER_GOODS_PRIMARY, Indexes.ORDER_GOODS_SHOP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderGoodsRecord, Long> getIdentity() {
        return Keys.IDENTITY_ORDER_GOODS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderGoodsRecord> getPrimaryKey() {
        return Keys.KEY_B2C_ORDER_GOODS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderGoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderGoodsRecord>>asList(Keys.KEY_B2C_ORDER_GOODS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoods as(String alias) {
        return new OrderGoods(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderGoods as(Name alias) {
        return new OrderGoods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderGoods rename(String name) {
        return new OrderGoods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderGoods rename(Name name) {
        return new OrderGoods(name, null);
    }
}
