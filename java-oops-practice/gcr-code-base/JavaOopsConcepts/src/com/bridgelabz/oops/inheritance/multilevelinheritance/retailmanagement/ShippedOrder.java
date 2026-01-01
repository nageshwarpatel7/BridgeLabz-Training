package com.bridgelabz.oops.inheritance.multilevelinheritance.retailmanagement;

public class ShippedOrder extends Order{
	public String trackingNumber;
	
	public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Order shipped your tracking number: "+trackingNumber);
	}
}
