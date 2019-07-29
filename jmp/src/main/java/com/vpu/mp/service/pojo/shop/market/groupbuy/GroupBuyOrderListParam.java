package com.vpu.mp.service.pojo.shop.market.groupbuy;

import com.vpu.mp.service.foundation.util.Page;
import com.vpu.mp.service.pojo.shop.order.OrderListInfoVo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 孔德成
 * @date 2019/7/23 15:38
 */
@Data
public class GroupBuyOrderListParam   {


    private Page page;

    public String goodsName;
    public String orderSn;
    public Byte[] orderStatus;

    /**
     * 手机号
     */
    public String mobile;
    /** 收货人姓名 */
    public String consignee;
    /** 下单时间开始 */
    public Timestamp createTimeStart;
    /** 下单时间结束 */
    public Timestamp createTimeEnd;

    /** 国别、省、市、区 */
    public Integer countryCode;
    public Integer provinceCode;
    public Integer cityCode;
    public Integer districtCode;


}
