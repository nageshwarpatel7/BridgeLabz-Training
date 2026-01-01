package com.bridgelabz.oops.inheritance.multilevelinheritance.educationcourse;

public class CourseSystem {
	public static void main(String[] args) {
		
		PainOnlineCourse javaMastery = new PainOnlineCourse(
	            "Java Mastery", "40 Hours", "Udemy", true, 99.99, 20.0
	        );

	        System.out.println("--- Course Details ---\n");
	        javaMastery.displayInfo();
	    }
}
