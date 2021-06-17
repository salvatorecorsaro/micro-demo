package com.scorsaro.caffeineconversion.controller;

import com.scorsaro.caffeineconversion.dto.CaffeineConversion;
import com.scorsaro.caffeineconversion.service.CaffeineConversionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caffeine-conversion")
@AllArgsConstructor
public class CaffeineConversionController {

    private final CaffeineConversionService service;

    @GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
    public CaffeineConversion calculateCaffeineConversion(
            @PathVariable String from, @PathVariable String to, @PathVariable Integer quantity) {
        return service.calculateCaffeineConversion(from, to, quantity);
    }

}
