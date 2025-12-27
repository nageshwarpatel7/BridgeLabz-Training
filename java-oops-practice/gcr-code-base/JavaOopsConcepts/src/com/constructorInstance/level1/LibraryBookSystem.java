package com.constructorInstance.level1;

public class LibraryBookSystem {
	public String title;
	public String author;
	public int price;
	public boolean availability;
	
	public LibraryBookSystem(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	
	void borrowBook() {
		if(availability) {
			System.out.println(title+" is available to purchase");
		}
		else {
			System.out.println("Sorry! book is not available");
		}
	}
	public void display() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Availabiliyt: "+availability);
	}
	
	public static void main(String args[]) {
		LibraryBookSystem b = new LibraryBookSystem("Revolution 2020", "Chetan Bhagat", 500);
		b.borrowBook();
		b.display();		
	}
}
