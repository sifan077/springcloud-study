package com.sifan.controller;

import com.sifan.domain.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    private Hero hero;

    @GetMapping("hero")
    public String info() {
        return hero.getName() + " " + hero.getAge() + " " + hero.getAddress();
    }
}
