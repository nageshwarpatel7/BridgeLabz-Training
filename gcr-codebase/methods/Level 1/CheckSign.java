import java.util.*;

public class CheckSign{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sign(num);
		
	}
	public static void sign(int num){
		if(num==0)
			System.out.println("Zero");
		else if(num>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
}