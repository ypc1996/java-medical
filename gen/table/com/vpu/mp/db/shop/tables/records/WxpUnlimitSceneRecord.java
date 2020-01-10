/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.WxpUnlimitScene;

import java.sql.Timestamp;

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
public class WxpUnlimitSceneRecord extends UpdatableRecordImpl<WxpUnlimitSceneRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1657700471;

    /**
     * Setter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.scene_id</code>.
     */
    public void setSceneId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.scene_id</code>.
     */
    public Integer getSceneId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.scene_value</code>.
     */
    public void setSceneValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.scene_value</code>.
     */
    public String getSceneValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_wxp_unlimit_scene.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
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
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WxpUnlimitScene.WXP_UNLIMIT_SCENE.SCENE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WxpUnlimitScene.WXP_UNLIMIT_SCENE.SCENE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return WxpUnlimitScene.WXP_UNLIMIT_SCENE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return WxpUnlimitScene.WXP_UNLIMIT_SCENE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSceneValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSceneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSceneValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpUnlimitSceneRecord value1(Integer value) {
        setSceneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpUnlimitSceneRecord value2(String value) {
        setSceneValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpUnlimitSceneRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpUnlimitSceneRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WxpUnlimitSceneRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached WxpUnlimitSceneRecord
     */
    public WxpUnlimitSceneRecord() {
        super(WxpUnlimitScene.WXP_UNLIMIT_SCENE);
    }

    /**
     * Create a detached, initialised WxpUnlimitSceneRecord
     */
    public WxpUnlimitSceneRecord(Integer sceneId, String sceneValue, Timestamp createTime, Timestamp updateTime) {
        super(WxpUnlimitScene.WXP_UNLIMIT_SCENE);

        set(0, sceneId);
        set(1, sceneValue);
        set(2, createTime);
        set(3, updateTime);
    }
}
