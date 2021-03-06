/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.DistributionWithdraw;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class DistributionWithdrawRecord extends UpdatableRecordImpl<DistributionWithdrawRecord> implements Record22<Integer, Integer, Byte, Byte, String, String, String, BigDecimal, BigDecimal, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Timestamp, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1635661918;

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.type</code>. 提现类型  1微信公众号钱包提现 2小程序
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.type</code>. 提现类型  1微信公众号钱包提现 2小程序
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.status</code>. 处理状态 1待审核 2拒绝 3已审核待出账 4出账成功 5失败
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.status</code>. 处理状态 1待审核 2拒绝 3已审核待出账 4出账成功 5失败
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.order_sn</code>. 提现单号
     */
    public void setOrderSn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.order_sn</code>. 提现单号
     */
    public String getOrderSn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_user_num</code>. 用户提现序号
     */
    public void setWithdrawUserNum(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_user_num</code>. 用户提现序号
     */
    public String getWithdrawUserNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_num</code>. 流水号
     */
    public void setWithdrawNum(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_num</code>. 流水号
     */
    public String getWithdrawNum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_cash</code>. 提现金额
     */
    public void setWithdrawCash(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_cash</code>. 提现金额
     */
    public BigDecimal getWithdrawCash() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw</code>. 可提现金额
     */
    public void setWithdraw(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw</code>. 可提现金额
     */
    public BigDecimal getWithdraw() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.desc</code>. 备注
     */
    public void setDesc(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.desc</code>. 备注
     */
    public String getDesc() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.refuse_desc</code>. 驳回原因
     */
    public void setRefuseDesc(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.refuse_desc</code>. 驳回原因
     */
    public String getRefuseDesc() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.check_time</code>. 审核时间
     */
    public void setCheckTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.check_time</code>. 审核时间
     */
    public Timestamp getCheckTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.refuse_time</code>. 驳回时间
     */
    public void setRefuseTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.refuse_time</code>. 驳回时间
     */
    public Timestamp getRefuseTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.billing_time</code>. 出账时间
     */
    public void setBillingTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.billing_time</code>. 出账时间
     */
    public Timestamp getBillingTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.fail_time</code>. 失败时间
     */
    public void setFailTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.fail_time</code>. 失败时间
     */
    public Timestamp getFailTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.desc_time</code>. 备注时间
     */
    public void setDescTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.desc_time</code>. 备注时间
     */
    public Timestamp getDescTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.del_time</code>. 删除时间
     */
    public void setDelTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.del_time</code>. 删除时间
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_source</code>. 申请时提现配置
     */
    public void setWithdrawSource(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.withdraw_source</code>. 申请时提现配置
     */
    public String getWithdrawSource() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.real_name</code>. 真实姓名
     */
    public void setRealName(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.real_name</code>. 真实姓名
     */
    public String getRealName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_distribution_withdraw.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_distribution_withdraw.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Byte, Byte, String, String, String, BigDecimal, BigDecimal, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Timestamp, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Byte, Byte, String, String, String, BigDecimal, BigDecimal, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Timestamp, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.ORDER_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.WITHDRAW_USER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.WITHDRAW_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.WITHDRAW_CASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.WITHDRAW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.REFUSE_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.CHECK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.REFUSE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.BILLING_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.FAIL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.DESC_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.DEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.WITHDRAW_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.REAL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field22() {
        return DistributionWithdraw.DISTRIBUTION_WITHDRAW.UPDATE_TIME;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getWithdrawUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getWithdrawNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getWithdrawCash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getWithdraw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRefuseDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCheckTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getRefuseTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getBillingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getFailTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getDescTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component17() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getWithdrawSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getRealName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component22() {
        return getUpdateTime();
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOrderSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getWithdrawUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getWithdrawNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getWithdrawCash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getWithdraw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRefuseDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCheckTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getRefuseTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getBillingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getFailTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getDescTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getDelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getWithdrawSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getRealName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value22() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value3(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value5(String value) {
        setOrderSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value6(String value) {
        setWithdrawUserNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value7(String value) {
        setWithdrawNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value8(BigDecimal value) {
        setWithdrawCash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value9(BigDecimal value) {
        setWithdraw(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value10(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value11(String value) {
        setRefuseDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value12(Timestamp value) {
        setCheckTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value13(Timestamp value) {
        setRefuseTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value14(Timestamp value) {
        setBillingTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value15(Timestamp value) {
        setFailTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value16(Timestamp value) {
        setDescTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value17(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value18(Timestamp value) {
        setDelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value19(String value) {
        setWithdrawSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value20(String value) {
        setRealName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value21(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord value22(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistributionWithdrawRecord values(Integer value1, Integer value2, Byte value3, Byte value4, String value5, String value6, String value7, BigDecimal value8, BigDecimal value9, String value10, String value11, Timestamp value12, Timestamp value13, Timestamp value14, Timestamp value15, Timestamp value16, Byte value17, Timestamp value18, String value19, String value20, Timestamp value21, Timestamp value22) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DistributionWithdrawRecord
     */
    public DistributionWithdrawRecord() {
        super(DistributionWithdraw.DISTRIBUTION_WITHDRAW);
    }

    /**
     * Create a detached, initialised DistributionWithdrawRecord
     */
    public DistributionWithdrawRecord(Integer id, Integer userId, Byte type, Byte status, String orderSn, String withdrawUserNum, String withdrawNum, BigDecimal withdrawCash, BigDecimal withdraw, String desc, String refuseDesc, Timestamp checkTime, Timestamp refuseTime, Timestamp billingTime, Timestamp failTime, Timestamp descTime, Byte delFlag, Timestamp delTime, String withdrawSource, String realName, Timestamp createTime, Timestamp updateTime) {
        super(DistributionWithdraw.DISTRIBUTION_WITHDRAW);

        set(0, id);
        set(1, userId);
        set(2, type);
        set(3, status);
        set(4, orderSn);
        set(5, withdrawUserNum);
        set(6, withdrawNum);
        set(7, withdrawCash);
        set(8, withdraw);
        set(9, desc);
        set(10, refuseDesc);
        set(11, checkTime);
        set(12, refuseTime);
        set(13, billingTime);
        set(14, failTime);
        set(15, descTime);
        set(16, delFlag);
        set(17, delTime);
        set(18, withdrawSource);
        set(19, realName);
        set(20, createTime);
        set(21, updateTime);
    }
}
