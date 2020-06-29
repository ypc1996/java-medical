package com.vpu.jmd.service.config.bo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * @author liangchen
 * @date 2019年8月8日
 */
@Data
public class DeliverTemplateConfig {

	/**
	 *  0：统一运费，1：满额包邮，
	 */
	public Integer templateName;

	/**
	 * 包邮限制最低金额
	 */
	public BigDecimal feeLimit;

	/**
	 * 运费
	 */
	public BigDecimal price;


}
