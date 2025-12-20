import java.util.*;

public class NaturalSum{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n =sc.nextInt();
		int ans = sumNum(n);
		System.out.println("Sum of first "+n+" natural number is: "+ans);
	}
	public static int sumNum(int n){
		int sm = 0;
		for(int i=1;i<=n;i++)
			sm+=i;
		return sm;
	}
}