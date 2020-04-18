package com.beluga.cloud.service;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/8 19:32.
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * OpenFeign测试
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * OpenFeign超时演示
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}
