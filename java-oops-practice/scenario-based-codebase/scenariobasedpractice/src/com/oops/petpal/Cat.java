package com.oops.petpal;

public class Cat extends Pet implements Interactable {

	public Cat(String name, int age) {
		super(name, "Cat", age);
	}
	@Override
	public void feed() {
		feedPet();
		System.out.println("Cat is eating");
	}

	@Override
	public void play() {
		playPet();
		System.out.println("Cat is playing");
	}

	@Override
	public void sleep() {
		sleepPet();
		System.out.println("Cat is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat is making sound");
	}
}
