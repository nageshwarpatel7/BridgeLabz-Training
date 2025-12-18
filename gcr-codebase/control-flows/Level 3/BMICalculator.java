import java.util.Scanner;

public class BMICalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		height= height/100;
		double bmi = weight/(height*height);
		if(bmi>=40)
			System.out.println("Obese");
		else if(bmi>=25)
			System.out.println("Overweight");
		else if(bmi>18.5)
			System.out.println("Normal");
		else
			System.out.println("Underweight");
	}
}