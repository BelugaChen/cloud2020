package com.beluga.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/9 19:11.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain9001.class, args);
    }
}
