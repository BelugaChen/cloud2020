package com.beluga.cloudalibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:47.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;

    private Long userId;

    private BigDecimal total;

    private BigDecimal used;

    private BigDecimal residue;
}
