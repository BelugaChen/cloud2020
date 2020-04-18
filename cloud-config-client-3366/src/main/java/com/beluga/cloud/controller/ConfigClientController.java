package com.beluga.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/10 18:52.
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String get_ConfigInfo(){
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
    }
}
