import java.util.Scanner;

public class MultipleOfNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Multiple of number "+n+" are: ");
		for(int i=1;i<=100;i++)
			if(i%n==0)
			 System.out.print(i+" ");
		 System.out.println();
	}
}