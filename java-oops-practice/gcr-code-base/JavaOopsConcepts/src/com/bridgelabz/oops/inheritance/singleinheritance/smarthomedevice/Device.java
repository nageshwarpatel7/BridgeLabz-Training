package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class Device {
	public String deviceId;
	public String status;
	
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus() {
		System.out.println("Device status: "+status);
	}
}
