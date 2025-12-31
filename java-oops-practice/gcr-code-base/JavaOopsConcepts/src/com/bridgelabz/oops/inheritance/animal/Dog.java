package com.bridgelabz.oops.inheritance.animal;

public class Dog extends Animal{
	public Dog(String name, int age ) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("name: "+name+"age: "+age+" make sound woof!, woof!");
	}
}
