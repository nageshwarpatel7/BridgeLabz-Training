import java.util.*;

public class NaturalNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		int recursionSum = sumNum(num);
		int formulaSum = (num*(num+1))/2;
		System.out.println("Sum of natural numbers using fromula is: "+formulaSum);
		System.out.println("Sum of natural numbers using recursion is: "+recursionSum);
		
	}
	public static int sumNum(int num){
		if(num<=0)
			return 0;
		
		return sumNum(num-1)+num;
	}
}