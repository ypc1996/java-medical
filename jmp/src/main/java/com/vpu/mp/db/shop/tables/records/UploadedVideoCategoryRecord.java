/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.UploadedVideoCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class UploadedVideoCategoryRecord extends UpdatableRecordImpl<UploadedVideoCategoryRecord> implements Record8<Integer, Integer, String, Integer, Timestamp, String, Byte, Integer> {

    private static final long serialVersionUID = 765920609;

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_id</code>.
     */
    public void setVideoCatId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_id</code>.
     */
    public Integer getVideoCatId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_name</code>.
     */
    public void setVideoCatName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_name</code>.
     */
    public String getVideoCatName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_parent_id</code>.
     */
    public void setVideoCatParentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.video_cat_parent_id</code>.
     */
    public Integer getVideoCatParentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.cat_ids</code>. 层级ID串,逗号分隔
     */
    public void setCatIds(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.cat_ids</code>. 层级ID串,逗号分隔
     */
    public String getCatIds() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.level</code>. 层级，0开始
     */
    public void setLevel(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.level</code>. 层级，0开始
     */
    public Byte getLevel() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_uploaded_video_category.sort</code>. 排序优先级
     */
    public void setSort(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_uploaded_video_category.sort</code>. 排序优先级
     */
    public Integer getSort() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, Timestamp, String, Byte, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, Timestamp, String, Byte, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.VIDEO_CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.VIDEO_CAT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.VIDEO_CAT_PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.CAT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getVideoCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVideoCatName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getVideoCatParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCatIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVideoCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVideoCatName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVideoCatParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCatIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value1(Integer value) {
        setVideoCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value3(String value) {
        setVideoCatName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value4(Integer value) {
        setVideoCatParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value6(String value) {
        setCatIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value7(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord value8(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideoCategoryRecord values(Integer value1, Integer value2, String value3, Integer value4, Timestamp value5, String value6, Byte value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UploadedVideoCategoryRecord
     */
    public UploadedVideoCategoryRecord() {
        super(UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY);
    }

    /**
     * Create a detached, initialised UploadedVideoCategoryRecord
     */
    public UploadedVideoCategoryRecord(Integer videoCatId, Integer shopId, String videoCatName, Integer videoCatParentId, Timestamp createTime, String catIds, Byte level, Integer sort) {
        super(UploadedVideoCategory.UPLOADED_VIDEO_CATEGORY);

        set(0, videoCatId);
        set(1, shopId);
        set(2, videoCatName);
        set(3, videoCatParentId);
        set(4, createTime);
        set(5, catIds);
        set(6, level);
        set(7, sort);
    }
}
