package com.beluga.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类：
 *  其中：@EnableDiscoveryClient, 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 * @author: 陈健Beluga.
 * @date: 2020/4/7 17:34.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
