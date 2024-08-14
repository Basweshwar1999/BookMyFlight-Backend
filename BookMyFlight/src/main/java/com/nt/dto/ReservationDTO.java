package com.nt.dto;

import java.util.List;

import com.nt.model.Traveller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

	private Integer userId;
	private Integer flightId;
	private List<Traveller> travellerList;
}
