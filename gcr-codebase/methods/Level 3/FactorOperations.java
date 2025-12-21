import java.util.*;

public class FactorOperations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc .nextInt();
		
		int fact[] = factors(num);
		int size = fact.length;
		System.out.println("total number factors of "+num+" are "+size);
		System.out.println("Factors of "+num+" are: "+Arrays.toString(fact));
		System.out.println("Largest factor of "+num+" is "+greatestFact(num));
		System.out.println("Sum of factors of "+num+" : "+sumOfFactor(fact));
		System.out.println("Product of factors of "+num+" : "+prodOfFactor(fact));
		System.out.println("Product of cube of factors of "+num+" : "+factorCubeProduct(fact));
	}
	public static int[] factors(int num){
		int cnt = 0;
		for(int i=1;i<=num;i++)
			if(num%i==0)
				cnt++;
		
		int fact[] = new int[cnt];
		cnt--;
		for(int i=num;i>0;i--)
			if(num%i==0)
				fact[cnt--] = i;
		
		return fact;
	}
	public static int greatestFact(int num){
		return num;
	}
	public static int sumOfFactor(int fact[]){
		int sm =0;
		for(int i:fact)
			sm+=i;
		return sm;
	}
	public static int prodOfFactor(int fact[]){
		int prod =1;
		for(int i:fact)
			prod*=i;
		return prod;
	}
	public static long factorCubeProduct(int fact[]){
		long ans =1;
		for(int i:fact)
			ans*= (int)Math.pow(i,3);
		return ans;
	}
}