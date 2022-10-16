package com.sifan;

import com.sifan.domaim.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        // 在java代码中发送一个请求，请求一个页面
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.baidu.com";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

    @Test
    void testGet() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testGet?name=sifan";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

    @Test
    void testGet2() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testGet?name=sifan";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity);
    }

    @Test
    void testPost1() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost1";
        User user = new User("思凡", 19, 2305.12);
        // 发送post请求和json参数
        String post = restTemplate.postForObject(url, user, String.class);
        System.out.println(post);
    }

    @Test
    void testPost2() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost2";
        // 构建表单参数
        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("name", "思凡");
        map.add("age", 20);
        map.add("price", 1200);
        String post = restTemplate.postForObject(url, map, String.class);
        System.out.println(post);
    }
}
