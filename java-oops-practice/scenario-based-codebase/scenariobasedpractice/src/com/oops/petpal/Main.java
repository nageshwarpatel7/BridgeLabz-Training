package com.oops.petpal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", 3);
		Cat cat = new Cat("Luna", 2);
        Bird bird = new Bird("luccy", 3);
        
        dog.makeSound();
        dog.play();
        System.out.println("Dog mood: " + dog.getMood());

        cat.makeSound();
        cat.play();
        System.out.println("Cat mood: " + cat.getMood());
        
        bird.makeSound();
        bird.feed();
        System.out.println("Bird mood: "+bird.getMood());
        
	}
}
