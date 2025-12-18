/* Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___ */
import java.util.Scanner;

public class DivisibleByFive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%5==0)
			System.out.println("The number "+num+" is divisible by 5.");
		else
			System.out.println("The number "+num+" is not divisible by 5.");
	}
}
