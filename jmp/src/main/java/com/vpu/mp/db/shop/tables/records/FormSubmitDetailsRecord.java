/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.FormSubmitDetails;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class FormSubmitDetailsRecord extends UpdatableRecordImpl<FormSubmitDetailsRecord> implements Record9<Integer, Integer, Integer, Integer, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = -2101998345;

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.rec_id</code>.
     */
    public void setRecId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.rec_id</code>.
     */
    public Integer getRecId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.page_id</code>.
     */
    public void setPageId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.page_id</code>.
     */
    public Integer getPageId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.submit_id</code>. 表单提交ID，对应b2c_form_submit_list的submit_id
     */
    public void setSubmitId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.submit_id</code>. 表单提交ID，对应b2c_form_submit_list的submit_id
     */
    public Integer getSubmitId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.module_name</code>. 模块名称
     */
    public void setModuleName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.module_name</code>. 模块名称
     */
    public String getModuleName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.module_type</code>. 模块类型
     */
    public void setModuleType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.module_type</code>. 模块类型
     */
    public String getModuleType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.module_value</code>. 模块的值
     */
    public void setModuleValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.module_value</code>. 模块的值
     */
    public String getModuleValue() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.create_time</code>. 提交时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.create_time</code>. 提交时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_form_submit_details.cur_idx</code>. 装修模块保存id
     */
    public void setCurIdx(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_form_submit_details.cur_idx</code>. 装修模块保存id
     */
    public String getCurIdx() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, String, String, String, Timestamp, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, String, String, String, Timestamp, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.REC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.SUBMIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.MODULE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.MODULE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.MODULE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FormSubmitDetails.FORM_SUBMIT_DETAILS.CUR_IDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSubmitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getModuleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getModuleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getModuleValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCurIdx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSubmitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModuleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModuleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getModuleValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurIdx();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value1(Integer value) {
        setRecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value2(Integer value) {
        setPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value3(Integer value) {
        setSubmitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value5(String value) {
        setModuleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value6(String value) {
        setModuleType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value7(String value) {
        setModuleValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord value9(String value) {
        setCurIdx(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FormSubmitDetailsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, Timestamp value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FormSubmitDetailsRecord
     */
    public FormSubmitDetailsRecord() {
        super(FormSubmitDetails.FORM_SUBMIT_DETAILS);
    }

    /**
     * Create a detached, initialised FormSubmitDetailsRecord
     */
    public FormSubmitDetailsRecord(Integer recId, Integer pageId, Integer submitId, Integer userId, String moduleName, String moduleType, String moduleValue, Timestamp createTime, String curIdx) {
        super(FormSubmitDetails.FORM_SUBMIT_DETAILS);

        set(0, recId);
        set(1, pageId);
        set(2, submitId);
        set(3, userId);
        set(4, moduleName);
        set(5, moduleType);
        set(6, moduleValue);
        set(7, createTime);
        set(8, curIdx);
    }
}
