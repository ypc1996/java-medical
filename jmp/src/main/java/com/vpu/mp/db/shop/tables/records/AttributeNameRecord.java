/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.AttributeName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AttributeNameRecord extends UpdatableRecordImpl<AttributeNameRecord> implements Record6<Integer, Byte, Byte, String, Integer, Byte> {

    private static final long serialVersionUID = -216089499;

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.attr_name_id</code>.
     */
    public void setAttrNameId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.attr_name_id</code>.
     */
    public Integer getAttrNameId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.attr_type</code>. 0下拉选择，1文本输入
     */
    public void setAttrType(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.attr_type</code>. 0下拉选择，1文本输入
     */
    public Byte getAttrType() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.for_search</code>. 1用于搜索
     */
    public void setForSearch(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.for_search</code>. 1用于搜索
     */
    public Byte getForSearch() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.attr_name</code>. 属性名
     */
    public void setAttrName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.attr_name</code>. 属性名
     */
    public String getAttrName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.attr_id</code>.
     */
    public void setAttrId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.attr_id</code>.
     */
    public Integer getAttrId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_1.b2c_attribute_name.is_del</code>.
     */
    public void setIsDel(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_1.b2c_attribute_name.is_del</code>.
     */
    public Byte getIsDel() {
        return (Byte) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Byte, Byte, String, Integer, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Byte, Byte, String, Integer, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AttributeName.ATTRIBUTE_NAME.ATTR_NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return AttributeName.ATTRIBUTE_NAME.ATTR_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return AttributeName.ATTRIBUTE_NAME.FOR_SEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AttributeName.ATTRIBUTE_NAME.ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AttributeName.ATTRIBUTE_NAME.ATTR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return AttributeName.ATTRIBUTE_NAME.IS_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAttrNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component2() {
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getForSearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getAttrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAttrNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getForSearch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAttrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value1(Integer value) {
        setAttrNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value2(Byte value) {
        setAttrType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value3(Byte value) {
        setForSearch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value4(String value) {
        setAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value5(Integer value) {
        setAttrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord value6(Byte value) {
        setIsDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributeNameRecord values(Integer value1, Byte value2, Byte value3, String value4, Integer value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttributeNameRecord
     */
    public AttributeNameRecord() {
        super(AttributeName.ATTRIBUTE_NAME);
    }

    /**
     * Create a detached, initialised AttributeNameRecord
     */
    public AttributeNameRecord(Integer attrNameId, Byte attrType, Byte forSearch, String attrName, Integer attrId, Byte isDel) {
        super(AttributeName.ATTRIBUTE_NAME);

        set(0, attrNameId);
        set(1, attrType);
        set(2, forSearch);
        set(3, attrName);
        set(4, attrId);
        set(5, isDel);
    }
}
