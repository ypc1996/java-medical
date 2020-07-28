/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;



import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import com.vpu.mp.db.shop.tables.Recharge;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 充值记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RechargeRecord extends UpdatableRecordImpl<RechargeRecord> implements Record12<Integer, String, Integer, Integer, Timestamp, String, BigDecimal, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 279219901;

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.recharge_id</code>. 充值记录主键
     */
    public void setRechargeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.recharge_id</code>. 充值记录主键
     */
    public Integer getRechargeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.sid</code>. 充值账户id
     */
    public void setSid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.sid</code>. 充值账户id
     */
    public String getSid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.version</code>. 充值版本，微铺宝默认4
     */
    public void setVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.version</code>. 充值版本，微铺宝默认4
     */
    public Integer getVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.total</code>. 当前充值次数总计
     */
    public void setTotal(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.total</code>. 当前充值次数总计
     */
    public Integer getTotal() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.recharge_time</code>. 充值时间
     */
    public void setRechargeTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.recharge_time</code>. 充值时间
     */
    public Timestamp getRechargeTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.pay_no</code>. 充值单号
     */
    public void setPayNo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.pay_no</code>. 充值单号
     */
    public String getPayNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.price</code>. 充值金额
     */
    public void setPrice(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.price</code>. 充值金额
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.remark</code>. 充值说明
     */
    public void setRemark(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.remark</code>. 充值说明
     */
    public String getRemark() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.sms_num</code>. 当前充值到额短信数
     */
    public void setSmsNum(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.sms_num</code>. 当前充值到额短信数
     */
    public Integer getSmsNum() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.is_delete</code>. 删除
     */
    public void setIsDelete(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.is_delete</code>. 删除
     */
    public Byte getIsDelete() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_recharge.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_recharge.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Integer, Integer, Timestamp, String, BigDecimal, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Integer, Integer, Timestamp, String, BigDecimal, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Recharge.RECHARGE.RECHARGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Recharge.RECHARGE.SID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Recharge.RECHARGE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Recharge.RECHARGE.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Recharge.RECHARGE.RECHARGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Recharge.RECHARGE.PAY_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Recharge.RECHARGE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Recharge.RECHARGE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Recharge.RECHARGE.SMS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Recharge.RECHARGE.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Recharge.RECHARGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Recharge.RECHARGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRechargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getRechargeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPayNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getSmsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRechargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getRechargeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPayNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSmsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value1(Integer value) {
        setRechargeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value2(String value) {
        setSid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value3(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value4(Integer value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value5(Timestamp value) {
        setRechargeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value6(String value) {
        setPayNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value7(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value8(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value9(Integer value) {
        setSmsNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value10(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RechargeRecord values(Integer value1, String value2, Integer value3, Integer value4, Timestamp value5, String value6, BigDecimal value7, String value8, Integer value9, Byte value10, Timestamp value11, Timestamp value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RechargeRecord
     */
    public RechargeRecord() {
        super(Recharge.RECHARGE);
    }

    /**
     * Create a detached, initialised RechargeRecord
     */
    public RechargeRecord(Integer rechargeId, String sid, Integer version, Integer total, Timestamp rechargeTime, String payNo, BigDecimal price, String remark, Integer smsNum, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(Recharge.RECHARGE);

        set(0, rechargeId);
        set(1, sid);
        set(2, version);
        set(3, total);
        set(4, rechargeTime);
        set(5, payNo);
        set(6, price);
        set(7, remark);
        set(8, smsNum);
        set(9, isDelete);
        set(10, createTime);
        set(11, updateTime);
    }
}