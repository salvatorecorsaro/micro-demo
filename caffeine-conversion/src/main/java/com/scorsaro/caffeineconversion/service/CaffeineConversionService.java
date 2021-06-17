package com.scorsaro.caffeineconversion.service;

import com.scorsaro.caffeineconversion.client.CaffeineExchangeProxy;
import com.scorsaro.caffeineconversion.dto.CaffeineConversion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaffeineConversionService {

    private final CaffeineExchangeProxy caffeineExchangeProxy;

    public CaffeineConversion calculateCaffeineConversion(String from, String to, Integer quantity) {
        CaffeineConversion caffeineconversion = caffeineExchangeProxy.retrieveExchangeValue(from, to);
        return new CaffeineConversion(
                caffeineconversion.getId(),
                from, to, quantity,
                caffeineconversion.getConversionMultiple(),
                quantity * caffeineconversion.getConversionMultiple(),
                caffeineconversion.getEnvironment()
        );
    }
}
