/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.MpVisitPageRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class MpVisitPage extends TableImpl<MpVisitPageRecord> {

    private static final long serialVersionUID = 1458175013;

    /**
     * The reference instance of <code>jmini_shop_666666.b2c_mp_visit_page</code>
     */
    public static final MpVisitPage MP_VISIT_PAGE = new MpVisitPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpVisitPageRecord> getRecordType() {
        return MpVisitPageRecord.class;
    }

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.ref_date</code>. 时间，如："20170313"
     */
    public final TableField<MpVisitPageRecord, String> REF_DATE = createField("ref_date", org.jooq.impl.SQLDataType.CHAR(8).nullable(false), this, "时间，如：\"20170313\"");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_path</code>.
     */
    public final TableField<MpVisitPageRecord, String> PAGE_PATH = createField("page_path", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_visit_pv</code>. 访问次数
     */
    public final TableField<MpVisitPageRecord, Integer> PAGE_VISIT_PV = createField("page_visit_pv", org.jooq.impl.SQLDataType.INTEGER, this, "访问次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_visit_uv</code>. 访问人数
     */
    public final TableField<MpVisitPageRecord, Integer> PAGE_VISIT_UV = createField("page_visit_uv", org.jooq.impl.SQLDataType.INTEGER, this, "访问人数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_staytime_pv</code>. 人均停留时长 (浮点型，单位：秒)
     */
    public final TableField<MpVisitPageRecord, Double> PAGE_STAYTIME_PV = createField("page_staytime_pv", org.jooq.impl.SQLDataType.FLOAT, this, "人均停留时长 (浮点型，单位：秒)");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.entrypage_pv</code>. 进入页次数
     */
    public final TableField<MpVisitPageRecord, Integer> ENTRYPAGE_PV = createField("entrypage_pv", org.jooq.impl.SQLDataType.INTEGER, this, "进入页次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.exitpage_pv</code>. 退出页次数
     */
    public final TableField<MpVisitPageRecord, Integer> EXITPAGE_PV = createField("exitpage_pv", org.jooq.impl.SQLDataType.INTEGER, this, "退出页次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_share_pv</code>. 转发次数
     */
    public final TableField<MpVisitPageRecord, Integer> PAGE_SHARE_PV = createField("page_share_pv", org.jooq.impl.SQLDataType.INTEGER, this, "转发次数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.page_share_uv</code>. 转发人数
     */
    public final TableField<MpVisitPageRecord, Integer> PAGE_SHARE_UV = createField("page_share_uv", org.jooq.impl.SQLDataType.INTEGER, this, "转发人数");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.create_time</code>. 添加时间
     */
    public final TableField<MpVisitPageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "添加时间");

    /**
     * The column <code>jmini_shop_666666.b2c_mp_visit_page.id</code>.
     */
    public final TableField<MpVisitPageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * Create a <code>jmini_shop_666666.b2c_mp_visit_page</code> table reference
     */
    public MpVisitPage() {
        this(DSL.name("b2c_mp_visit_page"), null);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_visit_page</code> table reference
     */
    public MpVisitPage(String alias) {
        this(DSL.name(alias), MP_VISIT_PAGE);
    }

    /**
     * Create an aliased <code>jmini_shop_666666.b2c_mp_visit_page</code> table reference
     */
    public MpVisitPage(Name alias) {
        this(alias, MP_VISIT_PAGE);
    }

    private MpVisitPage(Name alias, Table<MpVisitPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpVisitPage(Name alias, Table<MpVisitPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpVisitPage(Table<O> child, ForeignKey<O, MpVisitPageRecord> key) {
        super(child, key, MP_VISIT_PAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MP_VISIT_PAGE_PAGE_PATH, Indexes.MP_VISIT_PAGE_PAGE_VISIT_PV, Indexes.MP_VISIT_PAGE_PRIMARY, Indexes.MP_VISIT_PAGE_REF_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpVisitPageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_VISIT_PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpVisitPageRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_VISIT_PAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpVisitPageRecord>> getKeys() {
        return Arrays.<UniqueKey<MpVisitPageRecord>>asList(Keys.KEY_B2C_MP_VISIT_PAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpVisitPage as(String alias) {
        return new MpVisitPage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpVisitPage as(Name alias) {
        return new MpVisitPage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpVisitPage rename(String name) {
        return new MpVisitPage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpVisitPage rename(Name name) {
        return new MpVisitPage(name, null);
    }
}
