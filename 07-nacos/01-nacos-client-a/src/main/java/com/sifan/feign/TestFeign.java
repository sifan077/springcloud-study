package com.sifan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-service")
public interface TestFeign {
    @GetMapping("info")
    String info();
}
