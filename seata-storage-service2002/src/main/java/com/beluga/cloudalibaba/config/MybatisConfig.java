package com.beluga.cloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 18:25.
 */
@Configuration
@MapperScan({"com.beluga.cloudalibaba.dao"})
public class MybatisConfig {
}
