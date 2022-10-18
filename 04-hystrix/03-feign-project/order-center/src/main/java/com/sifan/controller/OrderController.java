/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 11:24
 * Describe:
 */

package com.sifan.controller;

import com.sifan.domain.Order;
import com.sifan.feign.UserOrderFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements UserOrderFeign {

    @Override
    public Order getOrderById(Integer userId) {
        System.out.println(userId);
        return new Order(userId, "青椒盖饭", 15.01);
    }
}
