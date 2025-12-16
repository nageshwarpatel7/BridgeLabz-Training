import java.util.Scanner;
class KiloToMile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter kilometer to convert in miles: ");
		double Kilometers = sc.nextDouble();
		double miles = Kilometers * 0.621371;
		System.out.println(Kilometers+" Kilometers = "+miles+" Miles");
	}
}