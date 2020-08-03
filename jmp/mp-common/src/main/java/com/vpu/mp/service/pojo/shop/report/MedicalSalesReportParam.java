package com.vpu.mp.service.pojo.shop.report;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 销售报表
 * @author 孔德成
 * @date 2020/7/31 14:59
 */
@Data
public class MedicalSalesReportParam {

    /**
     * 开始时间
     */
    private Timestamp startTime;
    /**
     * 结束时间
     */
    private Timestamp endTime;
}
