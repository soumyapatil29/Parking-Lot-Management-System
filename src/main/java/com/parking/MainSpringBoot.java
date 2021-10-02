package com.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * main class
 */
	@SpringBootApplication
public class MainSpringBoot {

    /***
     *  main class of the application, starts spring context
     *  @param args xD
     */
    public static void main(String[] args) {
        SpringApplication.run(MainSpringBoot.class, args);
    }
}
