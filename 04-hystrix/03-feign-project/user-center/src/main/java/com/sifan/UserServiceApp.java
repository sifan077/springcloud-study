/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 11:36
 * Describe:
 */

package com.sifan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class);
    }
}
