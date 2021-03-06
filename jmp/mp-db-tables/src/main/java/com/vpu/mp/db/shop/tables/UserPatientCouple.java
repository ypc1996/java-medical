/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UserPatientCoupleRecord;

import java.sql.Date;
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
 * 用户患者关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPatientCouple extends TableImpl<UserPatientCoupleRecord> {

    private static final long serialVersionUID = -742145685;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_user_patient_couple</code>
     */
    public static final UserPatientCouple USER_PATIENT_COUPLE = new UserPatientCouple();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPatientCoupleRecord> getRecordType() {
        return UserPatientCoupleRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.id</code>.
     */
    public final TableField<UserPatientCoupleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.user_id</code>. 用户id
     */
    public final TableField<UserPatientCoupleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.patient_id</code>. 患者id
     */
    public final TableField<UserPatientCoupleRecord, Integer> PATIENT_ID = createField("patient_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "患者id");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.is_fetch</code>. 是否拉取
     */
    public final TableField<UserPatientCoupleRecord, Byte> IS_FETCH = createField("is_fetch", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否拉取");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.is_default</code>.
     */
    public final TableField<UserPatientCoupleRecord, Byte> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.treatment_code</code>. 就诊卡号
     */
    public final TableField<UserPatientCoupleRecord, String> TREATMENT_CODE = createField("treatment_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "就诊卡号");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.insurance_card_code</code>. 医保卡号
     */
    public final TableField<UserPatientCoupleRecord, String> INSURANCE_CARD_CODE = createField("insurance_card_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "医保卡号");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.sex</code>. 性别 0：男 1：女 2：未知
     */
    public final TableField<UserPatientCoupleRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "性别 0：男 1：女 2：未知");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.birthday</code>. 出生年月
     */
    public final TableField<UserPatientCoupleRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "出生年月");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.disease_history</code>. 过往病史：null:未知，"":无，其他逗号隔开
     */
    public final TableField<UserPatientCoupleRecord, String> DISEASE_HISTORY = createField("disease_history", org.jooq.impl.SQLDataType.VARCHAR(64), this, "过往病史：null:未知，\"\":无，其他逗号隔开");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.allergy_history</code>. 过敏史:null:未知，"":无
     */
    public final TableField<UserPatientCoupleRecord, String> ALLERGY_HISTORY = createField("allergy_history", org.jooq.impl.SQLDataType.VARCHAR(64), this, "过敏史:null:未知，\"\":无");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.family_disease_history</code>. 家族病史：null:未知，"":无，其他逗号隔开
     */
    public final TableField<UserPatientCoupleRecord, String> FAMILY_DISEASE_HISTORY = createField("family_disease_history", org.jooq.impl.SQLDataType.VARCHAR(64), this, "家族病史：null:未知，\"\":无，其他逗号隔开");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.gestation_type</code>. 妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳
     */
    public final TableField<UserPatientCoupleRecord, Byte> GESTATION_TYPE = createField("gestation_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.kidney_function_ok</code>. 肾功能:0:未知，1：正常，2：异常
     */
    public final TableField<UserPatientCoupleRecord, Byte> KIDNEY_FUNCTION_OK = createField("kidney_function_ok", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "肾功能:0:未知，1：正常，2：异常");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.liver_function_ok</code>. 肝功能:0:未知，1：正常，2：异常
     */
    public final TableField<UserPatientCoupleRecord, Byte> LIVER_FUNCTION_OK = createField("liver_function_ok", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "肝功能:0:未知，1：正常，2：异常");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.remarks</code>. 介绍
     */
    public final TableField<UserPatientCoupleRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.CLOB, this, "介绍");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.is_delete</code>.
     */
    public final TableField<UserPatientCoupleRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.create_time</code>.
     */
    public final TableField<UserPatientCoupleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_user_patient_couple.update_time</code>. 最后修改时间
     */
    public final TableField<UserPatientCoupleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_user_patient_couple</code> table reference
     */
    public UserPatientCouple() {
        this(DSL.name("b2c_user_patient_couple"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_patient_couple</code> table reference
     */
    public UserPatientCouple(String alias) {
        this(DSL.name(alias), USER_PATIENT_COUPLE);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_user_patient_couple</code> table reference
     */
    public UserPatientCouple(Name alias) {
        this(alias, USER_PATIENT_COUPLE);
    }

    private UserPatientCouple(Name alias, Table<UserPatientCoupleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserPatientCouple(Name alias, Table<UserPatientCoupleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户患者关联表"));
    }

    public <O extends Record> UserPatientCouple(Table<O> child, ForeignKey<O, UserPatientCoupleRecord> key) {
        super(child, key, USER_PATIENT_COUPLE);
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
        return Arrays.<Index>asList(Indexes.USER_PATIENT_COUPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserPatientCoupleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_PATIENT_COUPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserPatientCoupleRecord> getPrimaryKey() {
        return Keys.KEY_B2C_USER_PATIENT_COUPLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserPatientCoupleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserPatientCoupleRecord>>asList(Keys.KEY_B2C_USER_PATIENT_COUPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCouple as(String alias) {
        return new UserPatientCouple(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCouple as(Name alias) {
        return new UserPatientCouple(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPatientCouple rename(String name) {
        return new UserPatientCouple(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPatientCouple rename(Name name) {
        return new UserPatientCouple(name, null);
    }
}
