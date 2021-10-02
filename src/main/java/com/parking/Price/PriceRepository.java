package com.parking.Price;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

public interface PriceRepository extends Repository<Price, Long> {

    Optional<Price> findOne(Long id);

    Price findTopByOrderByIdDesc();

    @RestResource
    Price save(Price tariff);
}
