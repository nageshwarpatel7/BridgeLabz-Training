// importing package
import java.util.Scanner;
// created class with name AgeCalculation indicating the purpose is to display Age of Herry.
class AgeCalculation{
	public static void main(String args[]){
		
		// Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year of birth");
		// Creating a variable birthYear for Taking input year of Herry
		int birthYear = sc.nextInt();
		
		//Creating a variable currentAge indicating Herry's age in 2024
		int currentAge = 2024-birthYear;
		
		//Print the Herry's Age
		System.out.println("Harry's age in 2024 is "+currentAge);
	}
}