import java.util.Scanner;
class SideOfSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter perimeter of square: ");
		float peri = sc.nextFloat();
		float side = peri/4;
		System.out.println("The length of the side is "+side+" whose perimeter is "+peri);
	}
}