package com.scorsaro.caffeineconversion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CaffeineConversion {
    private Long id;
    private String from;
    private String to;
    private Integer quantity;
    private Double conversionMultiple;
    private Double totalCalculatedAmount;
    private String environment;
}
