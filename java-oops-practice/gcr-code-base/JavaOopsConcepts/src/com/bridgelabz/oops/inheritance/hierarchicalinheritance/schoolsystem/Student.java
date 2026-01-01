package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person {
	public String grade;
	
	public Student(String name, int age, String grade) {
		super(name,age);
		this.grade = grade;
	}
	
	void displayRole() {
		super.displayDetails();
		System.out.println("Role: Student");
		System.out.println("Grade: "+grade+"\n");
	}
}
