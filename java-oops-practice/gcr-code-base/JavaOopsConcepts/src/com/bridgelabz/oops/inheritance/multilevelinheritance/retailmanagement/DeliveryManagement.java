package com.bridgelabz.oops.inheritance.multilevelinheritance.retailmanagement;

public class DeliveryManagement {
	public static void main(String[] args) {
		
		DeliveredOrder order = new DeliveredOrder("ORD123", "2023-10-01", "TRK987654", "2023-10-05");
		
		System.out.println("-----------Order Status Tracker---------------");
		order.displayInfo();
		
		System.out.print("Current status: ");
		order.getOrderStatus();
	}
}
