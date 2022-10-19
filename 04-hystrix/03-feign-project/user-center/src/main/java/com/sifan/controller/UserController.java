package com.sifan.controller;

import com.sifan.domain.Order;
import com.sifan.feign.UserOrderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户控制器
 *
 * @author 思凡
 * @date 2022/10/19
 */
@RestController
public class UserController {

    @Resource
    public UserOrderFeign userOrderFeign;

    @GetMapping("find")
    public Order findOrder() {
        return userOrderFeign.getOrderById(1);
    }
}
