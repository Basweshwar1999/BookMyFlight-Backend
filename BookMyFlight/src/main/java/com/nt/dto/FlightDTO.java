package com.nt.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

	private String destinationAirportId;
	private String originAirportId;
	private LocalDateTime departureDate;
	private Double price;
	private Integer availabeSeats;
}
