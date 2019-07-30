package com.vpu.mp.service.pojo.shop.market.bargain;

import java.sql.Timestamp;

import lombok.Data;

/**
 * @author 王兵兵
 *
 * 2019年7月24日
 */
@Data
public class BargainPageListQueryVo {

	/**
	 * 砍价活动主键 
	 */
	private int id;
	
	private String bargainName;
	
	/**
	 * 砍价类型0定人1任意价
	 */
	private byte bargainType;
	
	private Timestamp startTime;
	private Timestamp endTime;
	
	/**
	 * 停用启用的状态：1可用，0停用 
	 */
	private byte status;
	
	private String goodsName;
	/**
	 * 商品库存 
	 */
	private int goodsNumber;
	/**
	 * 砍价活动库存 
	 */
	private int stock;
	/**
	 * 成功数量 
	 */
	private int successNumber;
	/**
	 * 发起砍价人数 
	 */
	private int bargainUserNumber;
}
