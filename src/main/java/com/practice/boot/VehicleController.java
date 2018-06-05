package com.practice.boot;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.models.Vehicle;
import com.practice.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	public static Logger logger = LoggerFactory.getLogger(VehicleController.class);
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String testApp() {
		return "Welcome";
	}
	
	@RequestMapping(value = "/vehicles",method = RequestMethod.POST)
	public void createVehicle(@Valid @RequestBody Vehicle vehicle, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("Validation failed");
			return;
		}
		vehicleService.create(vehicle);
		logger.info("New vehicle inserted");
	}
	
	@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
	public List<Vehicle> getVehicles(){
		return vehicleService.findAll();
	}
	
	@RequestMapping(value = "/vehicles/{id}", method = RequestMethod.GET)
	public Optional<Vehicle> getVehiclesById(@PathVariable Integer id){
		logger.info("This is vehicle id "+id);
		return vehicleService.findById(id);
	}
	
	@RequestMapping(value = "/vehicles", method = RequestMethod.PUT)
	public void updateVehicle(@RequestBody Vehicle vehicle){
		vehicleService.update(vehicle);
	}

	@RequestMapping(value = "/vehicles/{id}", method = RequestMethod.DELETE)
	public void updateVehicle(@PathVariable("id") Integer vehicleId){
		vehicleService.delete(vehicleId);
	}
}
