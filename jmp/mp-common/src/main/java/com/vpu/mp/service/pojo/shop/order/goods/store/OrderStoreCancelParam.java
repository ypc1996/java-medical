package com.vpu.mp.service.pojo.shop.order.goods.store;

import lombok.Data;

/**
 * @author 李晓冰
 * @date 2020年09月09日
 */
@Data
public class OrderStoreCancelParam {
    private String shopSn;
    private String orderSn;
    private String memo;
}
