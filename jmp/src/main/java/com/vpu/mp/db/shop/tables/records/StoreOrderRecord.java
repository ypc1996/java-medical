/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.StoreOrder;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class StoreOrderRecord extends UpdatableRecordImpl<StoreOrderRecord> {

    private static final long serialVersionUID = 433036060;

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.order_id</code>. 订单id
     */
    public void setOrderId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.order_id</code>. 订单id
     */
    public UInteger getOrderId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.store_id</code>. 门店id
     */
    public void setStoreId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.store_id</code>. 门店id
     */
    public Integer getStoreId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.user_id</code>. 用户id
     */
    public void setUserId(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.user_id</code>. 用户id
     */
    public UInteger getUserId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.order_status</code>. 订单状态
     */
    public void setOrderStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.order_status</code>. 订单状态
     */
    public Byte getOrderStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.order_status_name</code>. 订单状态名称
     */
    public void setOrderStatusName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.order_status_name</code>. 订单状态名称
     */
    public String getOrderStatusName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.invoice_id</code>. 发票id
     */
    public void setInvoiceId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.invoice_id</code>. 发票id
     */
    public Integer getInvoiceId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.invoice_detail</code>. 发票内容：json存储
     */
    public void setInvoiceDetail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.invoice_detail</code>. 发票内容：json存储
     */
    public String getInvoiceDetail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.add_message</code>. 客户留言
     */
    public void setAddMessage(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.add_message</code>. 客户留言
     */
    public String getAddMessage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.pay_code</code>. 支付代号
     */
    public void setPayCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.pay_code</code>. 支付代号
     */
    public String getPayCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.pay_name</code>. 支付名称
     */
    public void setPayName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.pay_name</code>. 支付名称
     */
    public String getPayName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.prepay_id</code>. 微信支付Id，用于发送模板消息
     */
    public void setPrepayId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.prepay_id</code>. 微信支付Id，用于发送模板消息
     */
    public String getPrepayId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.pay_sn</code>. 支付流水号
     */
    public void setPaySn(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.pay_sn</code>. 支付流水号
     */
    public String getPaySn() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.money_paid</code>. 订单应付金额
     */
    public void setMoneyPaid(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.money_paid</code>. 订单应付金额
     */
    public BigDecimal getMoneyPaid() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.member_card_no</code>. 会员卡NO
     */
    public void setMemberCardNo(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.member_card_no</code>. 会员卡NO
     */
    public String getMemberCardNo() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.member_card_redunce</code>. 会员卡抵扣金额
     */
    public void setMemberCardRedunce(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.member_card_redunce</code>. 会员卡抵扣金额
     */
    public BigDecimal getMemberCardRedunce() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.member_card_balance</code>. 会员卡消费金额
     */
    public void setMemberCardBalance(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.member_card_balance</code>. 会员卡消费金额
     */
    public BigDecimal getMemberCardBalance() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.score_discount</code>. 积分抵扣金额
     */
    public void setScoreDiscount(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.score_discount</code>. 积分抵扣金额
     */
    public BigDecimal getScoreDiscount() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.use_account</code>. 用户消费余额
     */
    public void setUseAccount(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.use_account</code>. 用户消费余额
     */
    public BigDecimal getUseAccount() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.order_amount</code>. 订单总金额
     */
    public void setOrderAmount(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.order_amount</code>. 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.add_time</code>. 订单提交时间
     */
    public void setAddTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.add_time</code>. 订单提交时间
     */
    public Timestamp getAddTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.pay_time</code>. 支付时间
     */
    public void setPayTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.pay_time</code>. 支付时间
     */
    public Timestamp getPayTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.seller_remark</code>. 卖家备注
     */
    public void setSellerRemark(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.seller_remark</code>. 卖家备注
     */
    public String getSellerRemark() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.star_flag</code>. 标星订单：0 未标星 1 标星
     */
    public void setStarFlag(Byte value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.star_flag</code>. 标星订单：0 未标星 1 标星
     */
    public Byte getStarFlag() {
        return (Byte) get(23);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.del_flag</code>. 删除
     */
    public void setDelFlag(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.del_flag</code>. 删除
     */
    public Byte getDelFlag() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_store_order.ali_trade_no</code>. 支付宝交易单号
     */
    public void setAliTradeNo(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_store_order.ali_trade_no</code>. 支付宝交易单号
     */
    public String getAliTradeNo() {
        return (String) get(25);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreOrderRecord
     */
    public StoreOrderRecord() {
        super(StoreOrder.STORE_ORDER);
    }

    /**
     * Create a detached, initialised StoreOrderRecord
     */
    public StoreOrderRecord(UInteger orderId, Integer storeId, String orderSn, UInteger userId, Byte orderStatus, String orderStatusName, Integer invoiceId, String invoiceDetail, String addMessage, String payCode, String payName, String prepayId, String paySn, BigDecimal moneyPaid, String memberCardNo, BigDecimal memberCardRedunce, BigDecimal memberCardBalance, BigDecimal scoreDiscount, BigDecimal useAccount, BigDecimal orderAmount, Timestamp addTime, Timestamp payTime, String sellerRemark, Byte starFlag, Byte delFlag, String aliTradeNo) {
        super(StoreOrder.STORE_ORDER);

        set(0, orderId);
        set(1, storeId);
        set(2, orderSn);
        set(3, userId);
        set(4, orderStatus);
        set(5, orderStatusName);
        set(6, invoiceId);
        set(7, invoiceDetail);
        set(8, addMessage);
        set(9, payCode);
        set(10, payName);
        set(11, prepayId);
        set(12, paySn);
        set(13, moneyPaid);
        set(14, memberCardNo);
        set(15, memberCardRedunce);
        set(16, memberCardBalance);
        set(17, scoreDiscount);
        set(18, useAccount);
        set(19, orderAmount);
        set(20, addTime);
        set(21, payTime);
        set(22, sellerRemark);
        set(23, starFlag);
        set(24, delFlag);
        set(25, aliTradeNo);
    }
}
