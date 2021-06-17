package com.scorsaro.caffeineconversion.client;

import com.scorsaro.caffeineconversion.dto.CaffeineConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="caffeine-exchange")
public interface CaffeineExchangeProxy {
    @GetMapping("/caffeine-exchange/from/{from}/to/{to}")
    CaffeineConversion retrieveExchangeValue( @PathVariable String from, @PathVariable String to);
}
