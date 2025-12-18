import java.util.Scanner;

class FactorBeforeNumberUsingWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Factors of number "+num+" are: ");
		int i=num-1;
		while(i>0){
			if(num%i==0)
				System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
	}
}