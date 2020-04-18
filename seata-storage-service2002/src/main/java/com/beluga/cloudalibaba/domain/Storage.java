package com.beluga.cloudalibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/18 19:10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}
