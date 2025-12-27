package com.constructorInstance.level1;

public class PostgraduateStudent extends Student {
	PostgraduateStudent(int rollNumber, String name, double cgpa){
		super(rollNumber, name, cgpa);
	}
	public static void main(String[] args) {
		PostgraduateStudent p1 = new PostgraduateStudent(101, "Nageshwar", 9.8);
		System.out.println("Roll number: "+p1.rollNumber);
		System.out.println("Name: "+p1.name);
		p1.displayCGPA();
	}
}
