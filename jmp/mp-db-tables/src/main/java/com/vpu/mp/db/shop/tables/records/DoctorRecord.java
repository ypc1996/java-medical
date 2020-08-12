/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.Doctor;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 医师表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DoctorRecord extends UpdatableRecordImpl<DoctorRecord> {

    private static final long serialVersionUID = 361205310;

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.account_id</code>. 医师子账号id
     */
    public void setAccountId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.account_id</code>. 医师子账号id
     */
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.age</code>. 年龄
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.age</code>. 年龄
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.work_time</code>. 从业时间
     */
    public void setWorkTime(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.work_time</code>. 从业时间
     */
    public Integer getWorkTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.sex</code>. 0未知 1男 2 女
     */
    public void setSex(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.sex</code>. 0未知 1男 2 女
     */
    public Byte getSex() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.name</code>. 医师姓名
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.name</code>. 医师姓名
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.url</code>. 医师头像
     */
    public void setUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.url</code>. 医师头像
     */
    public String getUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.duty</code>. 聘任职务
     */
    public void setDuty(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.duty</code>. 聘任职务
     */
    public Byte getDuty() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.hospital_code</code>. 医师院内编号
     */
    public void setHospitalCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.hospital_code</code>. 医师院内编号
     */
    public String getHospitalCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.certificate_code</code>. 医师资格编码
     */
    public void setCertificateCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.certificate_code</code>. 医师资格编码
     */
    public String getCertificateCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.professional_code</code>. 医师职业编码
     */
    public void setProfessionalCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.professional_code</code>. 医师职业编码
     */
    public String getProfessionalCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.register_time</code>. 注册时间
     */
    public void setRegisterTime(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.register_time</code>. 注册时间
     */
    public Date getRegisterTime() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.register_hospital</code>. 注册医院
     */
    public void setRegisterHospital(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.register_hospital</code>. 注册医院
     */
    public String getRegisterHospital() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.mobile</code>. 手机号
     */
    public void setMobile(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.mobile</code>. 手机号
     */
    public String getMobile() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.title_id</code>. 职称id
     */
    public void setTitleId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.title_id</code>. 职称id
     */
    public Integer getTitleId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.consultation_price</code>. 问诊费用
     */
    public void setConsultationPrice(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.consultation_price</code>. 问诊费用
     */
    public Long getConsultationPrice() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.treat_disease</code>. 主治疾病
     */
    public void setTreatDisease(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.treat_disease</code>. 主治疾病
     */
    public String getTreatDisease() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.status</code>. 是否启用 1启用 0禁用
     */
    public void setStatus(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.status</code>. 是否启用 1启用 0禁用
     */
    public Byte getStatus() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.user_id</code>. 用户id，当前用户是否为医师
     */
    public void setUserId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.user_id</code>. 用户id，当前用户是否为医师
     */
    public Integer getUserId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.on_duty_time</code>. 上班时间
     */
    public void setOnDutyTime(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.on_duty_time</code>. 上班时间
     */
    public Timestamp getOnDutyTime() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.is_on_duty</code>. 是否上班
     */
    public void setIsOnDuty(Byte value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.is_on_duty</code>. 是否上班
     */
    public Byte getIsOnDuty() {
        return (Byte) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_doctor.can_consultation</code>. 是否接诊
     */
    public void setCanConsultation(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_doctor.can_consultation</code>. 是否接诊
     */
    public Byte getCanConsultation() {
        return (Byte) get(24);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DoctorRecord
     */
    public DoctorRecord() {
        super(Doctor.DOCTOR);
    }

    /**
     * Create a detached, initialised DoctorRecord
     */
    public DoctorRecord(Integer id, Integer accountId, Integer age, Integer workTime, Byte sex, String name, String url, Byte duty, String hospitalCode, String certificateCode, String professionalCode, Date registerTime, String registerHospital, String mobile, Integer titleId, Long consultationPrice, String treatDisease, Byte status, Integer userId, Byte isDelete, Timestamp createTime, Timestamp updateTime, Timestamp onDutyTime, Byte isOnDuty, Byte canConsultation) {
        super(Doctor.DOCTOR);

        set(0, id);
        set(1, accountId);
        set(2, age);
        set(3, workTime);
        set(4, sex);
        set(5, name);
        set(6, url);
        set(7, duty);
        set(8, hospitalCode);
        set(9, certificateCode);
        set(10, professionalCode);
        set(11, registerTime);
        set(12, registerHospital);
        set(13, mobile);
        set(14, titleId);
        set(15, consultationPrice);
        set(16, treatDisease);
        set(17, status);
        set(18, userId);
        set(19, isDelete);
        set(20, createTime);
        set(21, updateTime);
        set(22, onDutyTime);
        set(23, isOnDuty);
        set(24, canConsultation);
    }
}
