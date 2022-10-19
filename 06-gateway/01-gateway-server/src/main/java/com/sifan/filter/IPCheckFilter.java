package com.sifan.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * ip拦截过滤器
 *
 * @author 思凡
 * @date 2022/10/19
 */
public class IPCheckFilter implements GlobalFilter, Ordered {

    /**
     * ip过滤器
     * 网关别操作mysql数据库
     * 并发量大的操作查询redis
     * @param exchange 交换
     * @param chain    链
     * @return {@link Mono}<{@link Void}>
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        // 获取ip
        String ip = Objects.requireNonNull(request.getHeaders().getHost()).getHostString();
        System.out.println(ip);
        // 查询数据库是否在黑名单
        // 在黑名单就拦截
        // 不在黑名单就放行
        return null;
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
