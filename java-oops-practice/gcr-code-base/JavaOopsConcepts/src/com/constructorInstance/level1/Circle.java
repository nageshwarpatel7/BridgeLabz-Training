package com.constructorInstance.level1;
import java.util.*;

public class Circle {
	int radius;
	Circle(){
		radius =10;
	}
	Circle(int radius){
		this.radius = radius;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		int r = sc.nextInt();
		
		Circle c;
		if(r<=0) {
			c = new Circle(); 
		}
		else {
			c = new Circle(20);
		}
		
		System.out.println("Radius of circle is: "+c.radius);
	}
}
