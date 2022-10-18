/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 12:02
 * Describe:
 */

package com.sifan.feign.hystrix;

import com.sifan.domain.Order;
import com.sifan.feign.UserOrderFeign;
import org.springframework.stereotype.Component;

@Component
public class UserOrderFeignHystrix implements UserOrderFeign {
    @Override
    public Order getOrderById(Integer userId) {
        return null;
    }
}
