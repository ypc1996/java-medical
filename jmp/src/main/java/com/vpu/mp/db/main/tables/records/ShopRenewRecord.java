/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.ShopRenew;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ShopRenewRecord extends UpdatableRecordImpl<ShopRenewRecord> implements Record9<Integer, Integer, Integer, String, String, Date, Date, Integer, String> {

    private static final long serialVersionUID = -623566174;

    /**
     * Setter for <code>mini_main.b2c_shop_renew.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.sys_id</code>.
     */
    public void setSysId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.sys_id</code>.
     */
    public Integer getSysId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.mobile</code>.
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.mobile</code>.
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_money</code>. 店铺续费金额
     */
    public void setRenewMoney(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_money</code>. 店铺续费金额
     */
    public String getRenewMoney() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_date</code>. 店铺续费日期
     */
    public void setRenewDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_date</code>. 店铺续费日期
     */
    public Date getRenewDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.expire_time</code>. 到期时间
     */
    public void setExpireTime(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.expire_time</code>. 到期时间
     */
    public Date getExpireTime() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.operator</code>. 操作员ID,主账号是0，子账号ID
     */
    public void setOperator(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.operator</code>. 操作员ID,主账号是0，子账号ID
     */
    public Integer getOperator() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_renew.renew_desc</code>. 说明
     */
    public void setRenewDesc(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_renew.renew_desc</code>. 说明
     */
    public String getRenewDesc() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, Date, Date, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, Date, Date, Integer, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShopRenew.SHOP_RENEW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ShopRenew.SHOP_RENEW.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShopRenew.SHOP_RENEW.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ShopRenew.SHOP_RENEW.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ShopRenew.SHOP_RENEW.RENEW_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return ShopRenew.SHOP_RENEW.RENEW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ShopRenew.SHOP_RENEW.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ShopRenew.SHOP_RENEW.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ShopRenew.SHOP_RENEW.RENEW_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRenewMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getRenewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRenewDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRenewMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getRenewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRenewDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value3(Integer value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value4(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value5(String value) {
        setRenewMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value6(Date value) {
        setRenewDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value7(Date value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value8(Integer value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord value9(String value) {
        setRenewDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRenewRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Date value6, Date value7, Integer value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopRenewRecord
     */
    public ShopRenewRecord() {
        super(ShopRenew.SHOP_RENEW);
    }

    /**
     * Create a detached, initialised ShopRenewRecord
     */
    public ShopRenewRecord(Integer id, Integer shopId, Integer sysId, String mobile, String renewMoney, Date renewDate, Date expireTime, Integer operator, String renewDesc) {
        super(ShopRenew.SHOP_RENEW);

        set(0, id);
        set(1, shopId);
        set(2, sysId);
        set(3, mobile);
        set(4, renewMoney);
        set(5, renewDate);
        set(6, expireTime);
        set(7, operator);
        set(8, renewDesc);
    }
}
