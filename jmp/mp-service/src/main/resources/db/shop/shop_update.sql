/***********************2.7********************BEGIN*/
--  修改用户持有优惠券表结构
ALTER TABLE `b2c_customer_avail_coupons` MODIFY `limit_order_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '满多少可用';

-- 更正错误备注
ALTER TABLE `b2c_member_card` MODIFY COLUMN `store_use_switch` tinyint(1) NOT NULL DEFAULT 0 COMMENT '可否在门店使用  0不可以 1可以' AFTER `is_exchang`;
/***********************2.7*********************END*/


/***********************2.8********************BEGIN*/

/***********************2.8*********************END*/
