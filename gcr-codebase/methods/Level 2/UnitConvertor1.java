import java.util.Scanner;

public class UnitConvertor1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double inches = sc.nextDouble();
		double centimeters = sc.nextDouble();
		double meter = sc.nextDouble();
		double feet = sc.nextDouble();
		double yards = sc.nextDouble();
		
		System.out.println("yards to feets "+yards2feets(yards));
		System.out.println("inches to cm "+inchesToCentimeters(inches));
		System.out.println("meter to inches "+metersToInches(meter));
		System.out.println("inches to meter "+inchesToMeters(feet));
		System.out.println("feets to yards "+feet2yards(feet));
		
	}
	public static double metersToInches(double meter){
		double inches = meter*39.3701;
		return inches;
	}
	public static double inchesToMeters(double inches){
		double meters = inches*0.0254;
		return meters;
	}
	public static double inchesToCentimeters(double inches){
		double centimeters = inches*0.0254;
		return centimeters;
	}
	public static double yards2feets(double yards){
		return yards*3;
	}
	public static double feet2yards(double feet){
		return feet*0.333333;
	}
}