/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.Store;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 门店信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> {

    private static final long serialVersionUID = 1579430456;

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_id</code>.
     */
    public void setStoreId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_name</code>. 门店名称
     */
    public void setStoreName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_name</code>. 门店名称
     */
    public String getStoreName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_code</code>. 门店编号
     */
    public void setStoreCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_code</code>. 门店编号
     */
    public String getStoreCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.manager</code>. 负责人
     */
    public void setManager(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.manager</code>. 负责人
     */
    public String getManager() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.mobile</code>. 联系电话
     */
    public void setMobile(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.mobile</code>. 联系电话
     */
    public String getMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_imgs</code>. 图片
     */
    public void setStoreImgs(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_imgs</code>. 图片
     */
    public String getStoreImgs() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.business_state</code>. 营业状态1:营业，0:关店
     */
    public void setBusinessState(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.business_state</code>. 营业状态1:营业，0:关店
     */
    public Byte getBusinessState() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.business_type</code>. 营业时间1：每天，0：工作日
     */
    public void setBusinessType(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.business_type</code>. 营业时间1：每天，0：工作日
     */
    public Byte getBusinessType() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.opening_time</code>. 开门时间
     */
    public void setOpeningTime(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.opening_time</code>. 开门时间
     */
    public String getOpeningTime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.close_time</code>. 打烊时间
     */
    public void setCloseTime(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.close_time</code>. 打烊时间
     */
    public String getCloseTime() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.province_code</code>. 省
     */
    public void setProvinceCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.province_code</code>. 省
     */
    public String getProvinceCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.city_code</code>. 市
     */
    public void setCityCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.city_code</code>. 市
     */
    public String getCityCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.district_code</code>. 区
     */
    public void setDistrictCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.district_code</code>. 区
     */
    public String getDistrictCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.latitude</code>. 纬度
     */
    public void setLatitude(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.latitude</code>. 纬度
     */
    public String getLatitude() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.longitude</code>. 经度
     */
    public void setLongitude(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.longitude</code>. 经度
     */
    public String getLongitude() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.address</code>. 详细地址
     */
    public void setAddress(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.address</code>. 详细地址
     */
    public String getAddress() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.group</code>. 分组
     */
    public void setGroup(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.group</code>. 分组
     */
    public Integer getGroup() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.service</code>. 服务
     */
    public void setService(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.service</code>. 服务
     */
    public String getService() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.content</code>. 介绍
     */
    public void setContent(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.content</code>. 介绍
     */
    public String getContent() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.pos_shop_id</code>. pos店铺id
     */
    public void setPosShopId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.pos_shop_id</code>. pos店铺id
     */
    public Integer getPosShopId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.auto_pick</code>. 设定自提
     */
    public void setAutoPick(Short value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.auto_pick</code>. 设定自提
     */
    public Short getAutoPick() {
        return (Short) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.del_flag</code>. 1为删除状态
     */
    public void setDelFlag(Byte value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.del_flag</code>. 1为删除状态
     */
    public Byte getDelFlag() {
        return (Byte) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.city_service</code>. 支持同城配送 1:支持
     */
    public void setCityService(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.city_service</code>. 支持同城配送 1:支持
     */
    public Byte getCityService() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.pick_time_action</code>. 自提取货时间类型
     */
    public void setPickTimeAction(Byte value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.pick_time_action</code>. 自提取货时间类型
     */
    public Byte getPickTimeAction() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.pick_time_detail</code>. 自提时间明细
     */
    public void setPickTimeDetail(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.pick_time_detail</code>. 自提时间明细
     */
    public String getPickTimeDetail() {
        return (String) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_express</code>. 门店配送 1支持
     */
    public void setStoreExpress(Byte value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_express</code>. 门店配送 1支持
     */
    public Byte getStoreExpress() {
        return (Byte) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_store.store_type</code>. 门店类型 0、普通门店 1、医院
     */
    public void setStoreType(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_store.store_type</code>. 门店类型 0、普通门店 1、医院
     */
    public Byte getStoreType() {
        return (Byte) get(28);
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
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(Integer storeId, String storeName, String storeCode, String manager, String mobile, String storeImgs, Byte businessState, Byte businessType, String openingTime, String closeTime, String provinceCode, String cityCode, String districtCode, String latitude, String longitude, String address, Integer group, String service, String content, Integer posShopId, Timestamp createTime, Timestamp updateTime, Short autoPick, Byte delFlag, Byte cityService, Byte pickTimeAction, String pickTimeDetail, Byte storeExpress, Byte storeType) {
        super(Store.STORE);

        set(0, storeId);
        set(1, storeName);
        set(2, storeCode);
        set(3, manager);
        set(4, mobile);
        set(5, storeImgs);
        set(6, businessState);
        set(7, businessType);
        set(8, openingTime);
        set(9, closeTime);
        set(10, provinceCode);
        set(11, cityCode);
        set(12, districtCode);
        set(13, latitude);
        set(14, longitude);
        set(15, address);
        set(16, group);
        set(17, service);
        set(18, content);
        set(19, posShopId);
        set(20, createTime);
        set(21, updateTime);
        set(22, autoPick);
        set(23, delFlag);
        set(24, cityService);
        set(25, pickTimeAction);
        set(26, pickTimeDetail);
        set(27, storeExpress);
        set(28, storeType);
    }
}
