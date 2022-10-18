package com.sifan.feign;

import com.sifan.feign.hystrix.CustomerRentFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * 在这里指定熔断后执行的类
 */
@FeignClient(value = "rent-car-service", fallback = CustomerRentFeignHystrix.class)
public interface CustomerRentFeign {
    @GetMapping("rent")
    String rent();
}
