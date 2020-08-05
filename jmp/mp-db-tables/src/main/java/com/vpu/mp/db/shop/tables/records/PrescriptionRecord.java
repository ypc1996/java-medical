/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;


import com.vpu.mp.db.shop.tables.Prescription;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 处方信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PrescriptionRecord extends UpdatableRecordImpl<PrescriptionRecord> {

    private static final long serialVersionUID = 1522126693;

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.prescription_code</code>. 处方号
     */
    public void setPrescriptionCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.prescription_code</code>. 处方号
     */
    public String getPrescriptionCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.pos_code</code>. 医嘱单号
     */
    public void setPosCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.pos_code</code>. 医嘱单号
     */
    public String getPosCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_treatment_code</code>. 患者就诊卡号
     */
    public void setPatientTreatmentCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_treatment_code</code>. 患者就诊卡号
     */
    public String getPatientTreatmentCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.identity_code</code>. 证件号码
     */
    public void setIdentityCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.identity_code</code>. 证件号码
     */
    public String getIdentityCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public void setIdentityType(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.identity_type</code>. 证件类型: 1：身份证 2：军人证 3：护照 4：社保卡
     */
    public Byte getIdentityType() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_name</code>. 患者名称
     */
    public void setPatientName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_name</code>. 患者名称
     */
    public String getPatientName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_age</code>. 患者年龄
     */
    public void setPatientAge(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_age</code>. 患者年龄
     */
    public Integer getPatientAge() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_sex</code>. 性别 0：男 1：女
     */
    public void setPatientSex(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_sex</code>. 性别 0：男 1：女
     */
    public Byte getPatientSex() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_disease_history</code>. 患者疾病史
     */
    public void setPatientDiseaseHistory(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_disease_history</code>. 患者疾病史
     */
    public String getPatientDiseaseHistory() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_allergy_history</code>. 患者过敏史
     */
    public void setPatientAllergyHistory(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_allergy_history</code>. 患者过敏史
     */
    public String getPatientAllergyHistory() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.register_hospital</code>. 注册医院
     */
    public void setRegisterHospital(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.register_hospital</code>. 注册医院
     */
    public String getRegisterHospital() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.department_code</code>. 科室编码
     */
    public void setDepartmentCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.department_code</code>. 科室编码
     */
    public String getDepartmentCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.department_name</code>. 科室名称
     */
    public void setDepartmentName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.department_name</code>. 科室名称
     */
    public String getDepartmentName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.doctor_code</code>. 诊断医师编码
     */
    public void setDoctorCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.doctor_code</code>. 诊断医师编码
     */
    public String getDoctorCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.doctor_name</code>. 诊断医师名称
     */
    public void setDoctorName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.doctor_name</code>. 诊断医师名称
     */
    public String getDoctorName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.diagnose_time</code>. 诊断时间
     */
    public void setDiagnoseTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.diagnose_time</code>. 诊断时间
     */
    public Timestamp getDiagnoseTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.pharmacist_name</code>. 药师名称
     */
    public void setPharmacistName(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.pharmacist_name</code>. 药师名称
     */
    public String getPharmacistName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.pharmacist_code</code>. 药师编码
     */
    public void setPharmacistCode(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.pharmacist_code</code>. 药师编码
     */
    public String getPharmacistCode() {
        return (String) get(20);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.diagnosis_name</code>. 诊断名称
     */
    public void setDiagnosisName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.diagnosis_name</code>. 诊断名称
     */
    public String getDiagnosisName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.diagnosis_detail</code>. 诊断详情
     */
    public void setDiagnosisDetail(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.diagnosis_detail</code>. 诊断详情
     */
    public String getDiagnosisDetail() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.doctor_advice</code>. 医嘱
     */
    public void setDoctorAdvice(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.doctor_advice</code>. 医嘱
     */
    public String getDoctorAdvice() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_complain</code>. 患者主诉
     */
    public void setPatientComplain(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_complain</code>. 患者主诉
     */
    public String getPatientComplain() {
        return (String) get(24);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.patient_sign</code>. 患者体征
     */
    public void setPatientSign(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.patient_sign</code>. 患者体征
     */
    public String getPatientSign() {
        return (String) get(25);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.source</code>. 处方来源 0系统内部创建 1医院拉取
     */
    public void setSource(Byte value) {
        set(26, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.source</code>. 处方来源 0系统内部创建 1医院拉取
     */
    public Byte getSource() {
        return (Byte) get(26);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.audit_Type</code>. 处方审核类型 '药品审核类型, 0不审核,1审核,2开方,3根据处方下单
     */
    public void setAuditType(Byte value) {
        set(27, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.audit_Type</code>. 处方审核类型 '药品审核类型, 0不审核,1审核,2开方,3根据处方下单
     */
    public Byte getAuditType() {
        return (Byte) get(27);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.status</code>. 处方审核状态 0待审核 1审核通过 2审核未通过
     */
    public void setStatus(Byte value) {
        set(28, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.status</code>. 处方审核状态 0待审核 1审核通过 2审核未通过
     */
    public Byte getStatus() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.status_memo</code>. 处方审核医师评价
     */
    public void setStatusMemo(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.status_memo</code>. 处方审核医师评价
     */
    public String getStatusMemo() {
        return (String) get(29);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.expire_type</code>. 处方有效期类型 0:未知（默认过期），1:永久有效，2:时间段内有效
     */
    public void setExpireType(Byte value) {
        set(30, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.expire_type</code>. 处方有效期类型 0:未知（默认过期），1:永久有效，2:时间段内有效
     */
    public Byte getExpireType() {
        return (Byte) get(30);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.prescription_create_time</code>. 开方时间
     */
    public void setPrescriptionCreateTime(Timestamp value) {
        set(31, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.prescription_create_time</code>. 开方时间
     */
    public Timestamp getPrescriptionCreateTime() {
        return (Timestamp) get(31);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.prescription_expire_time</code>. 处方过期时间
     */
    public void setPrescriptionExpireTime(Timestamp value) {
        set(32, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.prescription_expire_time</code>. 处方过期时间
     */
    public Timestamp getPrescriptionExpireTime() {
        return (Timestamp) get(32);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.is_delete</code>.
     */
    public void setIsDelete(Byte value) {
        set(33, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.is_delete</code>.
     */
    public Byte getIsDelete() {
        return (Byte) get(33);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.is_used</code>. 是否使用过 0未使用  1已使用 ，默认0
     */
    public void setIsUsed(Byte value) {
        set(34, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.is_used</code>. 是否使用过 0未使用  1已使用 ，默认0
     */
    public Byte getIsUsed() {
        return (Byte) get(34);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.is_valid</code>. 是否有效  0无效 1有效，默认1
     */
    public void setIsValid(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.is_valid</code>. 是否有效  0无效 1有效，默认1
     */
    public Byte getIsValid() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(36, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(36);
    }

    /**
     * Setter for <code>mini_shop_471752.b2c_prescription.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(37, value);
    }

    /**
     * Getter for <code>mini_shop_471752.b2c_prescription.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(37);
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
     * Create a detached PrescriptionRecord
     */
    public PrescriptionRecord() {
        super(Prescription.PRESCRIPTION);
    }

    /**
     * Create a detached, initialised PrescriptionRecord
     */
    public PrescriptionRecord(Integer id, String prescriptionCode, String posCode, Integer patientId, Integer userId, String patientTreatmentCode, String identityCode, Byte identityType, String patientName, Integer patientAge, Byte patientSex, String patientDiseaseHistory, String patientAllergyHistory, String registerHospital, String departmentCode, String departmentName, String doctorCode, String doctorName, Timestamp diagnoseTime, String pharmacistName, String pharmacistCode, String diagnosisName, String diagnosisDetail, String doctorAdvice, String patientComplain, String patientSign, Byte source, Byte auditType, Byte status, String statusMemo, Byte expireType, Timestamp prescriptionCreateTime, Timestamp prescriptionExpireTime, Byte isDelete, Byte isUsed, Byte isValid, Timestamp createTime, Timestamp updateTime) {
        super(Prescription.PRESCRIPTION);

        set(0, id);
        set(1, prescriptionCode);
        set(2, posCode);
        set(3, patientId);
        set(4, userId);
        set(5, patientTreatmentCode);
        set(6, identityCode);
        set(7, identityType);
        set(8, patientName);
        set(9, patientAge);
        set(10, patientSex);
        set(11, patientDiseaseHistory);
        set(12, patientAllergyHistory);
        set(13, registerHospital);
        set(14, departmentCode);
        set(15, departmentName);
        set(16, doctorCode);
        set(17, doctorName);
        set(18, diagnoseTime);
        set(19, pharmacistName);
        set(20, pharmacistCode);
        set(21, diagnosisName);
        set(22, diagnosisDetail);
        set(23, doctorAdvice);
        set(24, patientComplain);
        set(25, patientSign);
        set(26, source);
        set(27, auditType);
        set(28, status);
        set(29, statusMemo);
        set(30, expireType);
        set(31, prescriptionCreateTime);
        set(32, prescriptionExpireTime);
        set(33, isDelete);
        set(34, isUsed);
        set(35, isValid);
        set(36, createTime);
        set(37, updateTime);
    }
}
