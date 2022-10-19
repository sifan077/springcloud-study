package com.sifan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {

    @GetMapping("doLogin")
    public String doLogin(String name, String pwd) {
        System.out.println(name + "===" + pwd);
        return UUID.randomUUID().toString();
    }
}
