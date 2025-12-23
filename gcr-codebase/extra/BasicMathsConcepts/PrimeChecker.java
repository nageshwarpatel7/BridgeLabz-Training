import java.util.*;

public class PrimeChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPrime(num))
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		
	}
	public static boolean isPrime(int num){
			
		if(num<=1)
			return false;
		
		if(num==2 || num==3 || num==5)
			return true;
		
		if(num%2==0 || num%3==0)
			return false;
		
		for(int i=5;i*i<=num;i+=6){
			if(num%i==0 || num%(i+2)==0)
				return false;
		}
		return true;
	}
}