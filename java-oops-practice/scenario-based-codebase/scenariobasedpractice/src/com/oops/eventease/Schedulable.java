package com.oops.eventease;

public interface Schedulable {
	void schedule();
	void reschedule(String date);
	void cancel();
}
