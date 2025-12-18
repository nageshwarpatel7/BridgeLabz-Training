import java.util.Scanner;

public class CalculatorUsingSwitch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		String opt = sc.next();
		
		switch(opt){
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println(num1/num2);
				break;
			default:
				System.out.println("Invalid operator");
				break;
		}
	}
}