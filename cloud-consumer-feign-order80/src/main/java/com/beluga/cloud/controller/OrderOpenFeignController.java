package com.beluga.cloud.controller;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import com.beluga.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/8 19:37.
 */
@RestController
@Slf4j
public class OrderOpenFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> commonResult = paymentFeignService.getPaymentById(id);
        return commonResult;
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        // openfeign-ribbon: 客户端默认等待1秒钟
        String result = paymentFeignService.paymentFeignTimeout();
        return result;
    }
}
