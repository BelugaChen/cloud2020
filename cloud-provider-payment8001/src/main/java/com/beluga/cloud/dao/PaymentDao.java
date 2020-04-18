package com.beluga.cloud.dao;

import com.beluga.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/3.
 */
@Mapper
public interface PaymentDao {
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
