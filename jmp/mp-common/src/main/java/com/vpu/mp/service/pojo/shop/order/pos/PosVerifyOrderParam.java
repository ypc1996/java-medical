package com.vpu.mp.service.pojo.shop.order.pos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * pos核销订单
 *
 * @author 王帅
 * @date 2020年04月29日
 */
@Data
@AllArgsConstructor
public class PosVerifyOrderParam {
    @JsonProperty("order_sn")
    private String orderSn;
    @JsonProperty("order_status")
    private Byte orderStatus;
}
