/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/17
 * Time: 11:23
 * Describe:
 */

package com.sifan.conteoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("doOrder")
    public String doOrder(){
        return "油条-豆浆-热干面";
    }
}
