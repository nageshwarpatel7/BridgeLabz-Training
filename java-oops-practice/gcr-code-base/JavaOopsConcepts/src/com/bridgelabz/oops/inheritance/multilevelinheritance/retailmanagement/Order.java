package com.bridgelabz.oops.inheritance.multilevelinheritance.retailmanagement;

public class Order {
	public String orderId;
	public String orderDate;
	
	public Order(String orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public void getOrderStatus() {
		System.out.println("Order Placed");
	}
	
	public void displayInfo() {
		System.out.println("Order ID: "+orderId);
		System.out.println("Order Date: "+orderDate);
	}
}