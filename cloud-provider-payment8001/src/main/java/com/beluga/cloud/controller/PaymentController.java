package com.beluga.cloud.controller;

import com.beluga.cloud.entities.CommonResult;
import com.beluga.cloud.entities.Payment;
import com.beluga.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String element : services){
            log.info("*************element: " + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "Hi, this is payment zipkin server fall back........";
    }
}
