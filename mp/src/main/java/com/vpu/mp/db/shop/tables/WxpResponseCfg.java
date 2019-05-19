/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.WxpResponseCfgRecord;

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
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WxpResponseCfg extends TableImpl<WxpResponseCfgRecord> {

    private static final long serialVersionUID = 1621125611;

    /**
     * The reference instance of <code>mini_shop_1.b2c_wxp_response_cfg</code>
     */
    public static final WxpResponseCfg WXP_RESPONSE_CFG = new WxpResponseCfg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WxpResponseCfgRecord> getRecordType() {
        return WxpResponseCfgRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.rec_id</code>.
     */
    public final TableField<WxpResponseCfgRecord, UInteger> REC_ID = createField("rec_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.shop_id</code>. 店铺ID
     */
    public final TableField<WxpResponseCfgRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.type</code>. 0 关注时回复，1关键词回复，2默认回复,3菜单回复
     */
    public final TableField<WxpResponseCfgRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 关注时回复，1关键词回复，2默认回复,3菜单回复");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.menu_key</code>. 当type=3有效，菜单key，与菜单表中的key对应
     */
    public final TableField<WxpResponseCfgRecord, String> MENU_KEY = createField("menu_key", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "当type=3有效，菜单key，与菜单表中的key对应");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.key_words</code>. 当type=1时有效，触发关键词
     */
    public final TableField<WxpResponseCfgRecord, String> KEY_WORDS = createField("key_words", org.jooq.impl.SQLDataType.VARCHAR(40).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "当type=1时有效，触发关键词");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.match_type</code>. 当type=1时有效，匹配类型，0精确，1模糊
     */
    public final TableField<WxpResponseCfgRecord, Byte> MATCH_TYPE = createField("match_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "当type=1时有效，匹配类型，0精确，1模糊");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.res_type</code>. 回复类型：0文本 1 单图文 2 多图文 3音乐，4 link
     */
    public final TableField<WxpResponseCfgRecord, Byte> RES_TYPE = createField("res_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "回复类型：0文本 1 单图文 2 多图文 3音乐，4 link");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.res_content</code>. 回复内容
     */
    public final TableField<WxpResponseCfgRecord, String> RES_CONTENT = createField("res_content", org.jooq.impl.SQLDataType.CLOB, this, "回复内容");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.res_rec_id</code>. 素材wxp_material的rec_id
     */
    public final TableField<WxpResponseCfgRecord, Integer> RES_REC_ID = createField("res_rec_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "素材wxp_material的rec_id");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.create_time</code>.
     */
    public final TableField<WxpResponseCfgRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.update_time</code>.
     */
    public final TableField<WxpResponseCfgRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_1.b2c_wxp_response_cfg.micro_id</code>. 所属微信公众号ID,关联b2c_wxp_list的micro_id
     */
    public final TableField<WxpResponseCfgRecord, Integer> MICRO_ID = createField("micro_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "所属微信公众号ID,关联b2c_wxp_list的micro_id");

    /**
     * Create a <code>mini_shop_1.b2c_wxp_response_cfg</code> table reference
     */
    public WxpResponseCfg() {
        this(DSL.name("b2c_wxp_response_cfg"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_wxp_response_cfg</code> table reference
     */
    public WxpResponseCfg(String alias) {
        this(DSL.name(alias), WXP_RESPONSE_CFG);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_wxp_response_cfg</code> table reference
     */
    public WxpResponseCfg(Name alias) {
        this(alias, WXP_RESPONSE_CFG);
    }

    private WxpResponseCfg(Name alias, Table<WxpResponseCfgRecord> aliased) {
        this(alias, aliased, null);
    }

    private WxpResponseCfg(Name alias, Table<WxpResponseCfgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WxpResponseCfg(Table<O> child, ForeignKey<O, WxpResponseCfgRecord> key) {
        super(child, key, WXP_RESPONSE_CFG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_1.MINI_SHOP_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WXP_RESPONSE_CFG_MICRO_ID, Indexes.WXP_RESPONSE_CFG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WxpResponseCfgRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_WXP_RESPONSE_CFG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WxpResponseCfgRecord> getPrimaryKey() {
        return Keys.KEY_B2C_WXP_RESPONSE_CFG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WxpResponseCfgRecord>> getKeys() {
        return Arrays.<UniqueKey<WxpResponseCfgRecord>>asList(Keys.KEY_B2C_WXP_RESPONSE_CFG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpResponseCfg as(String alias) {
        return new WxpResponseCfg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpResponseCfg as(Name alias) {
        return new WxpResponseCfg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WxpResponseCfg rename(String name) {
        return new WxpResponseCfg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WxpResponseCfg rename(Name name) {
        return new WxpResponseCfg(name, null);
    }
}
