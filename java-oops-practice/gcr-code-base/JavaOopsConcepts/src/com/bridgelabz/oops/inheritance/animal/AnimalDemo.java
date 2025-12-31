package com.bridgelabz.oops.inheritance.animal;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Animal("Dog", 10);
		a.makeSound();
		
		Dog dog = new Dog("Jacky", 5);
		dog.makeSound();
		
		Cat cat = new Cat("Pinky", 6);
		cat.makeSound();
		
		Bird bird = new Bird("Lucky", 9);
		bird.makeSound();
	}
}
