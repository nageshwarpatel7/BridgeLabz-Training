package com.oops.petpal;
import java.util.Random;

public abstract class Pet {
	private String name;
	private String type;
	private int age;
	
	private int hunger;
	private int energy;
	private String mood;
	
	public Pet(String name,String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
		Random r= new Random();
		this.hunger = r.nextInt(40)+20;
		this.energy = r.nextInt(40)+40;
		updateMood();
	}
	
	private void updateMood() {
        if (energy > 70 && hunger < 30)
            mood = "Happy";
        else if (hunger > 60)
            mood = "Hungry";
        else
            mood = "Tired";
    }
	
	public void feedPet() {
		hunger-=15;
		energy+=10;
		updateMood();
	}
	public void sleepPet() {
		hunger+=15;
		energy+=10;
		updateMood();
	}
	public void playPet() {
		hunger+=10;
		energy-=15;
		updateMood();
	}
	
	public String getMood() {
		return mood;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void makeSound();
}
