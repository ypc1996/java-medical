package com.vpu.mp.service.pojo.shop.order.base;

import com.vpu.mp.service.pojo.shop.order.write.operate.OrderServiceCode;
/**
 * 
 * @author 王帅
 *
 */
public interface IOrderBase {
	/**
	 * 	返回该实现类对于的处理类
	 * @return
	 */
	OrderServiceCode getServiceCode();
}
