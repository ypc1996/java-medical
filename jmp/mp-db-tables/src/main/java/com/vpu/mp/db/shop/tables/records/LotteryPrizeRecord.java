/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.LotteryPrize;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class LotteryPrizeRecord extends UpdatableRecordImpl<LotteryPrizeRecord> implements Record13<Integer, Integer, Byte, Byte, Byte, Integer, Integer, Byte, Byte, Byte, String, String, String> {

    private static final long serialVersionUID = 938655928;

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.lottery_id</code>. 抽奖编号
     */
    public void setLotteryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.lottery_id</code>. 抽奖编号
     */
    public Integer getLotteryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.lottery_grade</code>. 中奖等级：1一等奖，2二等奖，3三等奖，4四等奖
     */
    public void setLotteryGrade(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.lottery_grade</code>. 中奖等级：1一等奖，2二等奖，3三等奖，4四等奖
     */
    public Byte getLotteryGrade() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.chance</code>. 中奖概率%
     */
    public void setChance(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.chance</code>. 中奖概率%
     */
    public Byte getChance() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.present_type</code>. 选择奖类型 0积分 1 用户余额 2优惠券 3赠品 4 自定义 
     */
    public void setPresentType(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.present_type</code>. 选择奖类型 0积分 1 用户余额 2优惠券 3赠品 4 自定义 
     */
    public Byte getPresentType() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.present_number</code>. 奖品份数
     */
    public void setPresentNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.present_number</code>. 奖品份数
     */
    public Integer getPresentNumber() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.integral_score</code>. 积分数量
     */
    public void setIntegralScore(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.integral_score</code>. 积分数量
     */
    public Integer getIntegralScore() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.coupon_id</code>. 优惠券id
     */
    public void setCouponId(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.coupon_id</code>. 优惠券id
     */
    public Byte getCouponId() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.prd_id</code>. 赠品规格id
     */
    public void setPrdId(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.prd_id</code>. 赠品规格id
     */
    public Byte getPrdId() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.prd_keep_days</code>. 赠品有效期
     */
    public void setPrdKeepDays(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.prd_keep_days</code>. 赠品有效期
     */
    public Byte getPrdKeepDays() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.present_detail</code>. 奖品信息
     */
    public void setPresentDetail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.present_detail</code>. 奖品信息
     */
    public String getPresentDetail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.icon_imgs_image</code>. 中奖图片
     */
    public void setIconImgsImage(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.icon_imgs_image</code>. 中奖图片
     */
    public String getIconImgsImage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_4748160.b2c_lottery_prize.icon_imgs</code>. 中奖提示
     */
    public void setIconImgs(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_4748160.b2c_lottery_prize.icon_imgs</code>. 中奖提示
     */
    public String getIconImgs() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Byte, Byte, Byte, Integer, Integer, Byte, Byte, Byte, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Byte, Byte, Byte, Integer, Integer, Byte, Byte, Byte, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LotteryPrize.LOTTERY_PRIZE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LotteryPrize.LOTTERY_PRIZE.LOTTERY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return LotteryPrize.LOTTERY_PRIZE.LOTTERY_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return LotteryPrize.LOTTERY_PRIZE.CHANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return LotteryPrize.LOTTERY_PRIZE.PRESENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return LotteryPrize.LOTTERY_PRIZE.PRESENT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return LotteryPrize.LOTTERY_PRIZE.INTEGRAL_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return LotteryPrize.LOTTERY_PRIZE.COUPON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return LotteryPrize.LOTTERY_PRIZE.PRD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return LotteryPrize.LOTTERY_PRIZE.PRD_KEEP_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return LotteryPrize.LOTTERY_PRIZE.PRESENT_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return LotteryPrize.LOTTERY_PRIZE.ICON_IMGS_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LotteryPrize.LOTTERY_PRIZE.ICON_IMGS;
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
        return getLotteryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getLotteryGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getChance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getPresentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPresentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getIntegralScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getPrdKeepDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPresentDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getIconImgsImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getIconImgs();
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
        return getLotteryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getLotteryGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getChance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getPresentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPresentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getIntegralScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getCouponId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getPrdKeepDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPresentDetail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getIconImgsImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getIconImgs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value2(Integer value) {
        setLotteryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value3(Byte value) {
        setLotteryGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value4(Byte value) {
        setChance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value5(Byte value) {
        setPresentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value6(Integer value) {
        setPresentNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value7(Integer value) {
        setIntegralScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value8(Byte value) {
        setCouponId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value9(Byte value) {
        setPrdId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value10(Byte value) {
        setPrdKeepDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value11(String value) {
        setPresentDetail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value12(String value) {
        setIconImgsImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord value13(String value) {
        setIconImgs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LotteryPrizeRecord values(Integer value1, Integer value2, Byte value3, Byte value4, Byte value5, Integer value6, Integer value7, Byte value8, Byte value9, Byte value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LotteryPrizeRecord
     */
    public LotteryPrizeRecord() {
        super(LotteryPrize.LOTTERY_PRIZE);
    }

    /**
     * Create a detached, initialised LotteryPrizeRecord
     */
    public LotteryPrizeRecord(Integer id, Integer lotteryId, Byte lotteryGrade, Byte chance, Byte presentType, Integer presentNumber, Integer integralScore, Byte couponId, Byte prdId, Byte prdKeepDays, String presentDetail, String iconImgsImage, String iconImgs) {
        super(LotteryPrize.LOTTERY_PRIZE);

        set(0, id);
        set(1, lotteryId);
        set(2, lotteryGrade);
        set(3, chance);
        set(4, presentType);
        set(5, presentNumber);
        set(6, integralScore);
        set(7, couponId);
        set(8, prdId);
        set(9, prdKeepDays);
        set(10, presentDetail);
        set(11, iconImgsImage);
        set(12, iconImgs);
    }
}
