package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class Thermostat extends Device{
	public double temperatureSetting;
	
	public Thermostat(String deviceId, String status, double temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	public void displayStatus() {
		System.out.println("Device status: "+status);
		System.out.println("Device temperature: "+temperatureSetting);
	}
}
