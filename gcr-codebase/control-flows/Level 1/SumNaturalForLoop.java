import java.util.Scanner;

class SumNaturalForLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sm =0;
		for(int i=n;i>0;i--)
			sm+=i;
		System.out.println("Sum of "+n+" natural number is "+sm);
		
	}
}