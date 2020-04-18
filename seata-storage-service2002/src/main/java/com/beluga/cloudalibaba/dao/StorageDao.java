package com.beluga.cloudalibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:11.
 */
@Repository
@Mapper
public interface StorageDao {

    /**
     *  扣减库存信息
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
