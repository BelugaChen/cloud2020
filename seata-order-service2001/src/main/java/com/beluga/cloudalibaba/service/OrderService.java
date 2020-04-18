package com.beluga.cloudalibaba.service;

import com.beluga.cloudalibaba.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 16:28.
 */
@Service
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
