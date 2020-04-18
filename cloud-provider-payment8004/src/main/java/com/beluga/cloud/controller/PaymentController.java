package com.beluga.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/7 17:58.
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentZk(){
        return "springCloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
