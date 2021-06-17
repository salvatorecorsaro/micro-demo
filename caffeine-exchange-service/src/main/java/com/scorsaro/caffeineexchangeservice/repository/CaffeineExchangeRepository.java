package com.scorsaro.caffeineexchangeservice.repository;

import com.scorsaro.caffeineexchangeservice.entity.CaffeineExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaffeineExchangeRepository extends JpaRepository<CaffeineExchange, Long> {

    CaffeineExchange findByFromAndTo(String from, String to);
}
