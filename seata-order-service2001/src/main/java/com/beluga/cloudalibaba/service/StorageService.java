package com.beluga.cloudalibaba.service;

import com.beluga.cloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 16:30.
 */
@Service
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
