/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/17
 * Time: 12:06
 * Describe:
 */

package com.sifan.conteoller;


import com.sifan.domain.Order;
import org.springframework.web.bind.annotation.*;

/**
 * url 传参  /doOrder/热干面/add/油条
 * get 传递一个参数
 * get 传递多个参数
 * post 传递一个对象 + 一个基本参数'
 * 除了get传参外 一定要加 注解
 */
@RestController
public class ParamController {

    @GetMapping("testUrl/{name}/and/{age}")
    public String testUrl(@PathVariable("name") String name, @PathVariable("age") String age) {
        return name + " is " + age + " years old";
    }

    @GetMapping("oneParam")
    public String oneParam(@RequestParam(required = false) String name) {
        return name;
    }

    @GetMapping("twoParam")
    public String twoParam(@RequestParam(required = false) String name, @RequestParam(required = true) Integer age) {
        return name + " is " + age + " years old";
    }

    @PostMapping("oneObj")
    public String oneObj(@RequestBody Order order) {
        return order.toString();
    }

    @PostMapping("oneObjOneParam")
    public String oneObjOneParam(@RequestBody Order order, @RequestParam("name") String name) {
        return order.toString() + "------------" + name;
    }


}
