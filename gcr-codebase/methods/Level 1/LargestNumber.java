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
		
		int ans [] =largestNum(num1, num2, num3);
		System.out.println("Smallest number is: "+ans[0]);
		System.out.println("Largest number is: "+ans[1]);
	}
	public static int[] largestNum(int num1, int num2, int num3){
		int ans[] = new int[2];
		if(num1>num2 && num1>num3)
			ans[1]=num1;
		else if(num2>num1 && num2>num3)
			ans[1] = num2;
		else
			ans[1] =num3;
		
		if(num1<num2 && num1<num3)
			ans[0] = num1;
		else if(num2<num1 && num2<num3)
			ans[0] = num2;
		else
			ans[0] = num3;
		
		return ans;
	}
}