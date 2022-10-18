/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 11:39
 * Describe:
 */

package com.sifan.controller;

import com.sifan.domain.Order;
import com.sifan.feign.UserOrderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    public UserOrderFeign userOrderFeign;

    @GetMapping("find")
    public Order findOrder() {
        return userOrderFeign.getOrderById(1);
    }
}
