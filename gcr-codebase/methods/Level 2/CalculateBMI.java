import java.util.*;

public class CalculateBMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of 10 persons: ");
		int weights[] = new int[10];
		
		for(int i=0;i<10;i++)
			weights[i] = sc.nextInt();
		
		System.out.print("Enter heights of these persons(in cm): ");
		int heights[] = new int[10];
		
		for(int i=0;i<10;i++)
			heights[i] = sc.nextInt();
		
		for(int i=0;i<10;i++){
			System.out.println("Person"+i+" is " + calculateBmi(weights[i],heights[i]));
		}
	}
	public static String calculateBmi(int weight, int height){
		double heightInMeters = height/100.0;
		
		double bmi = weight/(heightInMeters*heightInMeters);
		if(bmi>=40)
			return "Obese";
		else if(bmi>=25)
			return "Overweight";
		else if(bmi>=18.5)
			return "Normal";
		else
			return "Underweight";
	}
}