package com.sifan.fegin;


import com.sifan.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("testUrl/{name}/and/{age}")
    String testUrl(@PathVariable("name") String name, @PathVariable("age") String age);

    @GetMapping("oneParam")
    String oneParam(@RequestParam(required = false) String name);

    @GetMapping("twoParam")
    String twoParam(@RequestParam(required = false) String name, @RequestParam(required = true) Integer age);

    @PostMapping("oneObj")
    String oneObj(@RequestBody Order order);

    @PostMapping("oneObjOneParam")
    String oneObjOneParam(@RequestBody Order order, @RequestParam("name") String name);
}
