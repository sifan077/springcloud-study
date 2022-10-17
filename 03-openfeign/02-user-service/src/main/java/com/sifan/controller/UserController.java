/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/17
 * Time: 11:38
 * Describe:
 */

package com.sifan.controller;

import com.sifan.fegin.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserOrderFeign userOrderFeign;

    @GetMapping("userDoOrder")
    public String userDoOrder() {
        System.out.println("用户进来了");
        // 发起远程调用
        return userOrderFeign.doOrder();
    }

}
