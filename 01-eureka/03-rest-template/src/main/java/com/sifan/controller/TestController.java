/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/16
 * Time: 12:34
 * Describe:
 */

package com.sifan.controller;

import com.sifan.domaim.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("testGet")
    public String testGet(String name) {
        System.out.println(name);
        return "ok";
    }


    /**
     * 接收 json 参数
     *
     * @param user
     * @return
     */
    @PostMapping("testPost1")
    public String testPost1(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    /**
     * 接收表单参数
     *
     * @param user
     * @return
     */
    @PostMapping("testPost2")
    public String testPost2(User user) {
        System.out.println(user);
        return "ok";
    }
}
