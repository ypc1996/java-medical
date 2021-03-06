package com.vpu.mp.service.pojo.shop.config.group;


import static com.vpu.mp.db.main.tables.ShopChildRole.SHOP_CHILD_ROLE;
import static com.vpu.mp.db.main.tables.ShopRole.SHOP_ROLE;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 子账户管理返回店铺信息
 * 
 * @author zhaojianqiang
 *
 */
@Data
@NoArgsConstructor
public class ShopChildUserShopInfoVo {
	private Integer shopId;
	private String shopName;
	private Integer roleId;
	private String roleName;
	private Integer recId;
}
