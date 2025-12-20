import java.util.*;

public class MaxRounds{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of trianglar parks(in meters): ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double peri = a+b+c;
		int ans = totalRounds(peri);
		System.out.println("Total rounds covered by athelete is: "+ans);
	}
	
	public static int totalRounds(double peri){
		return (5000%peri ==0)? (int)(5000/peri) : (int)(5000/peri)+1;
	}
}