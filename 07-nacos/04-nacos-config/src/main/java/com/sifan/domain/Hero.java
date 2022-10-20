package com.sifan.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope // 给这个类 添加上一个刷新的作用域
@Component
public class Hero {
    @Value("${hero.name}")
    private String name;
    @Value("${hero.age}")
    private String age;
    @Value("${hero.address}")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
