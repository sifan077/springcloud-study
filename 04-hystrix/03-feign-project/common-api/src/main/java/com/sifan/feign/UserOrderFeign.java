package com.sifan.feign;

import com.sifan.domain.Order;
import com.sifan.feign.hystrix.UserOrderFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service", fallback = UserOrderFeignHystrix.class)
public interface UserOrderFeign {
    // 查询订单
    @GetMapping("/order/getOrderById")
    Order getOrderById(@RequestParam Integer userId);
}
