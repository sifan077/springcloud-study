/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 9:52
 * Describe:
 */

package com.sifan.feign.hystrix;

import com.sifan.feign.CustomerRentFeign;
import org.springframework.stereotype.Component;

@Component
public class CustomerRentFeignHystrix implements CustomerRentFeign {
    @Override
    public String rent() {
        return "我是备胎";
    }
}
