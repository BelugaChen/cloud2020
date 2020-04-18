package com.beluga.cloud;

import com.beluga.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/5.
 *
 * @RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
