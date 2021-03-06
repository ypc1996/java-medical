package com.vpu.mp.service.pojo.shop.member.card;

import com.vpu.mp.common.foundation.data.JsonResultCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author zhaojianqiang
 * @time   下午4:57:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardInsertVo {
	private JsonResultCode code;
	private Integer batchId;
}
