package com.vpu.mp.service.pojo.wxapp.share;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 分享小程序图片-入参
 * @author 李晓冰
 * @date 2020年01月03日
 */
@Data
public class GoodsShareBaseParam {
    /** 活动Id */
    private Integer activityId;
    /** 活动分享图片中需要显示的拼团价格 */
    private BigDecimal realPrice;
    /** 活动分享图片中需要显示的划线价格 */
    private BigDecimal linePrice;
    /** 发起分享操作的用户Id*/
    private Integer userId;
}