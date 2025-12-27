package com.constructorInstance.level2;

public class Product{
	
	public String productName;
	public int price;
	static int cnt =0;
	public Product(String prodName, int price) {
		this.productName = prodName;
		this.price = price;
		this.cnt+=1;
	}
	public void displayProductDetails() {
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product price: "+this.price);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("SportsCar", 1000);
		Product p2 = new Product("Bottle", 50);
		p1.displayProductDetails();
		p2.displayProductDetails();
		displayTotalProducts();

	}
	public static void displayTotalProducts() {
			System.out.println("Total product create: "+ cnt);			
	}
}
