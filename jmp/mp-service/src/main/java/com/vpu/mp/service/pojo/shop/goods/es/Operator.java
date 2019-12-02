package com.vpu.mp.service.pojo.shop.goods.es;

/**
 * 运算枚举
 * @author 卢光耀
 * @date 2019/11/6 10:26 上午
 *
*/
public enum Operator {
    /**
     * greater than
     */
    GT,
    /**
     * less than
     */
    LT,
    /**
     * greater than or equals
     */
    GTE,
    /**
     * less than or equals
     */
    LTE,
    /**
     * equals
     */
    EQ,
    /**
     * similar(fuzzy query)
     */
    SIM;
}
