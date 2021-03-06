/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.UserPatientCouple;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserPatientCoupleRecord extends UpdatableRecordImpl<UserPatientCoupleRecord> implements Record19<Integer, Integer, Integer, Byte, Byte, String, String, Byte, Date, String, String, String, Byte, Byte, Byte, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -239749505;

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.is_fetch</code>. 是否拉取
     */
    public void setIsFetch(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.is_fetch</code>. 是否拉取
     */
    public Byte getIsFetch() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.is_default</code>.
     */
    public void setIsDefault(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.is_default</code>.
     */
    public Byte getIsDefault() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.treatment_code</code>. 就诊卡号
     */
    public void setTreatmentCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.treatment_code</code>. 就诊卡号
     */
    public String getTreatmentCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.insurance_card_code</code>. 医保卡号
     */
    public void setInsuranceCardCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.insurance_card_code</code>. 医保卡号
     */
    public String getInsuranceCardCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.sex</code>. 性别 0：男 1：女 2：未知
     */
    public void setSex(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.sex</code>. 性别 0：男 1：女 2：未知
     */
    public Byte getSex() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.birthday</code>. 出生年月
     */
    public void setBirthday(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.birthday</code>. 出生年月
     */
    public Date getBirthday() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.disease_history</code>. 过往病史：null:未知，"":无，其他逗号隔开
     */
    public void setDiseaseHistory(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.disease_history</code>. 过往病史：null:未知，"":无，其他逗号隔开
     */
    public String getDiseaseHistory() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.allergy_history</code>. 过敏史:null:未知，"":无
     */
    public void setAllergyHistory(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.allergy_history</code>. 过敏史:null:未知，"":无
     */
    public String getAllergyHistory() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.family_disease_history</code>. 家族病史：null:未知，"":无，其他逗号隔开
     */
    public void setFamilyDiseaseHistory(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.family_disease_history</code>. 家族病史：null:未知，"":无，其他逗号隔开
     */
    public String getFamilyDiseaseHistory() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.gestation_type</code>. 妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳
     */
    public void setGestationType(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.gestation_type</code>. 妊娠哺乳状态:0:未知，1：无，2：备孕中，3：怀孕中，4：正在哺乳
     */
    public Byte getGestationType() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.kidney_function_ok</code>. 肾功能:0:未知，1：正常，2：异常
     */
    public void setKidneyFunctionOk(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.kidney_function_ok</code>. 肾功能:0:未知，1：正常，2：异常
     */
    public Byte getKidneyFunctionOk() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.liver_function_ok</code>. 肝功能:0:未知，1：正常，2：异常
     */
    public void setLiverFunctionOk(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.liver_function_ok</code>. 肝功能:0:未知，1：正常，2：异常
     */
    public Byte getLiverFunctionOk() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.remarks</code>. 介绍
     */
    public void setRemarks(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.remarks</code>. 介绍
     */
    public String getRemarks() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_user_patient_couple.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_user_patient_couple.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Byte, Byte, String, String, Byte, Date, String, String, String, Byte, Byte, Byte, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, Integer, Integer, Byte, Byte, String, String, Byte, Date, String, String, String, Byte, Byte, Byte, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserPatientCouple.USER_PATIENT_COUPLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserPatientCouple.USER_PATIENT_COUPLE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserPatientCouple.USER_PATIENT_COUPLE.PATIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UserPatientCouple.USER_PATIENT_COUPLE.IS_FETCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return UserPatientCouple.USER_PATIENT_COUPLE.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserPatientCouple.USER_PATIENT_COUPLE.TREATMENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserPatientCouple.USER_PATIENT_COUPLE.INSURANCE_CARD_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return UserPatientCouple.USER_PATIENT_COUPLE.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return UserPatientCouple.USER_PATIENT_COUPLE.BIRTHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UserPatientCouple.USER_PATIENT_COUPLE.DISEASE_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UserPatientCouple.USER_PATIENT_COUPLE.ALLERGY_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UserPatientCouple.USER_PATIENT_COUPLE.FAMILY_DISEASE_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return UserPatientCouple.USER_PATIENT_COUPLE.GESTATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return UserPatientCouple.USER_PATIENT_COUPLE.KIDNEY_FUNCTION_OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return UserPatientCouple.USER_PATIENT_COUPLE.LIVER_FUNCTION_OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return UserPatientCouple.USER_PATIENT_COUPLE.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field17() {
        return UserPatientCouple.USER_PATIENT_COUPLE.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return UserPatientCouple.USER_PATIENT_COUPLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return UserPatientCouple.USER_PATIENT_COUPLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTreatmentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInsuranceCardCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component9() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDiseaseHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAllergyHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getFamilyDiseaseHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getGestationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getKidneyFunctionOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getLiverFunctionOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component17() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPatientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTreatmentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInsuranceCardCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDiseaseHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAllergyHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFamilyDiseaseHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getGestationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getKidneyFunctionOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getLiverFunctionOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value17() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value3(Integer value) {
        setPatientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value4(Byte value) {
        setIsFetch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value5(Byte value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value6(String value) {
        setTreatmentCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value7(String value) {
        setInsuranceCardCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value8(Byte value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value9(Date value) {
        setBirthday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value10(String value) {
        setDiseaseHistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value11(String value) {
        setAllergyHistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value12(String value) {
        setFamilyDiseaseHistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value13(Byte value) {
        setGestationType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value14(Byte value) {
        setKidneyFunctionOk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value15(Byte value) {
        setLiverFunctionOk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value16(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value17(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord value19(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPatientCoupleRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Byte value5, String value6, String value7, Byte value8, Date value9, String value10, String value11, String value12, Byte value13, Byte value14, Byte value15, String value16, Byte value17, Timestamp value18, Timestamp value19) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPatientCoupleRecord
     */
    public UserPatientCoupleRecord() {
        super(UserPatientCouple.USER_PATIENT_COUPLE);
    }

    /**
     * Create a detached, initialised UserPatientCoupleRecord
     */
    public UserPatientCoupleRecord(Integer id, Integer userId, Integer patientId, Byte isFetch, Byte isDefault, String treatmentCode, String insuranceCardCode, Byte sex, Date birthday, String diseaseHistory, String allergyHistory, String familyDiseaseHistory, Byte gestationType, Byte kidneyFunctionOk, Byte liverFunctionOk, String remarks, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(UserPatientCouple.USER_PATIENT_COUPLE);

        set(0, id);
        set(1, userId);
        set(2, patientId);
        set(3, isFetch);
        set(4, isDefault);
        set(5, treatmentCode);
        set(6, insuranceCardCode);
        set(7, sex);
        set(8, birthday);
        set(9, diseaseHistory);
        set(10, allergyHistory);
        set(11, familyDiseaseHistory);
        set(12, gestationType);
        set(13, kidneyFunctionOk);
        set(14, liverFunctionOk);
        set(15, remarks);
        set(16, isDelete);
        set(17, createTime);
        set(18, updateTime);
    }
}
