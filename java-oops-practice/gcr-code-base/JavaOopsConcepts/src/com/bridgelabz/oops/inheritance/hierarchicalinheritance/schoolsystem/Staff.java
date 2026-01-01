package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
	public String department;
	
	public Staff(String name, int age, String department) {
		super(name, age);
		this.department= department;
	}
	
	public void displayRole() {
		super.displayDetails();
		System.out.println("Role: Staff");
		System.out.println("Department: "+department+"\n");
	}
}
