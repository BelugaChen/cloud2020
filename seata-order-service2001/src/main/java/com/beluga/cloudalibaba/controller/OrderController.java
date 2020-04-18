package com.beluga.cloudalibaba.controller;

import com.beluga.cloudalibaba.domain.CommonResult;
import com.beluga.cloudalibaba.domain.Order;
import com.beluga.cloudalibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 18:23.
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
