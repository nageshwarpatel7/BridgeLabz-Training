import java.util.*;

public class FibonacciNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		fibonacciSeries(num);
	}
	public static void fibonacciSeries(int num){
		if(num<0){
			System.out.println("Number should be positive");
			return;
		}
		
		if(num ==0){
			System.out.println(0);
			return ;
		}
		int a=0;
		int b=1;
		
		System.out.print("Fibonacci series upto "+num+" term is: ");
		for(int i=1;i<=num;i++){
			System.out.print(a+" ");
			
			int temp =b ;
			b = a+b;
			a = temp;
		}
		System.out.println();
	}
}