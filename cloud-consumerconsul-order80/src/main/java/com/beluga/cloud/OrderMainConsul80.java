package com.beluga.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/8 15:58.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul80.class, args);
    }
}
