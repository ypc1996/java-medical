package com.vpu.mp.service.pojo.shop.config.trade;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author:liufei
 * @Date:2019/7/9
 * @Description:
 */
@Data
public class WxpayConfigParam {
    @NotBlank
    private String appId;
    @NotBlank
    private String payMchId;
    @NotBlank
    private String payKey;
    @NotBlank
    private String payCertContent;
    @NotBlank
    private String payKeyContent;
}
