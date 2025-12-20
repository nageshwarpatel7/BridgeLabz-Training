import java.util.Scanner;

public class LargestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		largestNum(num1, num2, num3);
	}
	public static void largestNum(int num1, int num2, int num3){
		if(num1>num2 && num1>num3)
			System.out.println("First number is largest");
		else if(num2>num1 && num2>num3)
			System.out.println("Second number is largest");
		else if(num3>num2 && num3>num1)
			System.out.println("Third number is largest");
		else
			System.out.println("There is no single large number");
	}
}