package com.beluga.cloud.service.impl;

import com.beluga.cloud.dao.PaymentDao;
import com.beluga.cloud.entities.Payment;
import com.beluga.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/3.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 添加Payment
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     * 根据id获取记录
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
