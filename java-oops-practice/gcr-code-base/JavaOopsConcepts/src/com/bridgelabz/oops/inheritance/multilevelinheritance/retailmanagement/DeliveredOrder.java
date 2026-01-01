package com.bridgelabz.oops.inheritance.multilevelinheritance.retailmanagement;

public class DeliveredOrder extends ShippedOrder{
	public String deliveryDate;
	
	public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	@Override
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Order delivered sucessfully on date: "+deliveryDate);
	}
}
