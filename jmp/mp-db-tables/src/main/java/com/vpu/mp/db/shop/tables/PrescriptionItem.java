/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PrescriptionItemRecord;

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
 * 处方项目明细表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrescriptionItem extends TableImpl<PrescriptionItemRecord> {

    private static final long serialVersionUID = 1853630127;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_prescription_item</code>
     */
    public static final PrescriptionItem PRESCRIPTION_ITEM = new PrescriptionItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrescriptionItemRecord> getRecordType() {
        return PrescriptionItemRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.id</code>.
     */
    public final TableField<PrescriptionItemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.prescription_no</code>. 处方号外键
     */
    public final TableField<PrescriptionItemRecord, String> PRESCRIPTION_NO = createField("prescription_no", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "处方号外键");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.prescription_detail_no</code>. 处方项目明细号码（可根据此字段反查批次号）
     */
    public final TableField<PrescriptionItemRecord, String> PRESCRIPTION_DETAIL_NO = createField("prescription_detail_no", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "处方项目明细号码（可根据此字段反查批次号）");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_id</code>. 商品id
     */
    public final TableField<PrescriptionItemRecord, Integer> GOODS_ID = createField("goods_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "商品id");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_common_name</code>. 通用名
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_COMMON_NAME = createField("goods_common_name", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "通用名");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_quality_ratio</code>. 规格系数，通用名和规格系数确定一个药品
     */
    public final TableField<PrescriptionItemRecord, String> GOODS_QUALITY_RATIO = createField("goods_quality_ratio", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "规格系数，通用名和规格系数确定一个药品");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.goods_num</code>. 使用药品数量
     */
    public final TableField<PrescriptionItemRecord, Integer> GOODS_NUM = createField("goods_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "使用药品数量");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.status</code>. 处方审核状态 0待审核 1审核通过 2审核未通过
     */
    public final TableField<PrescriptionItemRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "处方审核状态 0待审核 1审核通过 2审核未通过");

    /**
     * The column <code>mini_shop_471752.b2c_prescription_item.status_memo</code>. 处方审核医师评价
     */
    public final TableField<PrescriptionItemRecord, String> STATUS_MEMO = createField("status_memo", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "处方审核医师评价");

    /**
     * Create a <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem() {
        this(DSL.name("b2c_prescription_item"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem(String alias) {
        this(DSL.name(alias), PRESCRIPTION_ITEM);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_prescription_item</code> table reference
     */
    public PrescriptionItem(Name alias) {
        this(alias, PRESCRIPTION_ITEM);
    }

    private PrescriptionItem(Name alias, Table<PrescriptionItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private PrescriptionItem(Name alias, Table<PrescriptionItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("处方项目明细表"));
    }

    public <O extends Record> PrescriptionItem(Table<O> child, ForeignKey<O, PrescriptionItemRecord> key) {
        super(child, key, PRESCRIPTION_ITEM);
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
        return Arrays.<Index>asList(Indexes.PRESCRIPTION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PrescriptionItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRESCRIPTION_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PrescriptionItemRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PRESCRIPTION_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PrescriptionItemRecord>> getKeys() {
        return Arrays.<UniqueKey<PrescriptionItemRecord>>asList(Keys.KEY_B2C_PRESCRIPTION_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionItem as(String alias) {
        return new PrescriptionItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrescriptionItem as(Name alias) {
        return new PrescriptionItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PrescriptionItem rename(String name) {
        return new PrescriptionItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PrescriptionItem rename(Name name) {
        return new PrescriptionItem(name, null);
    }
}
