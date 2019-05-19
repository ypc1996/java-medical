/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables;


import com.vpu.mp.db.main.Indexes;
import com.vpu.mp.db.main.Keys;
import com.vpu.mp.db.main.MiniMain;
import com.vpu.mp.db.main.tables.records.ShopRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UByte;
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
public class Shop extends TableImpl<ShopRecord> {

    private static final long serialVersionUID = 1096110507;

    /**
     * The reference instance of <code>mini_main.b2c_shop</code>
     */
    public static final Shop SHOP = new Shop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShopRecord> getRecordType() {
        return ShopRecord.class;
    }

    /**
     * The column <code>mini_main.b2c_shop.shop_id</code>. 店铺ID
     */
    public final TableField<ShopRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "店铺ID");

    /**
     * The column <code>mini_main.b2c_shop.sys_id</code>.
     */
    public final TableField<ShopRecord, Integer> SYS_ID = createField("sys_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mini_main.b2c_shop.mobile</code>.
     */
    public final TableField<ShopRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop.receive_mobile</code>.  接收通知手机号码
     */
    public final TableField<ShopRecord, String> RECEIVE_MOBILE = createField("receive_mobile", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, " 接收通知手机号码");

    /**
     * The column <code>mini_main.b2c_shop.shop_name</code>. 店铺名称
     */
    public final TableField<ShopRecord, String> SHOP_NAME = createField("shop_name", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺名称");

    /**
     * The column <code>mini_main.b2c_shop.shop_avatar</code>. 店铺头像
     */
    public final TableField<ShopRecord, String> SHOP_AVATAR = createField("shop_avatar", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺头像");

    /**
     * The column <code>mini_main.b2c_shop.shop_bg_path</code>. 店铺背景图片
     */
    public final TableField<ShopRecord, String> SHOP_BG_PATH = createField("shop_bg_path", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺背景图片");

    /**
     * The column <code>mini_main.b2c_shop.shop_phone</code>. 店铺客服电话
     */
    public final TableField<ShopRecord, String> SHOP_PHONE = createField("shop_phone", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺客服电话");

    /**
     * The column <code>mini_main.b2c_shop.shop_notice</code>. 店铺公告
     */
    public final TableField<ShopRecord, String> SHOP_NOTICE = createField("shop_notice", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺公告");

    /**
     * The column <code>mini_main.b2c_shop.shop_wx</code>. 店铺客服微信
     */
    public final TableField<ShopRecord, String> SHOP_WX = createField("shop_wx", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺客服微信");

    /**
     * The column <code>mini_main.b2c_shop.shop_email</code>.
     */
    public final TableField<ShopRecord, String> SHOP_EMAIL = createField("shop_email", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop.created</code>. 创建时间
     */
    public final TableField<ShopRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>mini_main.b2c_shop.is_enabled</code>. 是否可用
     */
    public final TableField<ShopRecord, Byte> IS_ENABLED = createField("is_enabled", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否可用");

    /**
     * The column <code>mini_main.b2c_shop.province_code</code>. 所在省
     */
    public final TableField<ShopRecord, UInteger> PROVINCE_CODE = createField("province_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "所在省");

    /**
     * The column <code>mini_main.b2c_shop.province_name</code>.
     */
    public final TableField<ShopRecord, String> PROVINCE_NAME = createField("province_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop.city_code</code>. 所在城市
     */
    public final TableField<ShopRecord, UInteger> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "所在城市");

    /**
     * The column <code>mini_main.b2c_shop.city_name</code>.
     */
    public final TableField<ShopRecord, String> CITY_NAME = createField("city_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop.district_code</code>. 所在区县
     */
    public final TableField<ShopRecord, UInteger> DISTRICT_CODE = createField("district_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "所在区县");

    /**
     * The column <code>mini_main.b2c_shop.district_name</code>.
     */
    public final TableField<ShopRecord, String> DISTRICT_NAME = createField("district_name", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_main.b2c_shop.address</code>. 所在地址
     */
    public final TableField<ShopRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所在地址");

    /**
     * The column <code>mini_main.b2c_shop.complete_address</code>. 所在完整地址
     */
    public final TableField<ShopRecord, String> COMPLETE_ADDRESS = createField("complete_address", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所在完整地址");

    /**
     * The column <code>mini_main.b2c_shop.shop_sell_type</code>. 经营品类,254：其他
     */
    public final TableField<ShopRecord, UByte> SHOP_SELL_TYPE = createField("shop_sell_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("254", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "经营品类,254：其他");

    /**
     * The column <code>mini_main.b2c_shop.shop_qq</code>. 店铺客服QQ
     */
    public final TableField<ShopRecord, String> SHOP_QQ = createField("shop_qq", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺客服QQ");

    /**
     * The column <code>mini_main.b2c_shop.last_login_ip</code>. 上次登录IP
     */
    public final TableField<ShopRecord, String> LAST_LOGIN_IP = createField("last_login_ip", org.jooq.impl.SQLDataType.VARCHAR(40).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "上次登录IP");

    /**
     * The column <code>mini_main.b2c_shop.state</code>. 0 入驻申请，1审核通过，2审核不通过
     */
    public final TableField<ShopRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 入驻申请，1审核通过，2审核不通过");

    /**
     * The column <code>mini_main.b2c_shop.business_state</code>. 营业状态 0未营业 1营业
     */
    public final TableField<ShopRecord, Byte> BUSINESS_STATE = createField("business_state", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "营业状态 0未营业 1营业");

    /**
     * The column <code>mini_main.b2c_shop.manage_fee</code>. 平台管理费
     */
    public final TableField<ShopRecord, BigDecimal> MANAGE_FEE = createField("manage_fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "平台管理费");

    /**
     * The column <code>mini_main.b2c_shop.shop_license</code>. 营业执照
     */
    public final TableField<ShopRecord, String> SHOP_LICENSE = createField("shop_license", org.jooq.impl.SQLDataType.VARCHAR(191), this, "营业执照");

    /**
     * The column <code>mini_main.b2c_shop.shop_tax_credential</code>. 税务登记证
     */
    public final TableField<ShopRecord, String> SHOP_TAX_CREDENTIAL = createField("shop_tax_credential", org.jooq.impl.SQLDataType.VARCHAR(191), this, "税务登记证");

    /**
     * The column <code>mini_main.b2c_shop.organization_code_certificate</code>. 组织机构代码证
     */
    public final TableField<ShopRecord, String> ORGANIZATION_CODE_CERTIFICATE = createField("organization_code_certificate", org.jooq.impl.SQLDataType.VARCHAR(191), this, "组织机构代码证");

    /**
     * The column <code>mini_main.b2c_shop.permit_for_opening_bank_account</code>. 银行开户许可证
     */
    public final TableField<ShopRecord, String> PERMIT_FOR_OPENING_BANK_ACCOUNT = createField("permit_for_opening_bank_account", org.jooq.impl.SQLDataType.VARCHAR(191), this, "银行开户许可证");

    /**
     * The column <code>mini_main.b2c_shop.financial_registration</code>. 财政登记证
     */
    public final TableField<ShopRecord, String> FINANCIAL_REGISTRATION = createField("financial_registration", org.jooq.impl.SQLDataType.VARCHAR(191), this, "财政登记证");

    /**
     * The column <code>mini_main.b2c_shop.shop_bank_name</code>. 开户行姓名
     */
    public final TableField<ShopRecord, String> SHOP_BANK_NAME = createField("shop_bank_name", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开户行姓名");

    /**
     * The column <code>mini_main.b2c_shop.shop_bank</code>. 开户行
     */
    public final TableField<ShopRecord, String> SHOP_BANK = createField("shop_bank", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开户行");

    /**
     * The column <code>mini_main.b2c_shop.shop_bank_branch</code>. 开户行分行
     */
    public final TableField<ShopRecord, String> SHOP_BANK_BRANCH = createField("shop_bank_branch", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开户行分行");

    /**
     * The column <code>mini_main.b2c_shop.shop_bank_no</code>. 开户行卡号
     */
    public final TableField<ShopRecord, String> SHOP_BANK_NO = createField("shop_bank_no", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开户行卡号");

    /**
     * The column <code>mini_main.b2c_shop.surplus</code>. 余额
     */
    public final TableField<ShopRecord, BigDecimal> SURPLUS = createField("surplus", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "余额");

    /**
     * The column <code>mini_main.b2c_shop.reject_reason</code>. 驳回理由
     */
    public final TableField<ShopRecord, String> REJECT_REASON = createField("reject_reason", org.jooq.impl.SQLDataType.VARCHAR(191), this, "驳回理由");

    /**
     * The column <code>mini_main.b2c_shop.shop_stat_code</code>. 第三方统计代码
     */
    public final TableField<ShopRecord, String> SHOP_STAT_CODE = createField("shop_stat_code", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "第三方统计代码");

    /**
     * The column <code>mini_main.b2c_shop.shop_icp</code>. IP信息
     */
    public final TableField<ShopRecord, String> SHOP_ICP = createField("shop_icp", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "IP信息");

    /**
     * The column <code>mini_main.b2c_shop.shop_copyright</code>. 版权信息
     */
    public final TableField<ShopRecord, String> SHOP_COPYRIGHT = createField("shop_copyright", org.jooq.impl.SQLDataType.VARCHAR(191).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "版权信息");

    /**
     * The column <code>mini_main.b2c_shop.db_config</code>. db config,json format
     */
    public final TableField<ShopRecord, String> DB_CONFIG = createField("db_config", org.jooq.impl.SQLDataType.CLOB, this, "db config,json format");

    /**
     * The column <code>mini_main.b2c_shop.shop_type</code>. 店铺类型
     */
    public final TableField<ShopRecord, String> SHOP_TYPE = createField("shop_type", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("v3", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺类型");

    /**
     * The column <code>mini_main.b2c_shop.version_config</code>. 店铺功能
     */
    public final TableField<ShopRecord, String> VERSION_CONFIG = createField("version_config", org.jooq.impl.SQLDataType.CLOB, this, "店铺功能");

    /**
     * The column <code>mini_main.b2c_shop.shop_flag</code>. 店铺标志：0店家，1欧派，2嗨购
     */
    public final TableField<ShopRecord, Byte> SHOP_FLAG = createField("shop_flag", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "店铺标志：0店家，1欧派，2嗨购");

    /**
     * The column <code>mini_main.b2c_shop.member_key</code>. 欧派店铺标识
     */
    public final TableField<ShopRecord, String> MEMBER_KEY = createField("member_key", org.jooq.impl.SQLDataType.VARCHAR(64), this, "欧派店铺标识");

    /**
     * The column <code>mini_main.b2c_shop.tenancy_name</code>. 欧派创思大屏租户名称
     */
    public final TableField<ShopRecord, String> TENANCY_NAME = createField("tenancy_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "欧派创思大屏租户名称");

    /**
     * The column <code>mini_main.b2c_shop.user_name</code>. 欧派创思大屏用户名
     */
    public final TableField<ShopRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "欧派创思大屏用户名");

    /**
     * The column <code>mini_main.b2c_shop.password</code>. 欧派创思大屏密码
     */
    public final TableField<ShopRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(64), this, "欧派创思大屏密码");

    /**
     * The column <code>mini_main.b2c_shop.sms_account</code>. 短信账号
     */
    public final TableField<ShopRecord, String> SMS_ACCOUNT = createField("sms_account", org.jooq.impl.SQLDataType.VARCHAR(50), this, "短信账号");

    /**
     * The column <code>mini_main.b2c_shop.kuajinggou</code>. 跨境购
     */
    public final TableField<ShopRecord, Byte> KUAJINGGOU = createField("kuajinggou", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "跨境购");

    /**
     * The column <code>mini_main.b2c_shop.order_real_name</code>. 下单实名制
     */
    public final TableField<ShopRecord, Byte> ORDER_REAL_NAME = createField("order_real_name", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "下单实名制");

    /**
     * The column <code>mini_main.b2c_shop.hid_bottom</code>. 是否隐藏底部 1是 
     */
    public final TableField<ShopRecord, Byte> HID_BOTTOM = createField("hid_bottom", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否隐藏底部 1是 ");

    /**
     * The column <code>mini_main.b2c_shop.shop_style</code>. 店铺风格
     */
    public final TableField<ShopRecord, String> SHOP_STYLE = createField("shop_style", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺风格");

    /**
     * The column <code>mini_main.b2c_shop.logo</code>. 小程序logo
     */
    public final TableField<ShopRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.VARCHAR(200), this, "小程序logo");

    /**
     * The column <code>mini_main.b2c_shop.share_config</code>. 分享配置
     */
    public final TableField<ShopRecord, String> SHARE_CONFIG = createField("share_config", org.jooq.impl.SQLDataType.CLOB, this, "分享配置");

    /**
     * Create a <code>mini_main.b2c_shop</code> table reference
     */
    public Shop() {
        this(DSL.name("b2c_shop"), null);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop</code> table reference
     */
    public Shop(String alias) {
        this(DSL.name(alias), SHOP);
    }

    /**
     * Create an aliased <code>mini_main.b2c_shop</code> table reference
     */
    public Shop(Name alias) {
        this(alias, SHOP);
    }

    private Shop(Name alias, Table<ShopRecord> aliased) {
        this(alias, aliased, null);
    }

    private Shop(Name alias, Table<ShopRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Shop(Table<O> child, ForeignKey<O, ShopRecord> key) {
        super(child, key, SHOP);
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
        return Arrays.<Index>asList(Indexes.SHOP_MOBILE, Indexes.SHOP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShopRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShopRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SHOP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShopRecord>> getKeys() {
        return Arrays.<UniqueKey<ShopRecord>>asList(Keys.KEY_B2C_SHOP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shop as(String alias) {
        return new Shop(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Shop as(Name alias) {
        return new Shop(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Shop rename(String name) {
        return new Shop(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Shop rename(Name name) {
        return new Shop(name, null);
    }
}
