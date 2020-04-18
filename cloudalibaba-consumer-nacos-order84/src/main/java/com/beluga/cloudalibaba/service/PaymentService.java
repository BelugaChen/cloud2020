package com.beluga.cloudalibaba.service;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/16 20:44.
 */
@Service
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    /**
     * PaymentSQL
     * @param id
     * @return
     */
    @GetMapping("/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
