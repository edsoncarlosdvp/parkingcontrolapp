package com.api.parkingcontrtol.controllers;

import com.api.parkingcontrtol.service.ParkingSpotService;

public class ParkingSpotController {

	final ParkingSpotService parkingSpotService;

	public ParkingSpotController(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}
}
