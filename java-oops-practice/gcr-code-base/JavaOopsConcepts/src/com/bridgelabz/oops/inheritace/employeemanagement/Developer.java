package com.bridgelabz.oops.inheritace.employeemanagement;

public class Developer extends Employee {
	String programmingLanguage;
	public Developer(String name, String id, double salary) {
		super(name, id, salary);
	}
	
	public void devProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Employee Position: Developer");
		System.out.println("Name: "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
		System.out.println("Team size: "+programmingLanguage);
	}
}
