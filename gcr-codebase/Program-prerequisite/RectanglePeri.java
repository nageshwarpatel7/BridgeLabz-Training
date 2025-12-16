import java.util.*;
class RectanglePeri{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght: ");
		double l= sc.nextDouble();
		System.out.print("Enter the width: ");
		double b= sc.nextDouble();
		double peri = 2*(l+b);
		System.out.println("The perimeter is: "+peri);
	}
}