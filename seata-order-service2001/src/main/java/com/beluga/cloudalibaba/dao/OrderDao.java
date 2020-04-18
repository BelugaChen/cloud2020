package com.beluga.cloudalibaba.dao;

import com.beluga.cloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 16:00.
 */
@Mapper
public interface OrderDao {

    /**
     * 1.创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 2.修改订单状态: 从零到1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
