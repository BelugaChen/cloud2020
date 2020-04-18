package com.beluga.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/8 17:13.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        // 定义为随机
        return new RandomRule();
    }
}
