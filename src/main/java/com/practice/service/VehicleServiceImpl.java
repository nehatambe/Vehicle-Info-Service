package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.models.Vehicle;
import com.practice.models.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{

	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Override
	public void create(Vehicle vehicle) {
		vehicleRepo.save(vehicle);
		
	}

	@Override
	public List<Vehicle> findAll() {
		
		return vehicleRepo.findAll();
	}

	@Override
	public Optional<Vehicle> findById(Integer vehicleId) { 
		return vehicleRepo.findById(vehicleId);
	}

	@Override
	public void update(Vehicle vehicle) {
		vehicleRepo.save(vehicle);
		
	}

	@Override
	public void delete(Integer vehicleId) {
		vehicleRepo.deleteById(vehicleId);
		
	}

}
