import java.util.Scanner;
class CelciToFeren{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in celcius: ");
		double temp = sc.nextDouble();
		double feren = (temp*9/5)+32;
		System.out.println(temp+" degree celcius in fehrenheit is: "+feren);
	}
}