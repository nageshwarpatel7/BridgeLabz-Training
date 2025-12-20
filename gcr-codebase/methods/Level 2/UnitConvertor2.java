import java.util.Scanner;

public class UnitConvertor2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		double farhenheit = sc.nextDouble();
		double celcius = sc.nextDouble();
		double pounds = sc.nextDouble();
		double kilograms = sc.nextDouble();
		double gallons = sc.nextDouble();
		double liters = sc.nextDouble();
		
		System.out.println("farhenheit to celcius "+farhenheitTocelsius(farhenheit));
		System.out.println("celcius to farhenheit "+celsius2farhenheit(celcius));
		System.out.println("pounds to kilograms "+pounds2kilograms(pounds));
		System.out.println("kilograms to pounds "+kilograms2pounds(kilograms));
		System.out.println("gallons to liters "+gallons2liters(gallons));
		System.out.println("liters to gallons "+liters2gallons(liters));
		
	}
	public static double farhenheitTocelsius(double farhenheit){
		return (farhenheit - 32) * 5 / 9;
	}
	public static double celsius2farhenheit(double celcius){
		return (celcius * 9 / 5) + 32;
	}
	public static double pounds2kilograms(double pounds){
		return pounds*0.453592;
	}
	public static double kilograms2pounds(double kilograms){
		return kilograms*2.20462;
	}
	public static double gallons2liters(double gallons){
		return gallons*3.78541;
	}
	public static double liters2gallons(double liters){
		return liters*0.264172;
	}
}