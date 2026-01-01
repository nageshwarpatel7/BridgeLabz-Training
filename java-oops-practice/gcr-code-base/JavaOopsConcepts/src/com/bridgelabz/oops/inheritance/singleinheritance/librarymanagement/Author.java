package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	public String authorName;
	
	public Author(String name, int publicationYear, String authorName) {
		super(name, publicationYear);
		this.authorName = authorName;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Book title: "+title);
		System.out.println("Author name: "+authorName);
		System.out.println("publication year: "+publicationYear);		
	}
}
