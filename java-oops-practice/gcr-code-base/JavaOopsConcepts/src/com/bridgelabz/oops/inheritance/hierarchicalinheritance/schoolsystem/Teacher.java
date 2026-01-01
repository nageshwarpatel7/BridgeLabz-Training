package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {
	public String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject =subject;
	}
	
	public void displayRole() {
		super.displayDetails();
		System.out.println("Role: Teacher");
		System.out.println("Subject teaches: "+subject+"\n");
	}
}
