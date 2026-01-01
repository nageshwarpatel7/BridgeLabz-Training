package com.bridgelabz.oops.inheritace.employeemanagement;

public class Intern extends Employee{
	public Intern(String name, String id, double salary) {
		super(name, id, salary);
	}
	@Override
	public void displayDetails() {
		System.out.println("Employee Position: Intern");
		System.out.println("Name: "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
	}
}
