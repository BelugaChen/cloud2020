package com.beluga.cloudalibaba.service.impl;

import com.beluga.cloudalibaba.dao.OrderDao;
import com.beluga.cloudalibaba.domain.Order;
import com.beluga.cloudalibaba.service.AccountService;
import com.beluga.cloudalibaba.service.OrderService;
import com.beluga.cloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 16:29.
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        // 1. 新建订单
        log.info("-------------------->  1.开始新建订单  <---------------------");
        orderDao.create(order);
        log.info("______________________>  创建结束  <_______________________");

        // 2. 扣减库存
        log.info("-------------> 2.订单微服务开始调用库存, 做扣减 <--------------");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("-------------> 订单微服务开始调用库存, 做扣减end <---------------------");

        // 3. 扣减账户
        log.info("-------------> 3.订单微服务开始调用账户,做扣减  <--------------");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("-------------> 订单微服务开始调用账户,做扣减end  <--------------");

        // 4. 修改订单状态, 从零到1, 1代表已经完成
        log.info("-----> 4.修改订单状态 <------------");
        orderDao.update(order.getUserId(), 0);
        log.info("-----> 4.修改订单状态END <------------");

        log.info("---------------------------> 下订单结束, O(∩_∩)O哈哈");
    }
}
