/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/16
 * Time: 15:34
 * Describe:
 */

package com.sifan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * ribbon 操作负载均衡流程
     * 1. 拦截请求
     * 2. 获取主机名称
     * 3. 借助eureka做服务发现List
     * 4. 通过负载均衡算法 拿到一个服务ip port
     * 5. reConstructURL
     * 5. 发起请求
     * @param serviceName
     * @return String
     */
    @GetMapping("testRibbon")
    public String testRibbon(String serviceName) {
        // http://provide/hello
        return restTemplate.getForObject("http://" + serviceName + "/hello", String.class);
    }

    /**
     * 添加LoadBalanced注解，RestTemplate就会被ribbon操作
     * 如果不想走ribbon托管，需要重新new 创建对象
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
