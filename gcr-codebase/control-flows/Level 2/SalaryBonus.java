import java.util.Scanner;

public class SalaryBonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int salary =sc.nextInt();
		double serviceYear = sc.nextDouble();
		double bonus =0;
		if(serviceYear>5)
			bonus = salary*0.05;
		System.out.println("Total bonus is: "+bonus);
	}
}