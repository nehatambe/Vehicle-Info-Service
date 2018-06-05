package com.practice.service;

import java.util.List;
import java.util.Optional;

import com.practice.models.Vehicle;
import com.practice.models.VehicleRepository;


public interface VehicleService {
	void create(Vehicle vehicle);
	List<Vehicle> findAll();
	Optional<Vehicle> findById(Integer vehicleId);
	void update(Vehicle vehicle);
	void delete(Integer vehicleId);

}
