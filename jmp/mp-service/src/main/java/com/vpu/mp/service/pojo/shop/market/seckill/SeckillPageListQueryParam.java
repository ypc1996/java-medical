package com.vpu.mp.service.pojo.shop.market.seckill;

import com.vpu.mp.service.foundation.util.Page;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author 王兵兵
 *
 * 2019年7月24日
 */
@Data
public class SeckillPageListQueryParam {
	
	/**
	 *    活动状态过滤 ：0全部，1进行中，2未开始，3已过期，4已停用 
	 */
	@Max(4)
	@Min(0)
	private Byte state = (byte)1;
	
	/**
     * 	分页信息
     */
    private Integer currentPage = Page.DEFAULT_CURRENT_PAGE;
    private Integer pageRows = Page.DEFAULT_PAGE_ROWS;
}
