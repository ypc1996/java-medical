/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.PinIntegrationList;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class PinIntegrationListRecord extends UpdatableRecordImpl<PinIntegrationListRecord> implements Record14<Integer, Integer, String, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Short, Integer, Byte, Byte, Integer> {

    private static final long serialVersionUID = -1898214156;

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.inte_activity_id</code>. 瓜分积分活动定义ID
     */
    public void setInteActivityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.inte_activity_id</code>. 瓜分积分活动定义ID
     */
    public Integer getInteActivityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.group_id</code>. 拼团ID
     */
    public void setGroupId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.group_id</code>. 拼团ID
     */
    public String getGroupId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.is_grouper</code>. 是否为团长 1：是 0：否
     */
    public void setIsGrouper(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.is_grouper</code>. 是否为团长 1：是 0：否
     */
    public Byte getIsGrouper() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.status</code>. 0: 拼团中 1:拼团成功 2:拼团失败
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.status</code>. 0: 拼团中 1:拼团成功 2:拼团失败
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.start_time</code>. 参团时间
     */
    public void setStartTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.start_time</code>. 参团时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.end_time</code>. 成团时间
     */
    public void setEndTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.end_time</code>. 成团时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.integration</code>. 瓜分到的积分
     */
    public void setIntegration(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.integration</code>. 瓜分到的积分
     */
    public Integer getIntegration() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.invite_num</code>. 邀请人的数量
     */
    public void setInviteNum(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.invite_num</code>. 邀请人的数量
     */
    public Short getInviteNum() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.invite_user</code>. 邀请人（被谁邀请）
     */
    public void setInviteUser(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.invite_user</code>. 邀请人（被谁邀请）
     */
    public Integer getInviteUser() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.is_new</code>. 是否是新用户：0：不是，1：是
     */
    public void setIsNew(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.is_new</code>. 是否是新用户：0：不是，1：是
     */
    public Byte getIsNew() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.is_look</code>. 是否看过开奖结果
     */
    public void setIsLook(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.is_look</code>. 是否看过开奖结果
     */
    public Byte getIsLook() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_pin_integration_list.can_integration</code>. 该团可瓜分积分池
     */
    public void setCanIntegration(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_pin_integration_list.can_integration</code>. 该团可瓜分积分池
     */
    public Integer getCanIntegration() {
        return (Integer) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Short, Integer, Byte, Byte, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Short, Integer, Byte, Byte, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.INTE_ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.IS_GROUPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.INTEGRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.INVITE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.INVITE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.IS_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.IS_LOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return PinIntegrationList.PIN_INTEGRATION_LIST.CAN_INTEGRATION;
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
        return getInteActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsGrouper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getIntegration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getInviteNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getInviteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getIsNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getIsLook();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getCanIntegration();
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
        return getInteActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsGrouper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getIntegration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getInviteNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getInviteUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getIsLook();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getCanIntegration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value2(Integer value) {
        setInteActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value3(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value5(Byte value) {
        setIsGrouper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value7(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value8(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value9(Integer value) {
        setIntegration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value10(Short value) {
        setInviteNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value11(Integer value) {
        setInviteUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value12(Byte value) {
        setIsNew(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value13(Byte value) {
        setIsLook(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord value14(Integer value) {
        setCanIntegration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PinIntegrationListRecord values(Integer value1, Integer value2, String value3, Integer value4, Byte value5, Byte value6, Timestamp value7, Timestamp value8, Integer value9, Short value10, Integer value11, Byte value12, Byte value13, Integer value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PinIntegrationListRecord
     */
    public PinIntegrationListRecord() {
        super(PinIntegrationList.PIN_INTEGRATION_LIST);
    }

    /**
     * Create a detached, initialised PinIntegrationListRecord
     */
    public PinIntegrationListRecord(Integer id, Integer inteActivityId, String groupId, Integer userId, Byte isGrouper, Byte status, Timestamp startTime, Timestamp endTime, Integer integration, Short inviteNum, Integer inviteUser, Byte isNew, Byte isLook, Integer canIntegration) {
        super(PinIntegrationList.PIN_INTEGRATION_LIST);

        set(0, id);
        set(1, inteActivityId);
        set(2, groupId);
        set(3, userId);
        set(4, isGrouper);
        set(5, status);
        set(6, startTime);
        set(7, endTime);
        set(8, integration);
        set(9, inviteNum);
        set(10, inviteUser);
        set(11, isNew);
        set(12, isLook);
        set(13, canIntegration);
    }
}
