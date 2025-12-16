import java.util.Scanner;
class Average{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a= sc.nextInt();
		System.out.print("Enter second number: ");
		int b= sc.nextInt();
		System.out.print("Enter third number: ");
		int c= sc.nextInt();
		
		double avg = (a+b+c)/3.0;
		System.out.print("Average of given three number is: "+avg);
	}
}