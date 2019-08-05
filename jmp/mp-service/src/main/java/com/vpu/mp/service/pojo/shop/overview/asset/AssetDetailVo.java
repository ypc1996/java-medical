package com.vpu.mp.service.pojo.shop.overview.asset;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author liufei
 * @date 2019/8/5
 * @description
 */
@Data
public class AssetDetailVo {
    private Timestamp tradeTime;
    private BigDecimal tradeNum;
    private Integer userId;
    private Byte tradeType;
    private Byte tradeFlow;
    private Byte tradeStatus;
    private String tradeSn;
    private String username;
}
