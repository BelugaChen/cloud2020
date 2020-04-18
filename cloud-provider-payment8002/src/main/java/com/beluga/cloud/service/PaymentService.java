package com.beluga.cloud.service;

import com.beluga.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/3.
 */
@Service
public interface PaymentService {

    /**
     * 添加记录
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 获取记录
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
