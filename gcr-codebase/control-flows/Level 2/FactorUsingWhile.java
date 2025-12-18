import java.util.Scanner;

class FactorUsingWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Factors of number "+num+" are: ");
		int i=num;
		while(i>0){
			if(num%i==0)
				System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
	}
}