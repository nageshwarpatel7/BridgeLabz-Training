package com.constructorInstance.level1;

public class EBook extends Book{
	public EBook(long isbn, String title, String author) {
		super(isbn, title, author);
	}
	public static void main(String[] args) {
		EBook b = new EBook(10987654321L,"Half GirlFriend", "Chetan Bhagat");
		System.out.println("ISBN number: "+b.ISBN);
		System.out.println("Title name: "+b.title);
		b.getName();
		b.setName("Chetan Bhagat");
		b.getName();
	}	
	
}
