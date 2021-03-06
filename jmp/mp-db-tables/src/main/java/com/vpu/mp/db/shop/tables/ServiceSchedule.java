/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.ServiceScheduleRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ServiceSchedule extends TableImpl<ServiceScheduleRecord> {

    private static final long serialVersionUID = -440633094;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_service_schedule</code>
     */
    public static final ServiceSchedule SERVICE_SCHEDULE = new ServiceSchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceScheduleRecord> getRecordType() {
        return ServiceScheduleRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.schedule_id</code>. 排班id
     */
    public final TableField<ServiceScheduleRecord, Byte> SCHEDULE_ID = createField("schedule_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "排班id");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.store_id</code>.
     */
    public final TableField<ServiceScheduleRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.schedule_name</code>. 排班名称
     */
    public final TableField<ServiceScheduleRecord, String> SCHEDULE_NAME = createField("schedule_name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "排班名称");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.begcreate_time</code>. 开始时间
     */
    public final TableField<ServiceScheduleRecord, String> BEGCREATE_TIME = createField("begcreate_time", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "开始时间");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.end_time</code>. 结束时间
     */
    public final TableField<ServiceScheduleRecord, String> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "结束时间");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.del_flag</code>. 0正常，1删除
     */
    public final TableField<ServiceScheduleRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0正常，1删除");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.create_time</code>.
     */
    public final TableField<ServiceScheduleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_service_schedule.update_time</code>. 最后修改时间
     */
    public final TableField<ServiceScheduleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_service_schedule</code> table reference
     */
    public ServiceSchedule() {
        this(DSL.name("b2c_service_schedule"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_schedule</code> table reference
     */
    public ServiceSchedule(String alias) {
        this(DSL.name(alias), SERVICE_SCHEDULE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_service_schedule</code> table reference
     */
    public ServiceSchedule(Name alias) {
        this(alias, SERVICE_SCHEDULE);
    }

    private ServiceSchedule(Name alias, Table<ServiceScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceSchedule(Name alias, Table<ServiceScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServiceSchedule(Table<O> child, ForeignKey<O, ServiceScheduleRecord> key) {
        super(child, key, SERVICE_SCHEDULE);
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
        return Arrays.<Index>asList(Indexes.SERVICE_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ServiceScheduleRecord, Byte> getIdentity() {
        return Keys.IDENTITY_SERVICE_SCHEDULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServiceScheduleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_SERVICE_SCHEDULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceScheduleRecord>>asList(Keys.KEY_B2C_SERVICE_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceSchedule as(String alias) {
        return new ServiceSchedule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceSchedule as(Name alias) {
        return new ServiceSchedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceSchedule rename(String name) {
        return new ServiceSchedule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceSchedule rename(Name name) {
        return new ServiceSchedule(name, null);
    }
}
