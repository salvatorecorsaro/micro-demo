package com.scorsaro.caffeineexchangeservice.service;

import com.scorsaro.caffeineexchangeservice.entity.CaffeineExchange;
import com.scorsaro.caffeineexchangeservice.error.DataNotFoundException;
import com.scorsaro.caffeineexchangeservice.repository.CaffeineExchangeRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaffeineExchangeService {
    private final CaffeineExchangeRepository repository;
    private final Environment environment;

    public CaffeineExchange retrieveExchangeValue(String from, String to) {
        CaffeineExchange caffeineExchange = repository.findByFromAndTo(from, to);

        if (caffeineExchange == null)
            throw new DataNotFoundException();

        caffeineExchange.setEnvironment(environment.getProperty("local.server.port"));

        return caffeineExchange;
    }
}
