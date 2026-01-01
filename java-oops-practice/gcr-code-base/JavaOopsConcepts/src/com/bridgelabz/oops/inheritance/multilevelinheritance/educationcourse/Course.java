package com.bridgelabz.oops.inheritance.multilevelinheritance.educationcourse;

public class Course {
	public String courseName;
	public String duration;
	
	public Course(String courseName, String duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	public void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
    }
}
