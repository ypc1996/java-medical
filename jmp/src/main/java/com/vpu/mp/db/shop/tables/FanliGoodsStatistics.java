/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.FanliGoodsStatisticsRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class FanliGoodsStatistics extends TableImpl<FanliGoodsStatisticsRecord> {

    private static final long serialVersionUID = -1697161411;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_fanli_goods_statistics</code>
     */
    public static final FanliGoodsStatistics FANLI_GOODS_STATISTICS = new FanliGoodsStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FanliGoodsStatisticsRecord> getRecordType() {
        return FanliGoodsStatisticsRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.prd_id</code>.
     */
    public final TableField<FanliGoodsStatisticsRecord, Integer> PRD_ID = createField("prd_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.prd_sn</code>. 规格编码
     */
    public final TableField<FanliGoodsStatisticsRecord, String> PRD_SN = createField("prd_sn", org.jooq.impl.SQLDataType.VARCHAR(30), this, "规格编码");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.goods_id</code>.
     */
    public final TableField<FanliGoodsStatisticsRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.cat_id</code>. 分类ID
     */
    public final TableField<FanliGoodsStatisticsRecord, Integer> CAT_ID = createField("cat_id", org.jooq.impl.SQLDataType.INTEGER, this, "分类ID");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.sale_number</code>. 销量
     */
    public final TableField<FanliGoodsStatisticsRecord, Integer> SALE_NUMBER = createField("sale_number", org.jooq.impl.SQLDataType.INTEGER, this, "销量");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.prd_total_fanli</code>. 商品返利总金额
     */
    public final TableField<FanliGoodsStatisticsRecord, BigDecimal> PRD_TOTAL_FANLI = createField("prd_total_fanli", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "商品返利总金额");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.add_time</code>.
     */
    public final TableField<FanliGoodsStatisticsRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_fanli_goods_statistics.update_time</code>.
     */
    public final TableField<FanliGoodsStatisticsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>mini_shop_471752.b2c_fanli_goods_statistics</code> table reference
     */
    public FanliGoodsStatistics() {
        this(DSL.name("b2c_fanli_goods_statistics"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_fanli_goods_statistics</code> table reference
     */
    public FanliGoodsStatistics(String alias) {
        this(DSL.name(alias), FANLI_GOODS_STATISTICS);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_fanli_goods_statistics</code> table reference
     */
    public FanliGoodsStatistics(Name alias) {
        this(alias, FANLI_GOODS_STATISTICS);
    }

    private FanliGoodsStatistics(Name alias, Table<FanliGoodsStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FanliGoodsStatistics(Name alias, Table<FanliGoodsStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FanliGoodsStatistics(Table<O> child, ForeignKey<O, FanliGoodsStatisticsRecord> key) {
        super(child, key, FANLI_GOODS_STATISTICS);
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
    public FanliGoodsStatistics as(String alias) {
        return new FanliGoodsStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FanliGoodsStatistics as(Name alias) {
        return new FanliGoodsStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FanliGoodsStatistics rename(String name) {
        return new FanliGoodsStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FanliGoodsStatistics rename(Name name) {
        return new FanliGoodsStatistics(name, null);
    }
}
