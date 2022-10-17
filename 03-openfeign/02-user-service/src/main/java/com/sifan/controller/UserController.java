/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/17
 * Time: 11:38
 * Describe:
 */

package com.sifan.controller;

import com.sifan.domain.Order;
import com.sifan.fegin.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    /**
     * 接口是不能做事的，如果做事
     * 必须要有对象
     * 接口肯定是背创建出代理对象的
     * 动态代理 jdk(java interface 接口 $Proxy) cglib (子类)
     */
    @Autowired
    private UserOrderFeign userOrderFeign;

    @GetMapping("userDoOrder")
    public String userDoOrder() {
        System.out.println("用户进来了");
        // 发起远程调用
        return userOrderFeign.doOrder();
    }

    @GetMapping("testParam")
    public String testParam() {
        String testUrl = userOrderFeign.testUrl("思凡", "18");
        System.out.println("testUrl = " + testUrl);
        String oneParam = userOrderFeign.oneParam("神荼");
        System.out.println("oneParam = " + oneParam);
        String twoParam = userOrderFeign.twoParam("思凡", 18);
        System.out.println("twoParam = " + twoParam);
//        String oneObj = userOrderFeign.oneObj(new Order(3, "神荼", 4300.21, new Date()));
        // builder的用法
        String oneObj = userOrderFeign.oneObj(Order
                .builder()
                .id(3)
                .name("神荼")
                .price(4300.01)
                .time(new Date())
                .build());
        System.out.println("oneObj = " + oneObj);
        String oneObjOneParam = userOrderFeign.oneObjOneParam(new Order(3, "神荼", 4300.21, new Date()), "贪婪");
        System.out.println("oneObjOneParam = " + oneObjOneParam);
        return "测试完成";
    }

}
