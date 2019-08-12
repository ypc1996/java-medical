/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


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

import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PromotionLanguageRecord;


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
public class PromotionLanguage extends TableImpl<PromotionLanguageRecord> {

    private static final long serialVersionUID = -157150535;

    /**
     * The reference instance of <code>jmini_shop_471752.b2c_promotion_language</code>
     */
    public static final PromotionLanguage PROMOTION_LANGUAGE = new PromotionLanguage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PromotionLanguageRecord> getRecordType() {
        return PromotionLanguageRecord.class;
    }

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.id</code>.
     */
    public final TableField<PromotionLanguageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.title</code>. 推广语标题
     */
    public final TableField<PromotionLanguageRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "推广语标题");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.promotion_language</code>. 推广语
     */
    public final TableField<PromotionLanguageRecord, String> PROMOTION_LANGUAGE_ = createField("promotion_language", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "推广语");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.create_time</code>.
     */
    public final TableField<PromotionLanguageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.update_time</code>. 最后修改时间
     */
    public final TableField<PromotionLanguageRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.is_block</code>. 是否停用：0否，1是
     */
    public final TableField<PromotionLanguageRecord, Byte> IS_BLOCK = createField("is_block", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否停用：0否，1是");

    /**
     * The column <code>jmini_shop_471752.b2c_promotion_language.del_flag</code>. 是否停用：0否，1是
     */
    public final TableField<PromotionLanguageRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否停用：0否，1是");

    /**
     * Create a <code>jmini_shop_471752.b2c_promotion_language</code> table reference
     */
    public PromotionLanguage() {
        this(DSL.name("b2c_promotion_language"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_promotion_language</code> table reference
     */
    public PromotionLanguage(String alias) {
        this(DSL.name(alias), PROMOTION_LANGUAGE);
    }

    /**
     * Create an aliased <code>jmini_shop_471752.b2c_promotion_language</code> table reference
     */
    public PromotionLanguage(Name alias) {
        this(alias, PROMOTION_LANGUAGE);
    }

    private PromotionLanguage(Name alias, Table<PromotionLanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private PromotionLanguage(Name alias, Table<PromotionLanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PromotionLanguage(Table<O> child, ForeignKey<O, PromotionLanguageRecord> key) {
        super(child, key, PROMOTION_LANGUAGE);
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
        return Arrays.<Index>asList(Indexes.PROMOTION_LANGUAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PromotionLanguageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROMOTION_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PromotionLanguageRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PROMOTION_LANGUAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PromotionLanguageRecord>> getKeys() {
        return Arrays.<UniqueKey<PromotionLanguageRecord>>asList(Keys.KEY_B2C_PROMOTION_LANGUAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguage as(String alias) {
        return new PromotionLanguage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PromotionLanguage as(Name alias) {
        return new PromotionLanguage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PromotionLanguage rename(String name) {
        return new PromotionLanguage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PromotionLanguage rename(Name name) {
        return new PromotionLanguage(name, null);
    }
}
