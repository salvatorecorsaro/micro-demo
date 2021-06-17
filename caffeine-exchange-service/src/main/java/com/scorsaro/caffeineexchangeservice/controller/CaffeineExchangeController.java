package com.scorsaro.caffeineexchangeservice.controller;


import com.scorsaro.caffeineexchangeservice.entity.CaffeineExchange;
import com.scorsaro.caffeineexchangeservice.service.CaffeineExchangeService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caffeine-exchange")
@AllArgsConstructor
public class CaffeineExchangeController {

    private final Logger logger = LoggerFactory.getLogger(CaffeineExchangeController.class);
    private final CaffeineExchangeService service;



    @GetMapping("/from/{from}/to/{to}")
    public CaffeineExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        logger.info("Retrieving ExchangeValue called with {} to {}", from, to);
        return service.retrieveExchangeValue(from, to);
    }
    }
