package com.sifan.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {

    /**
     * 过滤器方法
     * 过滤器链模式
     * 责任链模式
     *
     * @param exchange
     * @param chain
     * @return {@link Mono}<{@link Void}>
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 针对请求，获取请求参数
        ServerHttpRequest request = exchange.getRequest();
        URI uri = request.getURI();
        System.out.println(uri);
        HttpHeaders headers = request.getHeaders();
        System.out.println(headers);
        HttpMethod method = request.getMethod();
        System.out.println(method);
        String hostName = request.getRemoteAddress().getHostName();
        System.out.println(hostName);
        // 放行到下一个过滤器
        ServerHttpResponse response = exchange.getResponse();
        response.getHeaders().set("content-type", "application/json;charset=utf-8");
        Map<String, Object> map = new HashMap<>();
        map.put("code", HttpStatus.UNAUTHORIZED.value());
        map.put("msg", "未授权");
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] bytes = new byte[0];
        try {
            bytes = objectMapper.writeValueAsBytes(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        DataBuffer wrap = response.bufferFactory().wrap(bytes);
//        return response.writeWith(Mono.just(wrap));
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
