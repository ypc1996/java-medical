package com.vpu.jmd.service.shop.bo.marketcalendar;

import lombok.Data;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author zhaojianqiang
 * 2020年4月23日下午2:03:37
 */
@Data
public class MarketCalendarInfoVo {
	private String eventName;
	private Date eventTime;
	private String eventDesc;
	private List<MarketVo> actInfo;
	/** 更新时用的market_calendar表的id*/
	private Integer calendarId;
	/**是否有营销活动  true为有*/
	private boolean hasAct;
	private Byte source;
}
