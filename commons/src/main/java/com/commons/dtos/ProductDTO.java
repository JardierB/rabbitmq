package com.commons.dtos;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private Integer id;
    private String name;
    private BigDecimal price;
}
