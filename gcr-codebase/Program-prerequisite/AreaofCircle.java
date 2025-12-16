import java.util.Scanner;
class AreaofCircle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		final double pie = 3.14;
		System.out.print("Enter the radius of circle: ");
		int redii = sc.nextInt();
		double area = pie*redii*redii;
		System.out.println("Area of circle of redii "+redii+" is: "+area);
	}
}