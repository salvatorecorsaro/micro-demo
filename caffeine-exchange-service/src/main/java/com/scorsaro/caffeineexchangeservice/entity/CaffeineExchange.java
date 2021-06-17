package com.scorsaro.caffeineexchangeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CaffeineExchange {

    @Id
    private Long id;

    @Column(name = "beverage_from")
    private String from;

    @Column(name = "beverage_to")
    private String to;

    private Double conversionMultiple;
    private String environment;

    public CaffeineExchange(Long id, String from, String to, Double conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
}
