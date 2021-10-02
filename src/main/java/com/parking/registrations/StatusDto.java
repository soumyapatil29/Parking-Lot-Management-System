package com.parking.registrations;

import org.springframework.context.annotation.Bean;

public class StatusDto {
    private Integer lotNumber;
    
    private String registrationPlate;
    
    private String color;
    
    private String arrivalTime;

	public Integer getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(Integer lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
    
    
}
