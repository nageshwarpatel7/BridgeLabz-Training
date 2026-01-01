package com.bridgelabz.oops.inheritance.vehicletransport;

public class Truck extends Vehicle{
	public int loadCapacity;
	
	public Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	public void displayInfo() {
		System.out.println("Max speed of vehicle: "+maxSpeed);
		System.out.println("fuel type: "+fuelType);
		System.out.println("Load Capacity: "+loadCapacity);
	}
}
