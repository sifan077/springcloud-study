/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/16
 * Time: 12:01
 * Describe:
 */

package com.sifan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 通过应用名称找到服务的ip和端口
     * 在java代码中发送 http 请求
     * @param serviceName
     * @return String
     */
    @GetMapping("test")
    public String doDiscovery(String serviceName) {
        // 服务发现， 通过服务的应用名找到服务的具体信息
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
        instances.forEach(System.out::println);
        // 去找ip和端口
        return instances.get(0).toString();
    }
}
