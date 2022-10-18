/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 11:22
 * Describe:
 */

package com.sifan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApp.class);
    }
}
