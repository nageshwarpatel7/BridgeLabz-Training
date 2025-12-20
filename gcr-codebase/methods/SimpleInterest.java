import java.util.Scanner;

class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle amount: ");
		double p = sc.nextDouble();
		System.out.print("Enter rate amount: ");
		double r = sc.nextDouble();
		System.out.print("Enter time amount(in years): ");
		double t = sc.nextInt();
		double ans = simpleInterst(p,r,t);
		System.out.println("The Simple Interest is "+ans+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
	}
	public static double simpleInterst(double p, double r, double t){
		return (p*r*t)/100;
	}
}