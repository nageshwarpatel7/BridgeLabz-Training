package com.constructorInstance.level1;

public class Person {
	public String name;
	public int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person(Person p){
		this.name = p.name;
		this.age  = p.age;
	}
	
	public static void main(String args[]) {
				
		Person p1 = new Person("Lucky", 22);
		Person p2 = new Person(p1);
		
		System.out.println("Person1 name: "+p1.name+", age: "+p1.age);
		System.out.println("Person2 name: "+p2.name+", age: "+p2.age);
	}
}
