package com.api.parkingcontrtol.service;

import org.springframework.stereotype.Service;

import com.api.parkingcontrtol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}	
}
