import java.util.Scanner;

public class HeightConversion{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int heightIncm = input.nextInt();
		double heightInInches = heightIncm/2.54;
		double heightInFeets = heightInInches/12;
		System.out.println("Your Height in cm is "+heightIncm+" while in foot is "+heightInFeets+" and inches is "+heightInInches);
	}
}