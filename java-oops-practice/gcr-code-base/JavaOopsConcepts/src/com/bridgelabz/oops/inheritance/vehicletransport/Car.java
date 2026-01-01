package com.bridgelabz.oops.inheritance.vehicletransport;

public class Car extends Vehicle{
	public int seatCapacity;
	
	public Car(int maxSpeed, String fuelType, int seapCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	public void displayInfo() {
		System.out.println("Max speed of vehicle: "+maxSpeed);
		System.out.println("fuel type: "+fuelType);
		System.out.println("Seat capacity: "+seatCapacity);
	}
}
