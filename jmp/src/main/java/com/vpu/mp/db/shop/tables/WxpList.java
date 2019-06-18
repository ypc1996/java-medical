/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.WxpListRecord;

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
public class WxpList extends TableImpl<WxpListRecord> {

    private static final long serialVersionUID = 48576447;

    /**
     * The reference instance of <code>mini_shop_1.b2c_wxp_list</code>
     */
    public static final WxpList WXP_LIST = new WxpList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WxpListRecord> getRecordType() {
        return WxpListRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.micro_id</code>.
     */
    public final TableField<WxpListRecord, UInteger> MICRO_ID = createField("micro_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.shop_id</code>. 店铺ID
     */
    public final TableField<WxpListRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺ID");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wxp_name</code>. 微信公众平台名称
     */
    public final TableField<WxpListRecord, String> WXP_NAME = createField("wxp_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信公众平台名称");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wxp_en_name</code>. 微信公众平台微信号码
     */
    public final TableField<WxpListRecord, String> WXP_EN_NAME = createField("wxp_en_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信公众平台微信号码");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.token</code>. 微信公众平台的token
     */
    public final TableField<WxpListRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信公众平台的token");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.appid</code>. 用于高级功能的appid
     */
    public final TableField<WxpListRecord, String> APPID = createField("appid", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用于高级功能的appid");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.appsecret</code>. 用于高级功能的appsecret
     */
    public final TableField<WxpListRecord, String> APPSECRET = createField("appsecret", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用于高级功能的appsecret");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.partnerid</code>. 用于微信支付的partnerid
     */
    public final TableField<WxpListRecord, String> PARTNERID = createField("partnerid", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用于微信支付的partnerid");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.partnerkey</code>. 用于微信支付的partnerkey
     */
    public final TableField<WxpListRecord, String> PARTNERKEY = createField("partnerkey", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用于微信支付的partnerkey");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.paysignkey</code>. 用于微信支付的paysignkey
     */
    public final TableField<WxpListRecord, String> PAYSIGNKEY = createField("paysignkey", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用于微信支付的paysignkey");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wxp_type</code>. 0 订阅号, 1微信认证订阅号 2 服务号, 3微信认证服务号
     */
    public final TableField<WxpListRecord, Byte> WXP_TYPE = createField("wxp_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 订阅号, 1微信认证订阅号 2 服务号, 3微信认证服务号");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.link_shop</code>. 是否关联店铺 0,否，1是
     */
    public final TableField<WxpListRecord, Byte> LINK_SHOP = createField("link_shop", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否关联店铺 0,否，1是");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.micro_id_used</code>. 添加新公众号会先添加一条空记录，micro_id_used为0，当设置好公众号时，变为1
     */
    public final TableField<WxpListRecord, Byte> MICRO_ID_USED = createField("micro_id_used", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "添加新公众号会先添加一条空记录，micro_id_used为0，当设置好公众号时，变为1");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.del_flag</code>. 是否删除
     */
    public final TableField<WxpListRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否删除");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.access_token</code>. access_token是公众号的全局唯一票据
     */
    public final TableField<WxpListRecord, String> ACCESS_TOKEN = createField("access_token", org.jooq.impl.SQLDataType.VARCHAR(513).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "access_token是公众号的全局唯一票据");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.expires_timestamp</code>. access_token过期时间戳
     */
    public final TableField<WxpListRecord, Integer> EXPIRES_TIMESTAMP = createField("expires_timestamp", org.jooq.impl.SQLDataType.INTEGER, this, "access_token过期时间戳");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.auto_customer_svc</code>. 是否自动转接客服，0 or 1
     */
    public final TableField<WxpListRecord, Byte> AUTO_CUSTOMER_SVC = createField("auto_customer_svc", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否自动转接客服，0 or 1");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wx_pay_ver</code>. 微信支付版本号，2为2.x，3为3.x版本
     */
    public final TableField<WxpListRecord, Byte> WX_PAY_VER = createField("wx_pay_ver", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("2", org.jooq.impl.SQLDataType.TINYINT)), this, "微信支付版本号，2为2.x，3为3.x版本");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wx_v3_mhcid</code>. 微信支付v3支付商户号
     */
    public final TableField<WxpListRecord, String> WX_V3_MHCID = createField("wx_v3_mhcid", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信支付v3支付商户号");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wx_v3_key</code>. 微信支付v3商户支付密钥
     */
    public final TableField<WxpListRecord, String> WX_V3_KEY = createField("wx_v3_key", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信支付v3商户支付密钥");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wx_v3_apiclient_cert_path</code>. 微信支付v3商户证书路径
     */
    public final TableField<WxpListRecord, String> WX_V3_APICLIENT_CERT_PATH = createField("wx_v3_apiclient_cert_path", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信支付v3商户证书路径");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.wx_v3_apiclient_key_path</code>. 微信支付v3商户证书密钥路径
     */
    public final TableField<WxpListRecord, String> WX_V3_APICLIENT_KEY_PATH = createField("wx_v3_apiclient_key_path", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信支付v3商户证书密钥路径");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.create_time</code>.
     */
    public final TableField<WxpListRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_1.b2c_wxp_list.update_time</code>.
     */
    public final TableField<WxpListRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mini_shop_1.b2c_wxp_list</code> table reference
     */
    public WxpList() {
        this(DSL.name("b2c_wxp_list"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_wxp_list</code> table reference
     */
    public WxpList(String alias) {
        this(DSL.name(alias), WXP_LIST);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_wxp_list</code> table reference
     */
    public WxpList(Name alias) {
        this(alias, WXP_LIST);
    }

    private WxpList(Name alias, Table<WxpListRecord> aliased) {
        this(alias, aliased, null);
    }

    private WxpList(Name alias, Table<WxpListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WxpList(Table<O> child, ForeignKey<O, WxpListRecord> key) {
        super(child, key, WXP_LIST);
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
        return Arrays.<Index>asList(Indexes.WXP_LIST_APPID, Indexes.WXP_LIST_APPSECRET, Indexes.WXP_LIST_MICRO_ID_USED, Indexes.WXP_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WxpListRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_WXP_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WxpListRecord> getPrimaryKey() {
        return Keys.KEY_B2C_WXP_LIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WxpListRecord>> getKeys() {
        return Arrays.<UniqueKey<WxpListRecord>>asList(Keys.KEY_B2C_WXP_LIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpList as(String alias) {
        return new WxpList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpList as(Name alias) {
        return new WxpList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WxpList rename(String name) {
        return new WxpList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WxpList rename(Name name) {
        return new WxpList(name, null);
    }
}
