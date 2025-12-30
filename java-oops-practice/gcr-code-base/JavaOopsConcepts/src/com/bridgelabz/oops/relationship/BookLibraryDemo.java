package com.bridgelabz.oops.relationship;

public class BookLibraryDemo {
	public static void main(String[] args) {
		
		Book b1 = new Book("Revolution 2020", "Chetan Bhagat");
		Book b2 = new Book("Godan", "Munshi Premchand");
		
		Library cityLibrary = new Library("City Library");
		Library schoolLibrary = new Library("School Library");
		
		cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        schoolLibrary.addBook(b2); 

        
        cityLibrary.displayBooks();
        schoolLibrary.displayBooks();
	}
}
