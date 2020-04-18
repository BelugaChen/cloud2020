package com.beluga.cloudalibaba.controller;

import com.beluga.cloudalibaba.domain.CommonResult;
import com.beluga.cloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:36.
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功");
    }
}
