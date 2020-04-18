package com.beluga.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/9 16:56.
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Normal(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_Normal, /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut, O(∩_∩)O";
    }
}
