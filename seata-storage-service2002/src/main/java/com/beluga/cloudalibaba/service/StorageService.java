package com.beluga.cloudalibaba.service;

import org.springframework.stereotype.Service;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:33.
 */
@Service
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
