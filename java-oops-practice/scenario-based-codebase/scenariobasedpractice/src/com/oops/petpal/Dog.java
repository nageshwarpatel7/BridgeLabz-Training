package com.oops.petpal;

public class Dog extends Pet implements Interactable{
	
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog is making sound");
	}
	
	@Override
	public void feed() {
		feedPet();
		System.out.println("Dog is eating");
	}
	
	@Override
	public void play() {
		playPet();
		System.out.println("Dog is playing");
	}
	
	@Override
	public void sleep() {
		sleepPet();
		System.out.println("Dog is sleeping");
	}
}
