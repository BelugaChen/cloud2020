package com.beluga.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/5.
 */
@Configuration
public class ApplicationContextConfig {

    /**
     *     @LoadBalanced 用自己的负载均衡算法时, 注释掉.
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
