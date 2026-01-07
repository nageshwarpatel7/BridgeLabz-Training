package com.oops.petpal;

public class Bird extends Pet implements Interactable {
	
	public Bird(String name, int age) {
		super(name, "Bird", age);
	}
	
	@Override
	public void feed() {
		feedPet();
		System.out.println("Bird is eating");
	}
	
	@Override
	public void play() {
		playPet();
		System.out.println("Bird is playing");
	}
	
	@Override
	public void sleep() {
		sleepPet();
		System.out.println("Bird is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bird is making sound");
	}
}
