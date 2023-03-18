package com.sifan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/aaa")
    public String get(){

        return "client-b-aaaa";
    }
    @GetMapping("/bbb")
    public String getb(){

        return "client-b-bbbb";
    }
}
