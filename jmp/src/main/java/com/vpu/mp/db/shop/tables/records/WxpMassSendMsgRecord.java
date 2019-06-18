/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.WxpMassSendMsg;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
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
public class WxpMassSendMsgRecord extends UpdatableRecordImpl<WxpMassSendMsgRecord> implements Record9<UInteger, Integer, Integer, Byte, String, String, Byte, Integer, Timestamp> {

    private static final long serialVersionUID = 846598320;

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.rec_id</code>.
     */
    public void setRecId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.rec_id</code>.
     */
    public UInteger getRecId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.group_id</code>. 群发组，-1全部 0未分组，&gt;0其他分组
     */
    public void setGroupId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.group_id</code>. 群发组，-1全部 0未分组，&gt;0其他分组
     */
    public Integer getGroupId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.sex</code>. 性别：0全部 1 男，2女
     */
    public void setSex(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.sex</code>. 性别：0全部 1 男，2女
     */
    public Byte getSex() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.touser</code>. 群发对象，用,号隔开的openid
     */
    public void setTouser(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.touser</code>. 群发对象，用,号隔开的openid
     */
    public String getTouser() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.content</code>. 群发数据
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.content</code>. 群发数据
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.is_ok</code>. 是否发送成功
     */
    public void setIsOk(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.is_ok</code>. 是否发送成功
     */
    public Byte getIsOk() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.micro_id</code>. 所属微信公众号ID,关联b2c_wxp_list的micro_id
     */
    public void setMicroId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.micro_id</code>. 所属微信公众号ID,关联b2c_wxp_list的micro_id
     */
    public Integer getMicroId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_wxp_mass_send_msg.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_wxp_mass_send_msg.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, Integer, Integer, Byte, String, String, Byte, Integer, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, Integer, Integer, Byte, String, String, Byte, Integer, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.REC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.TOUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.IS_OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.MICRO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return WxpMassSendMsg.WXP_MASS_SEND_MSG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getRecId();
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
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTouser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getMicroId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getRecId();
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
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTouser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMicroId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value1(UInteger value) {
        setRecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value3(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value4(Byte value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value5(String value) {
        setTouser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value7(Byte value) {
        setIsOk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value8(Integer value) {
        setMicroId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpMassSendMsgRecord values(UInteger value1, Integer value2, Integer value3, Byte value4, String value5, String value6, Byte value7, Integer value8, Timestamp value9) {
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
     * Create a detached WxpMassSendMsgRecord
     */
    public WxpMassSendMsgRecord() {
        super(WxpMassSendMsg.WXP_MASS_SEND_MSG);
    }

    /**
     * Create a detached, initialised WxpMassSendMsgRecord
     */
    public WxpMassSendMsgRecord(UInteger recId, Integer shopId, Integer groupId, Byte sex, String touser, String content, Byte isOk, Integer microId, Timestamp createTime) {
        super(WxpMassSendMsg.WXP_MASS_SEND_MSG);

        set(0, recId);
        set(1, shopId);
        set(2, groupId);
        set(3, sex);
        set(4, touser);
        set(5, content);
        set(6, isOk);
        set(7, microId);
        set(8, createTime);
    }
}
