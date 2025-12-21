import java.util.*;

public class NumberChecker3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The number is prime: "+isPrime(num));
		System.out.println("The number is Neon number: "+isNeon(num));
		System.out.println("The number is Spy number: "+isSpy(num));
		System.out.println("The number is Automorphic number: "+isAutomorphic(num));
		System.out.println("The number is Buzz number: "+isBuzzNumber(num));
		
	}
	public static boolean isPrime(int num){
		if(num<=1)
			return false;
		if(num==2 || num==3)
			return true;
		if(num%3==0 || num%2==0)
			return false;
		
		for(int i=3;i<=(int)Math.sqrt(num);i+=2)
			if(num%i==0)
				return false;
			
		return true;
	}
	public static boolean isNeon(int num){
		int temp = num*num;
		int sm =0;
		while(temp>0){
			int rem = temp%10;
			sm+= rem;
			temp/=10;
		}
		return (num==sm)?true:false;
	}
	public static boolean isSpy(int num){
		int temp = num;
		int sum =0;
		int prod = 1;
		while(temp>0){
			int rem = temp%10;
			sum+=rem;
			prod*=rem;
			temp/=10;
		}
		return (sum==prod)?true:false;
	}
	public static boolean isAutomorphic(int num){
		int sq = num*num;
		int temp =num;
		while(temp>0){
			if(temp%10 != sq%10)
				return false;
			temp/=10;
			sq/=10;
		}
		return true;
	}
	public static boolean isBuzzNumber(int num){
		if(num%7==0 || num%10==7)
			return true;
		return false;
	}
	
}