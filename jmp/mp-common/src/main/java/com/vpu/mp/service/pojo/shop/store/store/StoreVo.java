package com.vpu.mp.service.pojo.shop.store.store;

import com.vpu.mp.common.foundation.util.PageResult;

import lombok.Data;

/**
 * 门店列表出参（新增可创建门店数量）
 * @author liangchne
 * @date 2020.03.31
 */
@Data
public class StoreVo {
    private String shopVersion;
    private Integer canCreateNum;
    private PageResult<StorePageListVo> storePageListVo;
}
