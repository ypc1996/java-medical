/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.PrescriptionItem;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 处方项目明细表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrescriptionItemRecord extends UpdatableRecordImpl<PrescriptionItemRecord> {

    private static final long serialVersionUID = 2000318471;

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.pos_code</code>. 确定一个医嘱的编号
     */
    public void setPosCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.pos_code</code>. 确定一个医嘱的编号
     */
    public String getPosCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.pos_detail_code</code>. 医嘱明细单号
     */
    public void setPosDetailCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.pos_detail_code</code>. 医嘱明细单号
     */
    public String getPosDetailCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.prescription_code</code>. 处方号外键
     */
    public void setPrescriptionCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.prescription_code</code>. 处方号外键
     */
    public String getPrescriptionCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.prescription_detail_code</code>. 处方项目明细号码（可根据此字段反查批次号）
     */
    public void setPrescriptionDetailCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.prescription_detail_code</code>. 处方项目明细号码（可根据此字段反查批次号）
     */
    public String getPrescriptionDetailCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_common_name</code>. 通用名
     */
    public void setGoodsCommonName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_common_name</code>. 通用名
     */
    public String getGoodsCommonName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_img</code>.
     */
    public void setGoodsImg(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_img</code>.
     */
    public String getGoodsImg() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_quality_ratio</code>. 规格系数，通用名和规格系数确定一个药品
     */
    public void setGoodsQualityRatio(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_quality_ratio</code>. 规格系数，通用名和规格系数确定一个药品
     */
    public String getGoodsQualityRatio() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.prd_id</code>. 产品id
     */
    public void setPrdId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.prd_id</code>. 产品id
     */
    public Integer getPrdId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.use_method</code>. 用法
     */
    public void setUseMethod(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.use_method</code>. 用法
     */
    public String getUseMethod() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.per_time_num</code>. 单次数量
     */
    public void setPerTimeNum(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.per_time_num</code>. 单次数量
     */
    public Double getPerTimeNum() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.per_time_unit</code>. 数量单位
     */
    public void setPerTimeUnit(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.per_time_unit</code>. 数量单位
     */
    public String getPerTimeUnit() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.per_time_dosage</code>. 单次剂量
     */
    public void setPerTimeDosage(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.per_time_dosage</code>. 单次剂量
     */
    public Double getPerTimeDosage() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.per_time_dosage_unit</code>. 剂量单位
     */
    public void setPerTimeDosageUnit(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.per_time_dosage_unit</code>. 剂量单位
     */
    public String getPerTimeDosageUnit() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.frequency</code>. 频次
     */
    public void setFrequency(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.frequency</code>. 频次
     */
    public Double getFrequency() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.drag_sum_num</code>. 总取药数量
     */
    public void setDragSumNum(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.drag_sum_num</code>. 总取药数量
     */
    public Double getDragSumNum() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.drag_sum_unit</code>. 总取药的单位
     */
    public void setDragSumUnit(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.drag_sum_unit</code>. 总取药的单位
     */
    public String getDragSumUnit() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_use_memo</code>. 药品使用方式说明
     */
    public void setGoodsUseMemo(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_use_memo</code>. 药品使用方式说明
     */
    public String getGoodsUseMemo() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_production_enterprise</code>. 生产企业
     */
    public void setGoodsProductionEnterprise(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_production_enterprise</code>. 生产企业
     */
    public String getGoodsProductionEnterprise() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.medicine_price</code>. 药品总价
     */
    public void setMedicinePrice(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.medicine_price</code>. 药品总价
     */
    public BigDecimal getMedicinePrice() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.goods_sharing_proportion</code>. 商品分成比例
     */
    public void setGoodsSharingProportion(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.goods_sharing_proportion</code>. 商品分成比例
     */
    public BigDecimal getGoodsSharingProportion() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.rebate_proportion</code>. 返利比例
     */
    public void setRebateProportion(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.rebate_proportion</code>. 返利比例
     */
    public BigDecimal getRebateProportion() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.total_rebate_money</code>. 返利金额
     */
    public void setTotalRebateMoney(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.total_rebate_money</code>. 返利金额
     */
    public BigDecimal getTotalRebateMoney() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription_item.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription_item.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(26);
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
     * Create a detached PrescriptionItemRecord
     */
    public PrescriptionItemRecord() {
        super(PrescriptionItem.PRESCRIPTION_ITEM);
    }

    /**
     * Create a detached, initialised PrescriptionItemRecord
     */
    public PrescriptionItemRecord(Integer id, String posCode, String posDetailCode, String prescriptionCode, String prescriptionDetailCode, Integer goodsId, String goodsCommonName, String goodsImg, String goodsQualityRatio, Integer prdId, String useMethod, Double perTimeNum, String perTimeUnit, Double perTimeDosage, String perTimeDosageUnit, Double frequency, Double dragSumNum, String dragSumUnit, String goodsUseMemo, String goodsProductionEnterprise, BigDecimal medicinePrice, BigDecimal goodsSharingProportion, BigDecimal rebateProportion, BigDecimal totalRebateMoney, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(PrescriptionItem.PRESCRIPTION_ITEM);

        set(0, id);
        set(1, posCode);
        set(2, posDetailCode);
        set(3, prescriptionCode);
        set(4, prescriptionDetailCode);
        set(5, goodsId);
        set(6, goodsCommonName);
        set(7, goodsImg);
        set(8, goodsQualityRatio);
        set(9, prdId);
        set(10, useMethod);
        set(11, perTimeNum);
        set(12, perTimeUnit);
        set(13, perTimeDosage);
        set(14, perTimeDosageUnit);
        set(15, frequency);
        set(16, dragSumNum);
        set(17, dragSumUnit);
        set(18, goodsUseMemo);
        set(19, goodsProductionEnterprise);
        set(20, medicinePrice);
        set(21, goodsSharingProportion);
        set(22, rebateProportion);
        set(23, totalRebateMoney);
        set(24, isDelete);
        set(25, createTime);
        set(26, updateTime);
    }
}
