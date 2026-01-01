package com.bridgelabz.oops.inheritace.employeemanagement;

public class Employee {
	public String name;
	public String id;
	public double salary;
	
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Detail: ");
		System.out.println("Name: "+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("Salary : "+this.salary);
	}
}
