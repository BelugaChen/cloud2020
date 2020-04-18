package com.beluga.cloudalibaba.service;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/16 20:46.
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,----PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
