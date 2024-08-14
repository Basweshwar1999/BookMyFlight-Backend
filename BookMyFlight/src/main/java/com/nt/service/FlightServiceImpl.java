package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.FlightDTO;
import com.nt.model.Airport;
import com.nt.model.Flight;
import com.nt.repository.IAirportRepo;
import com.nt.repository.IFlightRepo;

@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	private IFlightRepo repo;
	
	@Autowired
	private IAirportRepo airportRepo;
	
	@Override
	public Flight scheduleNewFlight(FlightDTO flightDetails) {
		Optional<Airport> originAirport=airportRepo.findById(Integer.parseInt(flightDetails.getOriginAirportId()));
		Optional<Airport> destinationAirport=airportRepo.findById(Integer.parseInt(flightDetails.getDestinationAirportId()));
		
		Flight returnFlightDetails=null;
		if(originAirport.isPresent() && destinationAirport.isPresent()) {
			Flight flight=new Flight();
			flight.setOriginAirport(originAirport.get());
			flight.setDestinationAirport(destinationAirport.get());
			flight.setPrice(flightDetails.getPrice());
			flight.setDepartureDate(flightDetails.getDepartureDate());
			try {
			returnFlightDetails=repo.save(flight);
			}catch(Exception e){return null;}
		}else {
			return null;
		}
		
		return returnFlightDetails;
	}

}
