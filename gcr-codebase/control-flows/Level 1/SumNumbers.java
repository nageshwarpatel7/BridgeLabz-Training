import java.util.Scanner;

public class SumNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = num;
		while(num!=0){
			System.out.println("Enter a number: ");
			num =sc.nextInt();
			sum+=num;
		}
		System.out.println("Sum of the numbers entered by you is "+sum);
	}
}