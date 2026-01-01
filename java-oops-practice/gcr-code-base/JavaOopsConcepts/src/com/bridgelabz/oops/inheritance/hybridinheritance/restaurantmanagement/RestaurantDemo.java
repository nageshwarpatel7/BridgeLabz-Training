package com.bridgelabz.oops.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantDemo {
	public static void main(String[] args) {
		
		Chef c = new Chef("Nageshwar", "CHEF01");
		c.performDuties();
		
		Waiter w = new Waiter("Jagga", "WAITER01");
		w.performDuties();
	}
}
