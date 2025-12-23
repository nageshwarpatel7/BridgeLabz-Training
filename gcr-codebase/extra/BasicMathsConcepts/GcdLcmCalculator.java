import java.util.*;

public class GcdLcmCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("GCD of "+num1+" and "+num2+" is: "+calulateGCD(num1,num2));
		
		System.out.println("LCM of "+num1+" and "+num2+" is: "+calcuLCM(num1,num2));
		
		
	}
	public static int calulateGCD(int a, int b){
		while(b!=0){
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	public static int calcuLCM(int a, int b){
		if(a==0 || b==0)
			return 0;
		
		int gcd = calulateGCD(a,b);
		return Math.abs(a*(b/gcd));
	}
}