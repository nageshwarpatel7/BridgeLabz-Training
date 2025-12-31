package com.bridgelabz.oops.inheritance.animal;

public class Animal {
	public String name;
	public int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Animal make a sound");
	}
}
