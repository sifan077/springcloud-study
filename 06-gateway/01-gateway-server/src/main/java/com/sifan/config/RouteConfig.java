package com.sifan.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    /**
     * 自定义路由定位器
     * 代码的路由 跟 yml的路由不冲突的
     * 如果你的uri访问地址和匹配地址相同就不会进行拼接
     * @param builder 构建器
     * @return {@link RouteLocator}
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test-id0", r -> r.path("/guochuang").uri("https://bilibili.com"))
                .route("test-id1", r -> r.path("/v/dance").uri("https://bilibili.com"))
                .route("test-id2", r -> r.path("/anime").uri("https://bilibili.com"))
                .route("test-id3", r -> r.path("/variety").uri("https://bilibili.com"))
                .route("test-id4", r -> r.path("/documentary").uri("https://bilibili.com"))
                .build();
    }
}
