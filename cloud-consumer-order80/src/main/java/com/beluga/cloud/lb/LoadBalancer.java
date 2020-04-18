package com.beluga.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/8 17:47.
 */
@Component
public interface LoadBalancer {
    /**
     * 得到机器总数
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
