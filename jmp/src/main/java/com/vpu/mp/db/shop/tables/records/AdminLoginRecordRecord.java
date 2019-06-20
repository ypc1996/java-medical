/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.AdminLoginRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class AdminLoginRecordRecord extends UpdatableRecordImpl<AdminLoginRecordRecord> implements Record10<Integer, Integer, String, Short, Timestamp, Timestamp, String, String, Short, Byte> {

    private static final long serialVersionUID = 1654396644;

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.user_name</code>. 登录用户名
     */
    public void setUserName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.user_name</code>. 登录用户名
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.login_type</code>. 登录类型：0普通登录，1改密码
     */
    public void setLoginType(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.login_type</code>. 登录类型：0普通登录，1改密码
     */
    public Short getLoginType() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.login_time</code>. 操作时间
     */
    public void setLoginTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.login_time</code>. 操作时间
     */
    public Timestamp getLoginTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.unlock_time</code>. 解锁时间
     */
    public void setUnlockTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.unlock_time</code>. 解锁时间
     */
    public Timestamp getUnlockTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.user_ip</code>. ip地址
     */
    public void setUserIp(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.user_ip</code>. ip地址
     */
    public String getUserIp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.user_agent</code>. 浏览器ua
     */
    public void setUserAgent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.user_agent</code>. 浏览器ua
     */
    public String getUserAgent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.retry_count</code>. 重试次数
     */
    public void setRetryCount(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.retry_count</code>. 重试次数
     */
    public Short getRetryCount() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_admin_login_record.is_tmp_lock</code>. 是否暂时锁定
     */
    public void setIsTmpLock(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_admin_login_record.is_tmp_lock</code>. 是否暂时锁定
     */
    public Byte getIsTmpLock() {
        return (Byte) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, Short, Timestamp, Timestamp, String, String, Short, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, Short, Timestamp, Timestamp, String, String, Short, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.LOGIN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.UNLOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.USER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.USER_AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.RETRY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return AdminLoginRecord.ADMIN_LOGIN_RECORD.IS_TMP_LOCK;
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
    public String component3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getLoginType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUnlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUserIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getIsTmpLock();
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
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getLoginType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUnlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsTmpLock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value4(Short value) {
        setLoginType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value5(Timestamp value) {
        setLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value6(Timestamp value) {
        setUnlockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value7(String value) {
        setUserIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value8(String value) {
        setUserAgent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value9(Short value) {
        setRetryCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord value10(Byte value) {
        setIsTmpLock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminLoginRecordRecord values(Integer value1, Integer value2, String value3, Short value4, Timestamp value5, Timestamp value6, String value7, String value8, Short value9, Byte value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminLoginRecordRecord
     */
    public AdminLoginRecordRecord() {
        super(AdminLoginRecord.ADMIN_LOGIN_RECORD);
    }

    /**
     * Create a detached, initialised AdminLoginRecordRecord
     */
    public AdminLoginRecordRecord(Integer id, Integer shopId, String userName, Short loginType, Timestamp loginTime, Timestamp unlockTime, String userIp, String userAgent, Short retryCount, Byte isTmpLock) {
        super(AdminLoginRecord.ADMIN_LOGIN_RECORD);

        set(0, id);
        set(1, shopId);
        set(2, userName);
        set(3, loginType);
        set(4, loginTime);
        set(5, unlockTime);
        set(6, userIp);
        set(7, userAgent);
        set(8, retryCount);
        set(9, isTmpLock);
    }
}
