package com.beluga.cloud.controller;

import com.beluga.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/9 14:50.
 */
@RestController
@Slf4j
public class PaymentHystrixController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/normal/{id}")
    public String paymentInfo_Normal(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_Normal(id);
        log.info("***********result: " + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("***********result: " + result);
        return result;
    }

    /**
     * ======服务熔断
     */
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("**********result: " + result);
        return result;
    }
}
