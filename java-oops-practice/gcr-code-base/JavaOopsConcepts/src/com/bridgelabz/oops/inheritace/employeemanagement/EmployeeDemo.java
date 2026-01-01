package com.bridgelabz.oops.inheritace.employeemanagement;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee em1 = new Employee("Nageshwar", "E01", 10000);
		em1.displayDetails();
		System.out.println();
		
		Manager m1 = new Manager("Nageshwar", "M01", 100000);
		m1.teamSize(10);
		m1.displayDetails();
		System.out.println();
		
		Developer dev1 = new Developer("Lucky", "D01", 50000);
		dev1.devProgrammingLanguage("Java");
		dev1.displayDetails();
		System.out.println();
		
		Intern intern = new Intern("Himesh", "I01", 20000);
		intern.displayDetails();
		System.out.println();
		
	}
}
