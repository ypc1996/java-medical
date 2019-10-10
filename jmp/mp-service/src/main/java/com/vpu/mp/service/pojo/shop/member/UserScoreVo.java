package com.vpu.mp.service.pojo.shop.member;

import java.sql.Timestamp;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author zhaojianqiang
 *
 *         2019年10月10日 上午10:36:26
 */
@Data
@ToString
public class UserScoreVo {
	private Integer id;
	private Integer userId;
	private Integer score;
	private Byte status;
	private String flowNo;
	private Integer usableScore;
	private String identityId;
	private Integer goodsId;
	private String orderSn;
	private Integer shopId;
	private String desc;
	private String remark;
	private Timestamp createTime;
	private Timestamp expireTime;
	private String adminUser;
	// 入参用
	private Boolean isFromCrm = false;
	private Boolean isFromOverdue = false;
	private Boolean isFromRefund=false;
	private Integer scoreDis;
}
