/* Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/
import java.util.*;
public class FirstIsSmallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1<num2 && num1<num3)
			System.out.println("First number is the smallest number");
		else
			System.out.println("First number is not smallest number");
	}
}