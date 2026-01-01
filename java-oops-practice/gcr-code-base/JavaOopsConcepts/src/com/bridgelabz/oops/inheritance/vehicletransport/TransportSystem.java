package com.bridgelabz.oops.inheritance.vehicletransport;

public class TransportSystem {
	public static void main(String[] args) {
		Vehicle[] fleet = { new Car(220, "Diesle", 7),
							new Truck(160, "Diesle", 15),
							new MotorCycle(180, "Petrol", false)						
							};
		
		System.out.println("---Vehicle and Transport System---\n");
		
		for(Vehicle v: fleet) {
			v.displayInfo();
			System.out.println();
		}
	}
}
