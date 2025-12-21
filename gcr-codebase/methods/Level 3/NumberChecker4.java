import java.util.*;

public class NumberChecker4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The number is perfect nummber: "+isPerfect(num));
		System.out.println("The number is abundant number: "+isAbundant(num));
		System.out.println("The number is deficient number: "+isdeficient(num));
		System.out.println("The number is strong number: "+isStrong(num));	
	}
	public static boolean isPerfect(int num){
		int sm =0;
		for(int i=1;i<num;i++)
			if(num%i==0)
				sm+=i;
			
		return sm==num;
	}
	public static boolean isAbundant(int num){
		int sm =0;
		for(int i=1;i<num;i++)
			if(num%i==0)
				sm+=i;
			
		return sm>num;
	}
	public static boolean isdeficient(int num){
		int sm =0;
		for(int i=1;i<num;i++)
			if(num%i==0)
				sm+=i;
			
		return sm<num;
	}
	public static boolean isStrong(int num){
		int sm =0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				int fact=1;
				for(int j=1;j<=i;j++)
					fact*=j;
				sm+=fact;
			}
		}
			
		return sm==num;
	}
}