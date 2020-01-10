/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.XcxCustomerPage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class XcxCustomerPageRecord extends UpdatableRecordImpl<XcxCustomerPageRecord> implements Record12<Integer, Integer, String, Byte, Byte, Byte, String, String, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1111194688;

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_id</code>.
     */
    public void setPageId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_id</code>.
     */
    public Integer getPageId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.shop_id</code>. 店铺id
     */
    public void setShopId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.shop_id</code>. 店铺id
     */
    public Integer getShopId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_name</code>.
     */
    public void setPageName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_name</code>.
     */
    public String getPageName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_type</code>. 是否为首页1为首页，0非首页
     */
    public void setPageType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_type</code>. 是否为首页1为首页，0非首页
     */
    public Byte getPageType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_enabled</code>. 是否可用
     */
    public void setPageEnabled(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_enabled</code>. 是否可用
     */
    public Byte getPageEnabled() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_tpl_type</code>. 模板类型:0自定义模板，1默认模板，2美女模板，3自定义首页
     */
    public void setPageTplType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_tpl_type</code>. 模板类型:0自定义模板，1默认模板，2美女模板，3自定义首页
     */
    public Byte getPageTplType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_content</code>. 页面内容，json格式存储
     */
    public void setPageContent(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_content</code>. 页面内容，json格式存储
     */
    public String getPageContent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_publish_content</code>. 正式页面内容，json格式存储
     */
    public void setPagePublishContent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_publish_content</code>. 正式页面内容，json格式存储
     */
    public String getPagePublishContent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.page_state</code>. 状态：0未发布，1已发布
     */
    public void setPageState(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.page_state</code>. 状态：0未发布，1已发布
     */
    public Byte getPageState() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.cat_id</code>. 页面分类id
     */
    public void setCatId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.cat_id</code>. 页面分类id
     */
    public Integer getCatId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_xcx_customer_page.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_xcx_customer_page.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Byte, Byte, Byte, String, String, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Byte, Byte, Byte, String, String, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_TPL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_PUBLISH_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.PAGE_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.CAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return XcxCustomerPage.XCX_CUSTOMER_PAGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPageId();
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
        return getPageName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getPageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getPageEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getPageTplType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPageContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPagePublishContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getPageState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPageId();
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
        return getPageName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getPageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getPageEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getPageTplType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPageContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPagePublishContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getPageState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value1(Integer value) {
        setPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value2(Integer value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value3(String value) {
        setPageName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value4(Byte value) {
        setPageType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value5(Byte value) {
        setPageEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value6(Byte value) {
        setPageTplType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value7(String value) {
        setPageContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value8(String value) {
        setPagePublishContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value9(Byte value) {
        setPageState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value10(Integer value) {
        setCatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XcxCustomerPageRecord values(Integer value1, Integer value2, String value3, Byte value4, Byte value5, Byte value6, String value7, String value8, Byte value9, Integer value10, Timestamp value11, Timestamp value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XcxCustomerPageRecord
     */
    public XcxCustomerPageRecord() {
        super(XcxCustomerPage.XCX_CUSTOMER_PAGE);
    }

    /**
     * Create a detached, initialised XcxCustomerPageRecord
     */
    public XcxCustomerPageRecord(Integer pageId, Integer shopId, String pageName, Byte pageType, Byte pageEnabled, Byte pageTplType, String pageContent, String pagePublishContent, Byte pageState, Integer catId, Timestamp createTime, Timestamp updateTime) {
        super(XcxCustomerPage.XCX_CUSTOMER_PAGE);

        set(0, pageId);
        set(1, shopId);
        set(2, pageName);
        set(3, pageType);
        set(4, pageEnabled);
        set(5, pageTplType);
        set(6, pageContent);
        set(7, pagePublishContent);
        set(8, pageState);
        set(9, catId);
        set(10, createTime);
        set(11, updateTime);
    }
}
