import java.util.Scanner;
class CylinderVolume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder: ");
		double radii = sc.nextInt();
		System.out.print("Enter the height of cylinder: ");
		double height =sc.nextInt();
		double volume = 3.14*radii*radii*height;
		System.out.println("The volume of cylinder: "+volume);
	}
}