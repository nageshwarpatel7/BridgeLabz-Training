package com.bridgelabz.oops.inheritance.vehicletransport;

public class Vehicle {
	public int maxSpeed;
	public String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Max speed of vehicle: "+maxSpeed);
		System.out.println("fuel type: "+fuelType);
	}
}
