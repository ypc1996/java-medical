package com.vpu.mp.service.pojo.shop.market.seckill;

import com.vpu.mp.service.pojo.shop.config.ShopShareConfig;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: 王兵兵
 * @create: 2019-08-06 14:29
 **/
@Data
public class SeckillUpdateParam {
    /**
     * 活动的主键
     */
    @NotNull
    @Min(1)
    private Integer skId;

    /**
     *  状态：1可用，0停用
     */
    private Byte status;

    /** 活动名称*/
    private String name;

    /** 专属会员卡，卡ID字符串，逗号分隔；为空时代表该活动所有人都可以参与*/
    private String cardId;

    /** 分享设置*/
    private ShopShareConfig shareConfig;
}
