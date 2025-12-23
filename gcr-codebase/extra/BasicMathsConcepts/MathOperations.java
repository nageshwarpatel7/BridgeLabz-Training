import java.util.*;

public class MathOperations {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which operation do you wants to perform: ");
		System.out.println("1. Addition, 2.Subtraction, 3.multiplication, 4.division");
		System.out.print("Enter your choice (1,2,3,4): ");
		int choice = sc.nextInt();
		System.out.print("Enter first number: ");
		int  a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		
			
		if(choice==1)
			System.out.println("Output: "+add(a,b));
		else if(choice==2)
			System.out.println("Output: "+subtract(a,b));
		else if(choice==3)
			System.out.println("Output: "+mul(a,b));
		else if(choice==4)
			division(a,b);
		else
			System.out.println("Invalid choice!");
			
		}
	public static int add(int a,int b ) {
		return a+b;
	}
	public static int subtract(int a,int b ) {
		return a-b;
	}
	public static int mul(int a,int b ) {
		return a*b;
	}
	public static void division(int a,int b ) {
		try {
			System.out.println("Output: "+(a/b));
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero "+e);
			
		}
	}
}