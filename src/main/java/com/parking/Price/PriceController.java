package com.parking.Price;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class PriceController {

    private PriceRepository tariffCrudRepository;

    @Autowired
    public PriceController(PriceRepository tariffCrudRepository) {
        this.tariffCrudRepository = tariffCrudRepository;
    }

    @PostMapping("/tariff-data")
    public ResponseEntity<Void> postNewTariff(@RequestBody Price tariff) {
        tariffCrudRepository.save(tariff);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/tariff-data")
    public ResponseEntity<Price> getLatestTariff() {
        Price tariff = tariffCrudRepository.findTopByOrderByIdDesc();
        return new ResponseEntity<>(tariff, HttpStatus.OK);
    }
}
