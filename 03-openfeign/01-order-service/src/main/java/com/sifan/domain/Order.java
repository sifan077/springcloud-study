/*
 * Created by IntelliJ IDEA.
 * User: 思凡
 * Date: 2022/10/17
 * Time: 12:16
 * Describe:
 */

package com.sifan.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Integer id;
    private String name;
    private Double price;
    private Date time;

}
