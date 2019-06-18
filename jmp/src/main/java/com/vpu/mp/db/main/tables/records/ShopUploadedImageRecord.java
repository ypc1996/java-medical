/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.ShopUploadedImage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class ShopUploadedImageRecord extends UpdatableRecordImpl<ShopUploadedImageRecord> implements Record15<UInteger, String, UInteger, String, String, String, String, Integer, Integer, Integer, Byte, Timestamp, Integer, Integer, Byte> {

    private static final long serialVersionUID = -574363556;

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_id</code>.
     */
    public void setImgId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_id</code>.
     */
    public UInteger getImgId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_type</code>.
     */
    public void setImgType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_type</code>.
     */
    public String getImgType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_size</code>.
     */
    public void setImgSize(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_size</code>.
     */
    public UInteger getImgSize() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_name</code>. 图片名称，用于前端显示
     */
    public void setImgName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_name</code>. 图片名称，用于前端显示
     */
    public String getImgName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_orig_fname</code>.
     */
    public void setImgOrigFname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_orig_fname</code>.
     */
    public String getImgOrigFname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_path</code>.
     */
    public void setImgPath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_path</code>.
     */
    public String getImgPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_url</code>.
     */
    public void setImgUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_url</code>.
     */
    public String getImgUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_cat_id</code>. 图片分类
     */
    public void setImgCatId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_cat_id</code>. 图片分类
     */
    public Integer getImgCatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_width</code>.
     */
    public void setImgWidth(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_width</code>.
     */
    public Integer getImgWidth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.img_height</code>.
     */
    public void setImgHeight(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.img_height</code>.
     */
    public Integer getImgHeight() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.is_refer</code>. 是否引用
     */
    public void setIsRefer(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.is_refer</code>. 是否引用
     */
    public Byte getIsRefer() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.upload_time</code>.
     */
    public void setUploadTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.upload_time</code>.
     */
    public Timestamp getUploadTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.sys_id</code>. 账户ID
     */
    public void setSysId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.sys_id</code>. 账户ID
     */
    public Integer getSysId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.shop_id</code>. 店铺ID
     */
    public void setShopId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.shop_id</code>. 店铺ID
     */
    public Integer getShopId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>mini_main.b2c_shop_uploaded_image.del_flag</code>.
     */
    public void setDelFlag(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_main.b2c_shop_uploaded_image.del_flag</code>.
     */
    public Byte getDelFlag() {
        return (Byte) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<UInteger, String, UInteger, String, String, String, String, Integer, Integer, Integer, Byte, Timestamp, Integer, Integer, Byte> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<UInteger, String, UInteger, String, String, String, String, Integer, Integer, Integer, Byte, Timestamp, Integer, Integer, Byte> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_ORIG_FNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IMG_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.IS_REFER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.UPLOAD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return ShopUploadedImage.SHOP_UPLOADED_IMAGE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getImgType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getImgSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getImgOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getImgCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getImgWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getImgHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUploadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getImgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getImgType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getImgSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getImgOrigFname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImgPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getImgCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getImgWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getImgHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsRefer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUploadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value1(UInteger value) {
        setImgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value2(String value) {
        setImgType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value3(UInteger value) {
        setImgSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value4(String value) {
        setImgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value5(String value) {
        setImgOrigFname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value6(String value) {
        setImgPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value7(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value8(Integer value) {
        setImgCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value9(Integer value) {
        setImgWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value10(Integer value) {
        setImgHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value11(Byte value) {
        setIsRefer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value12(Timestamp value) {
        setUploadTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value13(Integer value) {
        setSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value14(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord value15(Byte value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopUploadedImageRecord values(UInteger value1, String value2, UInteger value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9, Integer value10, Byte value11, Timestamp value12, Integer value13, Integer value14, Byte value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopUploadedImageRecord
     */
    public ShopUploadedImageRecord() {
        super(ShopUploadedImage.SHOP_UPLOADED_IMAGE);
    }

    /**
     * Create a detached, initialised ShopUploadedImageRecord
     */
    public ShopUploadedImageRecord(UInteger imgId, String imgType, UInteger imgSize, String imgName, String imgOrigFname, String imgPath, String imgUrl, Integer imgCatId, Integer imgWidth, Integer imgHeight, Byte isRefer, Timestamp uploadTime, Integer sysId, Integer shopId, Byte delFlag) {
        super(ShopUploadedImage.SHOP_UPLOADED_IMAGE);

        set(0, imgId);
        set(1, imgType);
        set(2, imgSize);
        set(3, imgName);
        set(4, imgOrigFname);
        set(5, imgPath);
        set(6, imgUrl);
        set(7, imgCatId);
        set(8, imgWidth);
        set(9, imgHeight);
        set(10, isRefer);
        set(11, uploadTime);
        set(12, sysId);
        set(13, shopId);
        set(14, delFlag);
    }
}
