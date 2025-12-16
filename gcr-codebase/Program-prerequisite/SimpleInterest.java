import java.util.*;
class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle amount: ");
		int p = sc.nextInt();
		System.out.print("Enter the Rate: ");
		double r = sc.nextDouble();
		System.out.print("Enter the time: ");
		int t= sc.nextInt();
		double interest = (p*r*t)/100;
		System.out.println("Total interest is: "+interest);
	}
}