/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/18
 * Time: 9:40
 * Describe:
 */

package com.sifan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentCarController {

    @GetMapping("rent")
    public String rent() {
        return "租车成功";
    }
}
