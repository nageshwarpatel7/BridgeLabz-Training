import java.util.*;

public class Factors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		int fact[] = calFactors(num);
		sumFact(fact);
		prodFact(fact);
		sumSquareFact(fact);
	}
	// factor calculation 
	public static int[] calFactors(int num){
		int cnt =0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				cnt++;
		}
		int fact[] = new int[cnt];
		for(int i=1;i<=num;i++){
			if(num%i==0){
				fact[cnt-1]=i;
				cnt--;
			}	
		}
		return fact;
	}
	public static void sumFact(int fact[]){
		long sm = 0;
		for(int i:fact)
			sm+=i;
		
		System.out.println("Sum of factors is: "+sm);
	}
	public static void prodFact(int fact[]){
		long prod =1;
		for(int i:fact)
			prod*=i;
		
		System.out.println("Product of factors is: "+prod);
	}
	public static void sumSquareFact(int fact[]){
		long factSum =0;
		for(int i:fact)
			factSum+= Math.pow(i,2);
		
		System.out.println("Sum of square of factors is: "+factSum);
	}
}