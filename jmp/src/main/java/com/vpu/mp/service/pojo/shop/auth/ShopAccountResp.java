package com.vpu.mp.service.pojo.shop.auth;

import java.util.List;

import com.vpu.mp.service.foundation.Page;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShopAccountResp {

	public List<?> dataList;
	public Page page;
	

}
