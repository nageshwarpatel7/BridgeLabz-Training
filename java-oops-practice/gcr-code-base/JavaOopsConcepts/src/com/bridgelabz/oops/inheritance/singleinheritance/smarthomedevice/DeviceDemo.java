package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class DeviceDemo {
	public static void main(String[] args) {
		Device d = new Device("101","active");
		
		d.displayStatus();
		System.out.println();
		
		Thermostat t = new Thermostat("102", "active", 30);
		t.displayStatus();
	}
}
