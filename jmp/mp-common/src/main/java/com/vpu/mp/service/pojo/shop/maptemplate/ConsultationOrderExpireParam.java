package com.vpu.mp.service.pojo.shop.maptemplate;

import com.sun.org.apache.regexp.internal.RE;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author chenjie
 * @date 2020年08月18日
 */
@Data
@Builder
public class ConsultationOrderExpireParam {
    public static final String STATUS = "医生24小时内未接诊，资金将原路退还。";
    public static final String REMARK = "您可以尝试向其他专家提问。";
    @Builder.Default
    private String consultationStatus=STATUS;
    @Builder.Default
    private String remark= REMARK;
    private List<Integer> userIds;
}
