package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class BookDemo {
	public static void main(String[] args) {
		Book b = new Book("Godan", 1967);
		b.displayInfo();
		System.out.println();
		
		Author a = new Author("Revolution 2020", 2020, "Chetan Bhagat");
		a.displayInfo();
		
	}
}
