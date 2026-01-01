package com.bridgelabz.oops.inheritace.employeemanagement;

public class Manager extends Employee {
	int teamsize;
	public Manager(String name, String id, int salary) {
		super(name, id, salary);
	}
	
	public void teamSize(int size) {
		this.teamsize = size;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Employee Position: Manager");
		System.out.println("Name: "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
		System.out.println("Team size: "+teamsize);
	}
}
