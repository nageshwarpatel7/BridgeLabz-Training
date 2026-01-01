package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class Book {
	public String title;
	public int publicationYear;
	
	public Book(String title, int publicationYear) {
		this.title =title;
		this.publicationYear = publicationYear;
	}
	
	public void displayInfo() {
		System.out.println("Book title: "+title);
		System.out.println("publication year: "+publicationYear);
	}
}
