/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/16
 * Time: 15:24
 * Describe:
 */

package com.sifan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello() {
        return "我是提供者aaaaaaa的接口";
    }
}
