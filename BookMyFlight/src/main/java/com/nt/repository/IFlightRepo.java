package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Flight;

public interface IFlightRepo extends CrudRepository<Flight, Integer> {

}
