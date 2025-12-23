import java.util.*;

public class FactorialCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Factorial of "+num+" is "+calFactorial(num));
		
	}
	public static int calFactorial(int num){
		if(num<=0)
			return 1;
		
		return num*calFactorial(num-1);
	}
}