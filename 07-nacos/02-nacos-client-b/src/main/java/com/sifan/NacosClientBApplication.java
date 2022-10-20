package com.sifan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // 开启服务 发送服务端
public class NacosClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientBApplication.class, args);
    }

}
