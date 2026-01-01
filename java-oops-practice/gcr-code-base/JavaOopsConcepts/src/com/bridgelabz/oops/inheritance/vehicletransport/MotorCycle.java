package com.bridgelabz.oops.inheritance.vehicletransport;

public class MotorCycle extends Vehicle {
	public boolean hasSideCar;
	
	public MotorCycle(int maxSpeed, String fuelType, boolean hasSideCar) {
		super(maxSpeed, fuelType);
		this.hasSideCar = hasSideCar;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Max speed of vehicle: "+maxSpeed);
		System.out.println("fuel type: "+fuelType);
		System.out.println("Has side car: "+hasSideCar);
	}
}
