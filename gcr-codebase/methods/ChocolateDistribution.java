import java.util.Scanner;

public class ChocolateDistribution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of chocolate: ");
		int choco = sc.nextInt();
		System.out.print("Enter number of students: ");
		int stu = sc.nextInt();
		
		int ans[] = findRemainderAndQuotient(choco, stu);
		System.out.println("Total number of chocolates each student get: "+ans[0]);
		System.out.println("Remaining chocolate: "+ans[1]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int ans[] = new int[2];
		ans[0] =number/divisor;
		ans[1] = number%divisor;
		
		return ans;
	}
}