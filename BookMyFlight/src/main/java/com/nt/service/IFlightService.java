package com.nt.service;

import org.springframework.http.ResponseEntity;

import com.nt.dto.FlightDTO;
import com.nt.model.Flight;

public interface IFlightService {

	public Flight scheduleNewFlight(FlightDTO flightDetails);
}
