package com.nt.service;

import com.nt.dto.ReservationDTO;
import com.nt.model.Reservation;

public interface IReservationService {

	public boolean bookFlightSeats(ReservationDTO reservationDetails);
}
