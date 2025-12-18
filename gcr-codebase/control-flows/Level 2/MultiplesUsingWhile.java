import java.util.Scanner;

public class MultiplesUsingWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0 && num<100){
			System.out.print("Multiples of number "+num+" are: ");
			int i=100;
			while(i>=num){
				if(i%num==0)
					System.out.print(i+" ");
				i-=1;
			}
			System.out.println();
		}
		else{
			System.out.println("Either the number if not positive or greater than 100");
		}
	}
}