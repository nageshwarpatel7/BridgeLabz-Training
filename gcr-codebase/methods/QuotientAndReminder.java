import java.util.Scanner;

public class QuotientAndReminder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter divisor: ");
		int num2 = sc.nextInt();
		
		int ans[] = findRemainderAndQuotient(num1, num2);
		System.out.println("Quotient: "+ans[0]);
		System.out.println("Reminder: "+ans[1]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int ans[] = new int[2];
		ans[0] =number/divisor;
		ans[1] = number%divisor;
		
		return ans;
	}
}