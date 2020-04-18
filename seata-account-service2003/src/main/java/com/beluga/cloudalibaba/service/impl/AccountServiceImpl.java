package com.beluga.cloudalibaba.service.impl;

import com.beluga.cloudalibaba.dao.AccountDao;
import com.beluga.cloudalibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:53.
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void descrease(Long userId, BigDecimal money) {
        log.info("->>>>>>>>>>>>>>>>>>>>. account-service中扣减账户余额开始  ");
        accountDao.decrease(userId, money);
        log.info("->>>>>>>>>>>>>>>>>>>>. account-service中扣减账户余额结束  ");
    }
}
