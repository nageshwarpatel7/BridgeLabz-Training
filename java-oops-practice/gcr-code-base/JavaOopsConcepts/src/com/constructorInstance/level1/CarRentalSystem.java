package com.constructorInstance.level1;

public class CarRentalSystem {
	public String customerName;
	public String carModel;
	public int rentalDays;
	int price;
	
	public CarRentalSystem(String name, String model, int days){
		this.customerName = name;
		this.carModel = model;
		this.rentalDays = days;
	}
	public void display() {
		System.out.println("Customer name: "+this.customerName);
		System.out.println("Car name: "+this.carModel);
		System.out.println("Renting days: "+this.rentalDays);
		System.out.println("total price: "+(1000*this.rentalDays));
	}
	
	public static void main(String args[]) {
		CarRentalSystem c = new CarRentalSystem("Nageshwar","Ferrari", 5);
		c.display();
	}
}
