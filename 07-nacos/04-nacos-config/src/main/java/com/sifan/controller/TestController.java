package com.sifan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${hero.name}")
    private String name;
    @Value("${hero.age}")
    private String age;
    @Value("${hero.address}")
    private String address;

    @GetMapping("hero")
    public String info() {
        return name + " " + age + " " + address;
    }
}
