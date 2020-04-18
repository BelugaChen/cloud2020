package com.beluga.cloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/16 18:11.
 */
@Component
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444, "按客户自定义, global handlerException------1", new Payment(2020L, "serial03"));
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444, "按客户自定义, global handlerException2------2", new Payment(2020L, "serial03"));
    }
}
