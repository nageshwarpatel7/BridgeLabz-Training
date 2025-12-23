import java.util.*;

public class TempeCoverter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature in fahrenheit: ");
		double temp1 = sc.nextDouble();
		
		System.out.print("Enter temperatur in celcius: ");
		double temp2 = sc.nextDouble();
		
		System.out.println("Temperature in celicus is: "+fahrenToCelci(temp1));
		System.out.println("Temperature in fahrenheit is: "+celciToFahren(temp2));
	}
	
	public static double fahrenToCelci(double temp){
		double celci = (temp-32)*5/9;
		return celci;
	}
	public static double celciToFahren(double temp){
		double fahren = (temp*9/5)+32;
		return fahren;	
	}
}