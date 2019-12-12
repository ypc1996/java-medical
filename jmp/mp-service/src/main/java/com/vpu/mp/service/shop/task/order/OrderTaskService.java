package com.vpu.mp.service.shop.task.order;

import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.shop.order.action.CloseService;
import com.vpu.mp.service.shop.order.action.FinishService;
import com.vpu.mp.service.shop.order.action.ReceiveService;
import com.vpu.mp.service.shop.task.ShopTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王帅
 * 订单定时任务
 */
@Service
public class OrderTaskService extends ShopBaseService {

    @Autowired
    private CloseService close;

    @Autowired
    private ReceiveService receive;

    @Autowired
    private FinishService finish;

    /**
     * 订单自动关闭
     */
    public void close(){
        logger().info("订单关闭定时任务start,shop:{}", getShopId());
        close.autoCloseOrders();
        //TODO 再写一个定时任务  后台定时关闭超时未领取商品
        logger().info("订单关闭定时任务end");
    }

    /**
     * 收货
     */
    public void receive(){
        logger().info("订单自动收货定时任务start,shop:{}", getShopId());
        receive.autoReceiveOrders();
        //TODO 换货自动收货
        //autoReceiveOrders
        logger().info("订单自动收货定时任务end");
    }

    /**
     * 自动完成订单
     */
    public void finish(){
        logger().info("订单自动完成定时任务start,shop:{}", getShopId());
        finish.autoFinishOrders();
        logger().info("订单自动完成定时任务end");
    }
}
