package com.constructorInstance.level1;

public class Manager extends Employee {
	public Manager(int employeeID, String dept, double salary) {
		super(employeeID, dept, salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager e = new Manager(123, "Research", 50000);
		System.out.println("Employees ID: "+e.employeeID);
		System.out.println("Department: "+e.department);
	}

}
