package com.beluga.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/11 16:11.
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProviderMain8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamProviderMain8801.class, args);
    }
}
