package com.api.parkingcontrtol.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.parkingcontrtol.models.ParkingSpotModel;
import com.api.parkingcontrtol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}	
	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartamentAndBlock(String apartament, String block) {
		return parkingSpotRepository.existsByApartamentAndBlock(apartament, block);
	}
	
	
}
