package com.sifan.fegin;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @FeignClient(value = "order-service")
 * value 就是提供服务的应用名称
 */
@FeignClient(value = "order-service")
public interface UserOrderFeign {
    /**
     * 需要调用哪个controller,就用它的方法签名
     * 方法签名 包括一个方法的全部属性
     * @return String
     */
    @GetMapping("doOrder")
    String doOrder();
}
