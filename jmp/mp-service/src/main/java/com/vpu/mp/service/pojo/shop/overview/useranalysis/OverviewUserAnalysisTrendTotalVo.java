package com.vpu.mp.service.pojo.shop.overview.useranalysis;

import lombok.Data;

import java.util.List;

/**
 * 客户概况及趋势
 * @author liangchen
 * @date 2019年11月4日
 */
@Data
public class OverviewUserAnalysisTrendTotalVo {
    /** 最近N天每天的数据 */
	List<OverviewUserAnalysisTrendVo> trendVo;

	/** 总访问量 */
	private Integer loginDataTotal;
    /** 总用户数 */
	private Integer userDataTotal;
    /** 总成交用户数 */
	private Integer orderUserDataTotal;

    /** 访问量变化率 */
	private Double loginDataRate;
    /** 用户数变化率 */
	private Double userDataRate;
    /** 成交用户数变化率 */
	private Double orderUserDataRate;
	
}
