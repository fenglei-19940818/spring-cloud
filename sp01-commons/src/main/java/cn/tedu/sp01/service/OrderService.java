package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/30 10:37
 */
public interface OrderService {

    /**
     * 根据订单编号获取订单
     *
     * @param orderId
     * @return
     */
    Order getOrder(String orderId);

    /**
     * 添加订单,保存订单
     *
     * @param order
     */
    void addOrder(Order order);

}
