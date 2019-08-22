package com.vpu.mp.service.pojo.shop.market.friendpromote;
import java.sql.Timestamp;

import lombok.Data;
/**
 * 好友助力活动列表
 * @author liangchen
 * @date 2019年8月7日
 */
@Data
public class FriendPromoteListParam {
	/* 未删除标识 */
	public static final int NOT_DELETE = 0;
	
	/* 领取状态 */
	public static final int RECIEVED = 2;
	
	/* 活动名称 */
	private String actName;
	
	/* 活动开始时间 */
	private Timestamp startTime;
	
	/* 活动结束时间 */
	private Timestamp endTime;
	
	/* 奖励类型：0赠送商品，1折扣商品，2赠送优惠券 */
	public static final int REWARDTYPE_DEFAULT_VALUE = -1; 
	private Integer rewardType = REWARDTYPE_DEFAULT_VALUE;
	
	/* 活动状态 0已停用，1进行中，2未开始，3已过期 */
	public static final int ALL = 0; 
	public static final int DOING = 1;
	public static final int TODO = 2;
	public static final int OUT_OF_DATE = 3;
	public static final int STOPPED = 4;
	
	private Integer actState = DOING;
	
	/* 分页信息 */
    private int currentPage;
    private int pageRows;
}
