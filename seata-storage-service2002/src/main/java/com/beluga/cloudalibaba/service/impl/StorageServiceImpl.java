package com.beluga.cloudalibaba.service.impl;

import com.beluga.cloudalibaba.dao.StorageDao;
import com.beluga.cloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:33.
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("->>>>>>>>>>>>>>>>>. storage-service中扣减库存开始 ");
        storageDao.decrease(productId, count);
        log.info("->>>>>>>>>>>>>>>>>. storage-service中扣减库存结束 ");
    }
}
