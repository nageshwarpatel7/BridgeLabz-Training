package com.bridgelabz.oops.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("name: "+name+", age: "+age+" make sound meow! meow!");
	}
}
