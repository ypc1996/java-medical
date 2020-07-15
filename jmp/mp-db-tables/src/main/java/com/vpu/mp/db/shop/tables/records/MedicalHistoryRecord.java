/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.records;



import java.sql.Timestamp;

import javax.annotation.Generated;

import com.vpu.mp.db.shop.tables.MedicalHistory;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 病历表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MedicalHistoryRecord extends UpdatableRecordImpl<MedicalHistoryRecord> {

    private static final long serialVersionUID = 1879639873;

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.case_history_code</code>. 确定一个病历的编号
     */
    public void setCaseHistoryCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.case_history_code</code>. 确定一个病历的编号
     */
    public String getCaseHistoryCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.pos_code</code>. 确定一个医嘱的编号
     */
    public void setPosCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.pos_code</code>. 确定一个医嘱的编号
     */
    public String getPosCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.patient_id</code>. 患者id
     */
    public void setPatientId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.patient_id</code>. 患者id
     */
    public Integer getPatientId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.patient_name</code>. 患者名
     */
    public void setPatientName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.patient_name</code>. 患者名
     */
    public String getPatientName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.sex</code>. 0：男、1：女
     */
    public void setSex(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.sex</code>. 0：男、1：女
     */
    public Byte getSex() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.age</code>. 年龄
     */
    public void setAge(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.age</code>. 年龄
     */
    public Integer getAge() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.department_id</code>. 就诊科id
     */
    public void setDepartmentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.department_id</code>. 就诊科id
     */
    public Integer getDepartmentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.department_name</code>. 就诊科室(门诊)名称
     */
    public void setDepartmentName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.department_name</code>. 就诊科室(门诊)名称
     */
    public String getDepartmentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.out_patient_code</code>. 门诊号
     */
    public void setOutPatientCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.out_patient_code</code>. 门诊号
     */
    public String getOutPatientCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.allergy_history</code>. 过敏史
     */
    public void setAllergyHistory(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.allergy_history</code>. 过敏史
     */
    public String getAllergyHistory() {
        return (String) get(10);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.patient_complain</code>. 病人主诉
     */
    public void setPatientComplain(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.patient_complain</code>. 病人主诉
     */
    public String getPatientComplain() {
        return (String) get(11);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.disease_history</code>. 病史
     */
    public void setDiseaseHistory(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.disease_history</code>. 病史
     */
    public String getDiseaseHistory() {
        return (String) get(12);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.physical_examination</code>. 体格检查
     */
    public void setPhysicalExamination(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.physical_examination</code>. 体格检查
     */
    public String getPhysicalExamination() {
        return (String) get(13);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.auxiliary_physical_examination</code>. 辅助检查
     */
    public void setAuxiliaryPhysicalExamination(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.auxiliary_physical_examination</code>. 辅助检查
     */
    public String getAuxiliaryPhysicalExamination() {
        return (String) get(14);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.diagnosis_content</code>. 诊断
     */
    public void setDiagnosisContent(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.diagnosis_content</code>. 诊断
     */
    public String getDiagnosisContent() {
        return (String) get(15);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.diagnosis_suggestion</code>. 诊疗处理意见
     */
    public void setDiagnosisSuggestion(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.diagnosis_suggestion</code>. 诊疗处理意见
     */
    public String getDiagnosisSuggestion() {
        return (String) get(16);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.doctor_code</code>. 医师编码
     */
    public void setDoctorCode(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.doctor_code</code>. 医师编码
     */
    public String getDoctorCode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.doctor_name</code>. 医师姓名
     */
    public void setDoctorName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.doctor_name</code>. 医师姓名
     */
    public String getDoctorName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.visit_time</code>. 病人就诊时间
     */
    public void setVisitTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.visit_time</code>. 病人就诊时间
     */
    public Timestamp getVisitTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.is_delete</code>. 删除标记
     */
    public void setIsDelete(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.is_delete</code>. 删除标记
     */
    public Byte getIsDelete() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.create_time</code>. 生成时间
     */
    public void setCreateTime(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.create_time</code>. 生成时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>jmini_shop_224462.b2c_medical_history.update_time</code>. 最后修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>jmini_shop_224462.b2c_medical_history.update_time</code>. 最后修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(22);
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
     * Create a detached MedicalHistoryRecord
     */
    public MedicalHistoryRecord() {
        super(MedicalHistory.MEDICAL_HISTORY);
    }

    /**
     * Create a detached, initialised MedicalHistoryRecord
     */
    public MedicalHistoryRecord(Integer id, String caseHistoryCode, String posCode, Integer patientId, String patientName, Byte sex, Integer age, Integer departmentId, String departmentName, String outPatientCode, String allergyHistory, String patientComplain, String diseaseHistory, String physicalExamination, String auxiliaryPhysicalExamination, String diagnosisContent, String diagnosisSuggestion, String doctorCode, String doctorName, Timestamp visitTime, Byte isDelete, Timestamp createTime, Timestamp updateTime) {
        super(MedicalHistory.MEDICAL_HISTORY);

        set(0, id);
        set(1, caseHistoryCode);
        set(2, posCode);
        set(3, patientId);
        set(4, patientName);
        set(5, sex);
        set(6, age);
        set(7, departmentId);
        set(8, departmentName);
        set(9, outPatientCode);
        set(10, allergyHistory);
        set(11, patientComplain);
        set(12, diseaseHistory);
        set(13, physicalExamination);
        set(14, auxiliaryPhysicalExamination);
        set(15, diagnosisContent);
        set(16, diagnosisSuggestion);
        set(17, doctorCode);
        set(18, doctorName);
        set(19, visitTime);
        set(20, isDelete);
        set(21, createTime);
        set(22, updateTime);
    }
}
