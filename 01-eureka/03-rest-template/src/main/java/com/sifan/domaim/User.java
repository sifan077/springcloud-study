/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/16
 * Time: 12:36
 * Describe:
 */

package com.sifan.domaim;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private Double price;
}
