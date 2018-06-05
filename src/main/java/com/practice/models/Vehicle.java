package com.practice.models;


import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.practice.validators.Range;

@Document(collection = "vehicles")
public class Vehicle{
	@Id
	int id;
	@Range(min = 1950, max = 2050)
	int Year;
	@NotNull(message="Make name is required")
	String Make;
	@NotNull(message="Model name is required")
	String Model;
	
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
