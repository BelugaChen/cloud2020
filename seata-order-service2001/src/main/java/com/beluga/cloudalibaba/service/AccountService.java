package com.beluga.cloudalibaba.service;

import com.beluga.cloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 16:30.
 */
@Service
@FeignClient(value = "seata-account-service")
public interface AccountService {
    /**
     * 扣减库存
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money);
}
