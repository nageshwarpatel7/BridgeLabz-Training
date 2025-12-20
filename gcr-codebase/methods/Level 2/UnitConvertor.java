import java.util.Scanner;

public class UnitConvertor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		double km = sc.nextDouble();
		double miles = sc.nextDouble();
		double meter = sc.nextDouble();
		double feet = sc.nextDouble();
		
		System.out.println("km to miles "+kmToMiles(km));
		System.out.println("miles to km "+milesToKm(miles));
		System.out.println("meter to feet "+meterToFeets(meter));
		System.out.println("feet to meter "+feetToMeters(feet));
		
	}
	public static double kmToMiles(double km){
		double miles = km*0.621371;
		return miles;
	}
	public static double milesToKm(double mile){
		double km = mile*1.60934;
		return km;
	}
	public static double meterToFeets(double meter){
		return meter*3.28084;
	}
	public static double feetToMeters(double feet){
		return feet*0.3048;
	}
}