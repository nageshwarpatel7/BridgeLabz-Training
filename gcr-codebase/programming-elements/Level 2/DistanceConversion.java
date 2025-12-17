import java.util.*;
class DistanceConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double feet= sc.nextDouble();
		double yard = feet/3;
		double mile = yard/1760;
		System.out.println("The distance in yards is "+yard+" while the distance in miles is "+mile);
	}
}