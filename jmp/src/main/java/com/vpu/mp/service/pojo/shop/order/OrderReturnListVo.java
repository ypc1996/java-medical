package com.vpu.mp.service.pojo.shop.order;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author wangshuai
 */
@Getter
@Setter
public class OrderReturnListVo extends OrderListInfoVo {
	private String returnOrderSn;
	private Timestamp applyTime;
	private BigDecimal money;
	private Byte returnType;
	private Byte refundStatus;
	private String reason;
}
