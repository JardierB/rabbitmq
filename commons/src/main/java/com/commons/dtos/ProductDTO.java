package com.commons.dtos;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductDTO implements Serializable {

    private Integer id;
    private String name;
    private BigDecimal price;
}
