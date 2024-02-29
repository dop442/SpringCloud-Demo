package com.zc.learn.shop.order.service;

import com.zc.learn.shop.bean.OrderParams;

public interface OrderService {

    /**
     * @Description 保存订单
     */
    void saveOrder(OrderParams orderParams);
}
