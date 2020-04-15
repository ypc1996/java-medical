/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.MemberCard;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 会员卡信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberCardRecord extends UpdatableRecordImpl<MemberCardRecord> {

    private static final long serialVersionUID = 657036721;

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_name</code>.
     */
    public void setCardName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_name</code>.
     */
    public String getCardName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_type</code>. 0:普通会员卡，1:次卡,2:登记卡
     */
    public void setCardType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_type</code>. 0:普通会员卡，1:次卡,2:登记卡
     */
    public Byte getCardType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.bg_type</code>. 0:背景色，1:背景图
     */
    public void setBgType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.bg_type</code>. 0:背景色，1:背景图
     */
    public Byte getBgType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.bg_color</code>. 背景色
     */
    public void setBgColor(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.bg_color</code>. 背景色
     */
    public String getBgColor() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.bg_img</code>. 背景图
     */
    public void setBgImg(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.bg_img</code>. 背景图
     */
    public String getBgImg() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount</code>. 折扣
     */
    public void setDiscount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount</code>. 折扣
     */
    public BigDecimal getDiscount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.sorce</code>. 开卡送积分
     */
    public void setSorce(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.sorce</code>. 开卡送积分
     */
    public Integer getSorce() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.buy_score</code>. 购物送积分策略json数据
     */
    public void setBuyScore(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.buy_score</code>. 购物送积分策略json数据
     */
    public String getBuyScore() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.expire_type</code>. 0:固定日期 1：自领取之日起 2:不过期
     */
    public void setExpireType(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.expire_type</code>. 0:固定日期 1：自领取之日起 2:不过期
     */
    public Byte getExpireType() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.start_time</code>. 开始日期
     */
    public void setStartTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.start_time</code>. 开始日期
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.end_time</code>. 结束日期
     */
    public void setEndTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.end_time</code>. 结束日期
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.receive_day</code>. 领取之日起n
     */
    public void setReceiveDay(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.receive_day</code>. 领取之日起n
     */
    public Integer getReceiveDay() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.date_type</code>. 0:日，1:周 2: 月
     */
    public void setDateType(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.date_type</code>. 0:日，1:周 2: 月
     */
    public Byte getDateType() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.activation</code>. 0：不用激活，1：需要激活
     */
    public void setActivation(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.activation</code>. 0：不用激活，1：需要激活
     */
    public Byte getActivation() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.receive_code</code>. 领取码
     */
    public void setReceiveCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.receive_code</code>. 领取码
     */
    public String getReceiveCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.desc</code>. 使用须知
     */
    public void setDesc(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.desc</code>. 使用须知
     */
    public String getDesc() {
        return (String) get(16);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.mobile</code>. 联系电话
     */
    public void setMobile(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.mobile</code>. 联系电话
     */
    public String getMobile() {
        return (String) get(17);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.create_time</code>. 添加时间
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.create_time</code>. 添加时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.flag</code>. 1:使用中，2:停止使用
     */
    public void setFlag(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.flag</code>. 1:使用中，2:停止使用
     */
    public Byte getFlag() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.send_money</code>. 开卡送钱
     */
    public void setSendMoney(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.send_money</code>. 开卡送钱
     */
    public Integer getSendMoney() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.charge_money</code>. 充值活动策略
     */
    public void setChargeMoney(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.charge_money</code>. 充值活动策略
     */
    public String getChargeMoney() {
        return (String) get(22);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.use_time</code>. 使用时间 1工作日 2双休 0不限制
     */
    public void setUseTime(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.use_time</code>. 使用时间 1工作日 2双休 0不限制
     */
    public Integer getUseTime() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.store_list</code>. 可用门店
     */
    public void setStoreList(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.store_list</code>. 可用门店
     */
    public String getStoreList() {
        return (String) get(24);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.count</code>. 卡总次数
     */
    public void setCount(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.count</code>. 卡总次数
     */
    public Integer getCount() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.del_flag</code>. 1为删除状态
     */
    public void setDelFlag(Byte value) {
        set(26, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.del_flag</code>. 1为删除状态
     */
    public Byte getDelFlag() {
        return (Byte) get(26);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.grade</code>. 等级卡的等级
     */
    public void setGrade(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.grade</code>. 等级卡的等级
     */
    public String getGrade() {
        return (String) get(27);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.grade_condition</code>. 等级卡的条件
     */
    public void setGradeCondition(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.grade_condition</code>. 等级卡的条件
     */
    public String getGradeCondition() {
        return (String) get(28);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.activation_cfg</code>. 激活信息配置
     */
    public void setActivationCfg(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.activation_cfg</code>. 激活信息配置
     */
    public String getActivationCfg() {
        return (String) get(29);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.examine</code>. 是否审核 0不审核 1审核
     */
    public void setExamine(Byte value) {
        set(30, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.examine</code>. 是否审核 0不审核 1审核
     */
    public Byte getExamine() {
        return (Byte) get(30);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount_goods_id</code>. 折扣商品id
     */
    public void setDiscountGoodsId(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount_goods_id</code>. 折扣商品id
     */
    public String getDiscountGoodsId() {
        return (String) get(31);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount_cat_id</code>. 折扣平台分类id
     */
    public void setDiscountCatId(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount_cat_id</code>. 折扣平台分类id
     */
    public String getDiscountCatId() {
        return (String) get(32);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount_sort_id</code>. 折扣商家分类id
     */
    public void setDiscountSortId(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount_sort_id</code>. 折扣商家分类id
     */
    public String getDiscountSortId() {
        return (String) get(33);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount_is_all</code>. 折扣商品范围： 0:部分商品，1:全部商品
     */
    public void setDiscountIsAll(Byte value) {
        set(34, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount_is_all</code>. 折扣商品范围： 0:部分商品，1:全部商品
     */
    public Byte getDiscountIsAll() {
        return (Byte) get(34);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.is_pay</code>. 0:直接购买 1:需要购买 2: 需要领取码
     */
    public void setIsPay(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.is_pay</code>. 0:直接购买 1:需要购买 2: 需要领取码
     */
    public Byte getIsPay() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.pay_type</code>. 0:不支持现金购买，1:支持现金购买
     */
    public void setPayType(Byte value) {
        set(36, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.pay_type</code>. 0:不支持现金购买，1:支持现金购买
     */
    public Byte getPayType() {
        return (Byte) get(36);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.pay_fee</code>. 购买资金
     */
    public void setPayFee(BigDecimal value) {
        set(37, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.pay_fee</code>. 购买资金
     */
    public BigDecimal getPayFee() {
        return (BigDecimal) get(37);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.pay_own_good</code>. 是否专属购买商品 0不是 1是
     */
    public void setPayOwnGood(Byte value) {
        set(38, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.pay_own_good</code>. 是否专属购买商品 0不是 1是
     */
    public Byte getPayOwnGood() {
        return (Byte) get(38);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.receive_action</code>. 领取方式 1:领取码 2：卡号+密码
     */
    public void setReceiveAction(Byte value) {
        set(39, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.receive_action</code>. 领取方式 1:领取码 2：卡号+密码
     */
    public Byte getReceiveAction() {
        return (Byte) get(39);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.is_exchang</code>. 0不可 1部分 2全部
     */
    public void setIsExchang(Byte value) {
        set(40, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.is_exchang</code>. 0不可 1部分 2全部
     */
    public Byte getIsExchang() {
        return (Byte) get(40);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.store_use_switch</code>. 可否在门店使用  0不可以 1可以
     */
    public void setStoreUseSwitch(Byte value) {
        set(41, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.store_use_switch</code>. 可否在门店使用  0不可以 1可以
     */
    public Byte getStoreUseSwitch() {
        return (Byte) get(41);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.exchang_goods</code>. 可兑换商品id
     */
    public void setExchangGoods(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.exchang_goods</code>. 可兑换商品id
     */
    public String getExchangGoods() {
        return (String) get(42);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.exchang_freight</code>. 运费策略 0免运费 1使用商品运费策略
     */
    public void setExchangFreight(Byte value) {
        set(43, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.exchang_freight</code>. 运费策略 0免运费 1使用商品运费策略
     */
    public Byte getExchangFreight() {
        return (Byte) get(43);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.exchang_count</code>. 允许兑换次数
     */
    public void setExchangCount(Integer value) {
        set(44, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.exchang_count</code>. 允许兑换次数
     */
    public Integer getExchangCount() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.stock</code>. 发放总量
     */
    public void setStock(Integer value) {
        set(45, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.stock</code>. 发放总量
     */
    public Integer getStock() {
        return (Integer) get(45);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.limit</code>. 领取限制
     */
    public void setLimit(Integer value) {
        set(46, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.limit</code>. 领取限制
     */
    public Integer getLimit() {
        return (Integer) get(46);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.discount_brand_id</code>. 商品品牌id
     */
    public void setDiscountBrandId(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.discount_brand_id</code>. 商品品牌id
     */
    public String getDiscountBrandId() {
        return (String) get(47);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.send_coupon_switch</code>. 是否开卡送券：0不是，1是
     */
    public void setSendCouponSwitch(Byte value) {
        set(48, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.send_coupon_switch</code>. 是否开卡送券：0不是，1是
     */
    public Byte getSendCouponSwitch() {
        return (Byte) get(48);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.send_coupon_type</code>. 送惠类型：0优惠券，1优惠券礼包
     */
    public void setSendCouponType(Byte value) {
        set(49, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.send_coupon_type</code>. 送惠类型：0优惠券，1优惠券礼包
     */
    public Byte getSendCouponType() {
        return (Byte) get(49);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.send_coupon_ids</code>. 赠送优惠券或礼包id，字符串逗号隔开
     */
    public void setSendCouponIds(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.send_coupon_ids</code>. 赠送优惠券或礼包id，字符串逗号隔开
     */
    public String getSendCouponIds() {
        return (String) get(50);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.custom_rights</code>. 自定义权益
     */
    public void setCustomRights(String value) {
        set(51, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.custom_rights</code>. 自定义权益
     */
    public String getCustomRights() {
        return (String) get(51);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.freeship_limit</code>. -1：不包邮，0:不限制，1：持卡有效期内，2：年，3：季，4：月，5：周，6：日
     */
    public void setFreeshipLimit(Byte value) {
        set(52, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.freeship_limit</code>. -1：不包邮，0:不限制，1：持卡有效期内，2：年，3：季，4：月，5：周，6：日
     */
    public Byte getFreeshipLimit() {
        return (Byte) get(52);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.freeship_num</code>. 周期内包邮次数
     */
    public void setFreeshipNum(Integer value) {
        set(53, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.freeship_num</code>. 周期内包邮次数
     */
    public Integer getFreeshipNum() {
        return (Integer) get(53);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.renew_member_card</code>. 0:不可续费，1:可续费
     */
    public void setRenewMemberCard(Byte value) {
        set(54, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.renew_member_card</code>. 0:不可续费，1:可续费
     */
    public Byte getRenewMemberCard() {
        return (Byte) get(54);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.renew_type</code>. 0:现金 1：积分
     */
    public void setRenewType(Byte value) {
        set(55, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.renew_type</code>. 0:现金 1：积分
     */
    public Byte getRenewType() {
        return (Byte) get(55);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.renew_num</code>. 现金或积分数量
     */
    public void setRenewNum(BigDecimal value) {
        set(56, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.renew_num</code>. 现金或积分数量
     */
    public BigDecimal getRenewNum() {
        return (BigDecimal) get(56);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.renew_time</code>. 续费时间
     */
    public void setRenewTime(Integer value) {
        set(57, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.renew_time</code>. 续费时间
     */
    public Integer getRenewTime() {
        return (Integer) get(57);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.renew_date_type</code>. 0:日，1:周 2: 月
     */
    public void setRenewDateType(Byte value) {
        set(58, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.renew_date_type</code>. 0:日，1:周 2: 月
     */
    public Byte getRenewDateType() {
        return (Byte) get(58);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.cannot_use_coupon</code>. 是否和会员卡一起使用0:可以1：不可以
     */
    public void setCannotUseCoupon(Byte value) {
        set(59, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.cannot_use_coupon</code>. 是否和会员卡一起使用0:可以1：不可以
     */
    public Byte getCannotUseCoupon() {
        return (Byte) get(59);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.custom_rights_flag</code>. 自定义权益开关
     */
    public void setCustomRightsFlag(Byte value) {
        set(60, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.custom_rights_flag</code>. 自定义权益开关
     */
    public Byte getCustomRightsFlag() {
        return (Byte) get(60);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.custom_options</code>. 自定义激活信息配置
     */
    public void setCustomOptions(String value) {
        set(61, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.custom_options</code>. 自定义激活信息配置
     */
    public String getCustomOptions() {
        return (String) get(61);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_tag</code>. 是否开启给领卡用户打标签0否，1是
     */
    public void setCardTag(Byte value) {
        set(62, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_tag</code>. 是否开启给领卡用户打标签0否，1是
     */
    public Byte getCardTag() {
        return (Byte) get(62);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_tag_id</code>. 领卡打标签id
     */
    public void setCardTagId(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_tag_id</code>. 领卡打标签id
     */
    public String getCardTagId() {
        return (String) get(63);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_give_away</code>. 0:不可转赠，1:可以转赠
     */
    public void setCardGiveAway(Byte value) {
        set(64, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_give_away</code>. 0:不可转赠，1:可以转赠
     */
    public Byte getCardGiveAway() {
        return (Byte) get(64);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.card_give_continue</code>. 0:不可继续转赠，1:可以继续转赠
     */
    public void setCardGiveContinue(Byte value) {
        set(65, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.card_give_continue</code>. 0:不可继续转赠，1:可以继续转赠
     */
    public Byte getCardGiveContinue() {
        return (Byte) get(65);
    }

    /**
     * Setter for <code>jmini_shop_489258.b2c_member_card.most_give_away</code>. 最多可转赠多少次 0不限制
     */
    public void setMostGiveAway(Integer value) {
        set(66, value);
    }

    /**
     * Getter for <code>jmini_shop_489258.b2c_member_card.most_give_away</code>. 最多可转赠多少次 0不限制
     */
    public Integer getMostGiveAway() {
        return (Integer) get(66);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemberCardRecord
     */
    public MemberCardRecord() {
        super(MemberCard.MEMBER_CARD);
    }

    /**
     * Create a detached, initialised MemberCardRecord
     */
    public MemberCardRecord(Integer id, String cardName, Byte cardType, Byte bgType, String bgColor, String bgImg, BigDecimal discount, Integer sorce, String buyScore, Byte expireType, Timestamp startTime, Timestamp endTime, Integer receiveDay, Byte dateType, Byte activation, String receiveCode, String desc, String mobile, Timestamp createTime, Timestamp updateTime, Byte flag, Integer sendMoney, String chargeMoney, Integer useTime, String storeList, Integer count, Byte delFlag, String grade, String gradeCondition, String activationCfg, Byte examine, String discountGoodsId, String discountCatId, String discountSortId, Byte discountIsAll, Byte isPay, Byte payType, BigDecimal payFee, Byte payOwnGood, Byte receiveAction, Byte isExchang, Byte storeUseSwitch, String exchangGoods, Byte exchangFreight, Integer exchangCount, Integer stock, Integer limit, String discountBrandId, Byte sendCouponSwitch, Byte sendCouponType, String sendCouponIds, String customRights, Byte freeshipLimit, Integer freeshipNum, Byte renewMemberCard, Byte renewType, BigDecimal renewNum, Integer renewTime, Byte renewDateType, Byte cannotUseCoupon, Byte customRightsFlag, String customOptions, Byte cardTag, String cardTagId, Byte cardGiveAway, Byte cardGiveContinue, Integer mostGiveAway) {
        super(MemberCard.MEMBER_CARD);

        set(0, id);
        set(1, cardName);
        set(2, cardType);
        set(3, bgType);
        set(4, bgColor);
        set(5, bgImg);
        set(6, discount);
        set(7, sorce);
        set(8, buyScore);
        set(9, expireType);
        set(10, startTime);
        set(11, endTime);
        set(12, receiveDay);
        set(13, dateType);
        set(14, activation);
        set(15, receiveCode);
        set(16, desc);
        set(17, mobile);
        set(18, createTime);
        set(19, updateTime);
        set(20, flag);
        set(21, sendMoney);
        set(22, chargeMoney);
        set(23, useTime);
        set(24, storeList);
        set(25, count);
        set(26, delFlag);
        set(27, grade);
        set(28, gradeCondition);
        set(29, activationCfg);
        set(30, examine);
        set(31, discountGoodsId);
        set(32, discountCatId);
        set(33, discountSortId);
        set(34, discountIsAll);
        set(35, isPay);
        set(36, payType);
        set(37, payFee);
        set(38, payOwnGood);
        set(39, receiveAction);
        set(40, isExchang);
        set(41, storeUseSwitch);
        set(42, exchangGoods);
        set(43, exchangFreight);
        set(44, exchangCount);
        set(45, stock);
        set(46, limit);
        set(47, discountBrandId);
        set(48, sendCouponSwitch);
        set(49, sendCouponType);
        set(50, sendCouponIds);
        set(51, customRights);
        set(52, freeshipLimit);
        set(53, freeshipNum);
        set(54, renewMemberCard);
        set(55, renewType);
        set(56, renewNum);
        set(57, renewTime);
        set(58, renewDateType);
        set(59, cannotUseCoupon);
        set(60, customRightsFlag);
        set(61, customOptions);
        set(62, cardTag);
        set(63, cardTagId);
        set(64, cardGiveAway);
        set(65, cardGiveContinue);
        set(66, mostGiveAway);
    }
}
