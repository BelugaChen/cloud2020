package com.beluga.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/7 18:21.
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class OrderMainZk80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainZk80.class, args);
    }
}
