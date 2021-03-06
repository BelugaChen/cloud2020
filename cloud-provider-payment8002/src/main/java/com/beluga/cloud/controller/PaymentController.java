package com.beluga.cloud.controller;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import com.beluga.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/3.
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("当前的值: " + payment.getSerial());
        int result = paymentService.create(payment);
        log.info("********************PaymentController-> create() -> 插入结果： " + result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功,serverPort: " + serverPort, result);
        }else{
            return new CommonResult(404,"插入数据库失败,serverPort: " + serverPort, null);
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("********************PaymentController-> getPaymentById() -> 查询结果： " + payment);
        if(payment != null){
            return new CommonResult(200,"查询成功, serverPort: " + serverPort, payment);
        }else{
            return new CommonResult(404,"没有对应记录,serverPort: " + serverPort + ", 查询ID: " + id, null);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
