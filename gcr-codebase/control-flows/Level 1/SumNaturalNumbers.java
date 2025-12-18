import java.util.Scanner;

class SumNaturalNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x= n;
		int sm1 = n*(n+1)/2;
		int sm2 = 0;
		while(n>0){
			sm2+=n;
			n--;
		}
		if(sm1==sm2)
			System.out.println("Sum of "+x+" natural number is "+sm1);
		
	}
}