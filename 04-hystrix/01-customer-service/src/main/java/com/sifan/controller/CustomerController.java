/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 9:44
 * Describe:
 */

package com.sifan.controller;

import com.sifan.feign.CustomerRentFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    private CustomerRentFeign customerRentFeign;


    @GetMapping("customerRent")
    public String customerRent() {
        return "我要租车  " + customerRentFeign.rent();
    }
}
