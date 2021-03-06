/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.GoodsImg;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class GoodsImgRecord extends UpdatableRecordImpl<GoodsImgRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = -1579850293;

    /**
     * Setter for <code>mini_main.b2c_goods_img.img_id</code>.
     */
    public void setImgId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_goods_img.img_id</code>.
     */
    public Integer getImgId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_goods_img.goods_id</code>.
     */
    public void setGoodsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_goods_img.goods_id</code>.
     */
    public Integer getGoodsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_goods_img.img_url</code>.
     */
    public void setImgUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_goods_img.img_url</code>.
     */
    public String getImgUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_goods_img.img_desc</code>.
     */
    public void setImgDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_goods_img.img_desc</code>.
     */
    public String getImgDesc() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GoodsImg.GOODS_IMG.IMG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GoodsImg.GOODS_IMG.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GoodsImg.GOODS_IMG.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GoodsImg.GOODS_IMG.IMG_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getImgId();
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
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImgDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getImgId();
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
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImgDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value1(Integer value) {
        setImgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value2(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value3(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord value4(String value) {
        setImgDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsImgRecord values(Integer value1, Integer value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GoodsImgRecord
     */
    public GoodsImgRecord() {
        super(GoodsImg.GOODS_IMG);
    }

    /**
     * Create a detached, initialised GoodsImgRecord
     */
    public GoodsImgRecord(Integer imgId, Integer goodsId, String imgUrl, String imgDesc) {
        super(GoodsImg.GOODS_IMG);

        set(0, imgId);
        set(1, goodsId);
        set(2, imgUrl);
        set(3, imgDesc);
    }
}
