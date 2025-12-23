import java.util.Scanner;
import java.lang.Math;

public class MaxOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		
		System.out.print("Maximum number among given three number is: "+maxNum(num1, num2, num3));
	}
	
	public static int maxNum(int a, int b, int c){
		
		return Math.max(a,Math.max(b,c));
	}
}