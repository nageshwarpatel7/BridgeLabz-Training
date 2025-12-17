/* Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. 
The program should ask for two numbers (floating point) and perform all the operations  */

import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter first number greater than 0: ");
			double num1 = input.nextDouble();
			System.out.print("Enter Second number greater than 0: ");
			double num2 = input.nextDouble();
			double add = num1+num2;
			double subtract = num1-num2;
			double multiplication = num1*num2;
			double division = num1/num2;
			System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+
			subtract+", "+multiplication+", and "+division);
	}
}
