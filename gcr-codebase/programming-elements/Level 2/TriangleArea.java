import java.util.Scanner;
public class TriangleArea{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double base = input.nextDouble();
		double height = input.nextDouble();
		double area = triArea(base,height);
		
		System.out.println("Area of Triangle with base "+base+" and height "+height+" is "+area);
	}
	public static double triArea(double b, double h){
		return 0.5*b*h;
	}
}