package com.beluga.cloudalibaba.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:50.
 */
@Service
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void descrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
