package com.parking.registrations;


import javax.persistence.*;

import com.parking.registrations.infrastructure.LocalDateTimeConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "REGISTRATIONS")
public class Registration {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LOT_NUMBER", length = 12)
    private Integer lotNumber;
    
    @Column(name = "REGISTRATION_PLATE", length = 12)
    private String registrationPlate;
    
    @Column(name = "COLOR", length = 12)
    private String color;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "ARRIVAL_TIME")
    private LocalDateTime arrival;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "DEPARTURE_TIME")
    private LocalDateTime departure;

    @Column(name = "TARIFF_ID")
    private Long tariffId;

    public Long getId() {
        return id;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public void setDeparture(String departure) {
        this.departure = LocalDateTime.parse(departure, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Long getTariffId() {
        return tariffId;
    }

    public void setTariffId(Long tariffId) {
        this.tariffId = tariffId;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(Integer lotNumber) {
		this.lotNumber = lotNumber;
	}
	
    
}
