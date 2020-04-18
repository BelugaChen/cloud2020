package com.beluga.cloudalibaba.controller;

import com.beluga.cloudalibaba.domain.CommonResult;
import com.beluga.cloudalibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:56.
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money){

        /**
         * 超时模拟
         * try {
         *    TimeUnit.SECONDS.sleep(20);
         *  } catch (InterruptedException e) {
         *     e.printStackTrace();
         *  }
         */
        accountService.descrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功");
    }
}
