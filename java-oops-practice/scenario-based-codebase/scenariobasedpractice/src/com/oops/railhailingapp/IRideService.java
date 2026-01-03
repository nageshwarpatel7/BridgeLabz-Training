package com.oops.railhailingapp;

public interface IRideService {
	void bookRide(String passengerName, Vehicle vehicle, double distance);
	void endRide();
}
