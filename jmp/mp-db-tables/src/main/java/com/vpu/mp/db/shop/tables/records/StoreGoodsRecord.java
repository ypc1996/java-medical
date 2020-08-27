/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.StoreGoods;
import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record4;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 门店商品管理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreGoodsRecord extends UpdatableRecordImpl<StoreGoodsRecord> implements Record16<Integer, Integer, String, String, String, String, Integer, String, Integer, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, Byte> {

    private static final long serialVersionUID = 88143322;

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.store_id</code>.
     */
    public void setStoreId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.goods_id</code>.
     */
    public void setGoodsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.goods_id</code>.
     */
    public Integer getGoodsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.goods_common_name</code>.
     */
    public void setGoodsCommonName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.goods_common_name</code>.
     */
    public String getGoodsCommonName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.goods_quality_ratio</code>.
     */
    public void setGoodsQualityRatio(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.goods_quality_ratio</code>.
     */
    public String getGoodsQualityRatio() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.goods_approval_number</code>.
     */
    public void setGoodsApprovalNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.goods_approval_number</code>.
     */
    public String getGoodsApprovalNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.goods_production_enterprise</code>.
     */
    public void setGoodsProductionEnterprise(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.goods_production_enterprise</code>.
     */
    public String getGoodsProductionEnterprise() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.prd_id</code>.
     */
    public void setPrdId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.prd_id</code>.
     */
    public Integer getPrdId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.prd_sn</code>.
     */
    public void setPrdSn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.prd_sn</code>.
     */
    public String getPrdSn() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.product_number</code>. 库存
     */
    public void setProductNumber(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.product_number</code>. 库存
     */
    public Integer getProductNumber() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.product_price</code>. 价格
     */
    public void setProductPrice(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.product_price</code>. 价格
     */
    public BigDecimal getProductPrice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.is_sync</code>. 是否已同步
     */
    public void setIsSync(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.is_sync</code>. 是否已同步
     */
    public Byte getIsSync() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.is_on_sale</code>. '是否在售，1在售，0下架'
     */
    public void setIsOnSale(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.is_on_sale</code>. '是否在售，1在售，0下架'
     */
    public Byte getIsOnSale() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.flag</code>. 1:初始化数据，0:无效数据
     */
    public void setFlag(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.flag</code>. 1:初始化数据，0:无效数据
     */
    public Byte getFlag() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store_goods.is_delete</code>. 是否删 0否 1是
     */
    public void setIsDelete(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store_goods.is_delete</code>. 是否删 0否 1是
     */
    public Byte getIsDelete() {
        return (Byte) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<Integer, Integer, Integer, Byte> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, String, String, String, String, Integer, String, Integer, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, Byte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, String, String, String, String, Integer, String, Integer, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, Byte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StoreGoods.STORE_GOODS.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StoreGoods.STORE_GOODS.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StoreGoods.STORE_GOODS.GOODS_COMMON_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return StoreGoods.STORE_GOODS.GOODS_QUALITY_RATIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return StoreGoods.STORE_GOODS.GOODS_APPROVAL_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StoreGoods.STORE_GOODS.GOODS_PRODUCTION_ENTERPRISE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StoreGoods.STORE_GOODS.PRD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return StoreGoods.STORE_GOODS.PRD_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return StoreGoods.STORE_GOODS.PRODUCT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return StoreGoods.STORE_GOODS.PRODUCT_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return StoreGoods.STORE_GOODS.IS_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return StoreGoods.STORE_GOODS.IS_ON_SALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return StoreGoods.STORE_GOODS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return StoreGoods.STORE_GOODS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return StoreGoods.STORE_GOODS.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return StoreGoods.STORE_GOODS.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGoodsCommonName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGoodsQualityRatio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGoodsApprovalNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGoodsProductionEnterprise();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPrdSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getProductNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getProductPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getIsOnSale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGoodsCommonName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGoodsQualityRatio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGoodsApprovalNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGoodsProductionEnterprise();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPrdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPrdSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getProductNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getProductPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsOnSale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value1(Integer value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value2(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value3(String value) {
        setGoodsCommonName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value4(String value) {
        setGoodsQualityRatio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value5(String value) {
        setGoodsApprovalNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value6(String value) {
        setGoodsProductionEnterprise(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value7(Integer value) {
        setPrdId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value8(String value) {
        setPrdSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value9(Integer value) {
        setProductNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value10(BigDecimal value) {
        setProductPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value11(Byte value) {
        setIsSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value12(Byte value) {
        setIsOnSale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value15(Byte value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord value16(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreGoodsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Integer value7, String value8, Integer value9, BigDecimal value10, Byte value11, Byte value12, Timestamp value13, Timestamp value14, Byte value15, Byte value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreGoodsRecord
     */
    public StoreGoodsRecord() {
        super(StoreGoods.STORE_GOODS);
    }

    /**
     * Create a detached, initialised StoreGoodsRecord
     */
    public StoreGoodsRecord(Integer storeId, Integer goodsId, String goodsCommonName, String goodsQualityRatio, String goodsApprovalNumber, String goodsProductionEnterprise, Integer prdId, String prdSn, Integer productNumber, BigDecimal productPrice, Byte isSync, Byte isOnSale, Timestamp createTime, Timestamp updateTime, Byte flag, Byte isDelete) {
        super(StoreGoods.STORE_GOODS);

        set(0, storeId);
        set(1, goodsId);
        set(2, goodsCommonName);
        set(3, goodsQualityRatio);
        set(4, goodsApprovalNumber);
        set(5, goodsProductionEnterprise);
        set(6, prdId);
        set(7, prdSn);
        set(8, productNumber);
        set(9, productPrice);
        set(10, isSync);
        set(11, isOnSale);
        set(12, createTime);
        set(13, updateTime);
        set(14, flag);
        set(15, isDelete);
    }
}
