package com.constructorInstance.level1;

public class Book {
	public long ISBN;
	protected String title;
	private String author;
	
	Book(long isbn, String title, String author){
		this.ISBN = isbn;
		this.title = title;
		this.author = author;
	}
	public void setName(String name) {
		this.author = name;
	}
	public void getName() {
		System.out.print("Author name: "+this.author);
	}
}
