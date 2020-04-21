/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.Bargain;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


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
public class BargainRecord extends UpdatableRecordImpl<BargainRecord> {

    private static final long serialVersionUID = -1998590934;

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_name</code>. 活动名称
     */
    public void setBargainName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_name</code>. 活动名称
     */
    public String getBargainName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.goods_id</code>. 商品ID
     */
    public void setGoodsId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.goods_id</code>. 商品ID
     */
    public String getGoodsId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.start_time</code>. 开始时间
     */
    public void setStartTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.end_time</code>. 结束时间
     */
    public void setEndTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.end_time</code>. 结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.expectation_number</code>. 砍价预期人数
     */
    public void setExpectationNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.expectation_number</code>. 砍价预期人数
     */
    public Integer getExpectationNumber() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.expectation_price</code>. 预期砍价最低金额
     */
    public void setExpectationPrice(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.expectation_price</code>. 预期砍价最低金额
     */
    public BigDecimal getExpectationPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_min</code>. 首次返利比例小
     */
    public void setBargainMin(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_min</code>. 首次返利比例小
     */
    public Double getBargainMin() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_max</code>. 首次返利比例大
     */
    public void setBargainMax(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_max</code>. 首次返利比例大
     */
    public Double getBargainMax() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.stock</code>. 库存
     */
    public void setStock(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.stock</code>. 库存
     */
    public Integer getStock() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.sale_num</code>. 销售量
     */
    public void setSaleNum(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.sale_num</code>. 销售量
     */
    public Integer getSaleNum() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.mrking_voucher_id</code>.
     */
    public void setMrkingVoucherId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.mrking_voucher_id</code>.
     */
    public String getMrkingVoucherId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.status</code>. 状态：1可用，0停用
     */
    public void setStatus(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.status</code>. 状态：1可用，0停用
     */
    public Byte getStatus() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.del_flag</code>. 1删除
     */
    public void setDelFlag(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.del_flag</code>. 1删除
     */
    public Byte getDelFlag() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.del_time</code>.
     */
    public void setDelTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.del_time</code>.
     */
    public Timestamp getDelTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.reward_coupon_id</code>. 砍价失败发放优惠券
     */
    public void setRewardCouponId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.reward_coupon_id</code>. 砍价失败发放优惠券
     */
    public String getRewardCouponId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.share_config</code>. 分享设置
     */
    public void setShareConfig(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.share_config</code>. 分享设置
     */
    public String getShareConfig() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_type</code>. 砍价类型0定人1任意价
     */
    public void setBargainType(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_type</code>. 砍价类型0定人1任意价
     */
    public Byte getBargainType() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.floor_price</code>. 任意低价
     */
    public void setFloorPrice(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.floor_price</code>. 任意低价
     */
    public BigDecimal getFloorPrice() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_money_type</code>. 砍价计算模式
     */
    public void setBargainMoneyType(Byte value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_money_type</code>. 砍价计算模式
     */
    public Byte getBargainMoneyType() {
        return (Byte) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_fixed_money</code>. 固定金额
     */
    public void setBargainFixedMoney(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_fixed_money</code>. 固定金额
     */
    public BigDecimal getBargainFixedMoney() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_min_money</code>. 最低价
     */
    public void setBargainMinMoney(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_min_money</code>. 最低价
     */
    public BigDecimal getBargainMinMoney() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.bargain_max_money</code>. 最高价
     */
    public void setBargainMaxMoney(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.bargain_max_money</code>. 最高价
     */
    public BigDecimal getBargainMaxMoney() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.free_freight</code>. 0不免运费，使用原商品运费模板   1免运费
     */
    public void setFreeFreight(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.free_freight</code>. 0不免运费，使用原商品运费模板   1免运费
     */
    public Byte getFreeFreight() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.need_bind_mobile</code>. 是否需要绑定手机号，1是
     */
    public void setNeedBindMobile(Byte value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.need_bind_mobile</code>. 是否需要绑定手机号，1是
     */
    public Byte getNeedBindMobile() {
        return (Byte) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.initial_sales</code>. 初始销量
     */
    public void setInitialSales(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.initial_sales</code>. 初始销量
     */
    public Integer getInitialSales() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.first</code>. 优先级
     */
    public void setFirst(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.first</code>. 优先级
     */
    public Integer getFirst() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.activity_copywriting</code>. 自定义活动说明
     */
    public void setActivityCopywriting(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.activity_copywriting</code>. 自定义活动说明
     */
    public String getActivityCopywriting() {
        return (String) get(29);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.launch_tag</code>. 是否给发起砍价用户打标签
     */
    public void setLaunchTag(Byte value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.launch_tag</code>. 是否给发起砍价用户打标签
     */
    public Byte getLaunchTag() {
        return (Byte) get(30);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.launch_tag_id</code>. 发起砍价活动用户打标签id
     */
    public void setLaunchTagId(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.launch_tag_id</code>. 发起砍价活动用户打标签id
     */
    public String getLaunchTagId() {
        return (String) get(31);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.attend_tag</code>. 是否参与砍价用户打标签
     */
    public void setAttendTag(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.attend_tag</code>. 是否参与砍价用户打标签
     */
    public Byte getAttendTag() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_bargain.attend_tag_id</code>. 参与砍价活动用户打标签id
     */
    public void setAttendTagId(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_bargain.attend_tag_id</code>. 参与砍价活动用户打标签id
     */
    public String getAttendTagId() {
        return (String) get(33);
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
     * Create a detached BargainRecord
     */
    public BargainRecord() {
        super(Bargain.BARGAIN);
    }

    /**
     * Create a detached, initialised BargainRecord
     */
    public BargainRecord(Integer id, String bargainName, String goodsId, Timestamp startTime, Timestamp endTime, Integer expectationNumber, BigDecimal expectationPrice, Double bargainMin, Double bargainMax, Integer stock, Integer saleNum, String mrkingVoucherId, Byte status, Byte delFlag, Timestamp createTime, Timestamp updateTime, Timestamp delTime, String rewardCouponId, String shareConfig, Byte bargainType, BigDecimal floorPrice, Byte bargainMoneyType, BigDecimal bargainFixedMoney, BigDecimal bargainMinMoney, BigDecimal bargainMaxMoney, Byte freeFreight, Byte needBindMobile, Integer initialSales, Integer first, String activityCopywriting, Byte launchTag, String launchTagId, Byte attendTag, String attendTagId) {
        super(Bargain.BARGAIN);

        set(0, id);
        set(1, bargainName);
        set(2, goodsId);
        set(3, startTime);
        set(4, endTime);
        set(5, expectationNumber);
        set(6, expectationPrice);
        set(7, bargainMin);
        set(8, bargainMax);
        set(9, stock);
        set(10, saleNum);
        set(11, mrkingVoucherId);
        set(12, status);
        set(13, delFlag);
        set(14, createTime);
        set(15, updateTime);
        set(16, delTime);
        set(17, rewardCouponId);
        set(18, shareConfig);
        set(19, bargainType);
        set(20, floorPrice);
        set(21, bargainMoneyType);
        set(22, bargainFixedMoney);
        set(23, bargainMinMoney);
        set(24, bargainMaxMoney);
        set(25, freeFreight);
        set(26, needBindMobile);
        set(27, initialSales);
        set(28, first);
        set(29, activityCopywriting);
        set(30, launchTag);
        set(31, launchTagId);
        set(32, attendTag);
        set(33, attendTagId);
    }
}
