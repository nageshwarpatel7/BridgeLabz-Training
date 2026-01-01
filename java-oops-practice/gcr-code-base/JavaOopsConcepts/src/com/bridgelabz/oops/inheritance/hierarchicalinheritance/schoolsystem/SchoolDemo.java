package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolDemo {
	public static void main(String[] args) {
		
		Teacher t = new Teacher("Timba babumba", 35, "Physical Education");
		t.displayRole();
		
		Student stu = new Student("Himesh", 22, "A+");
		stu.displayRole();
		
		Staff st = new Staff("Lucky", 23, "Visionary");
		st.displayRole();
	}
}
