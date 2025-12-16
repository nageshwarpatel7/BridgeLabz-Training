import java.util.*;
class PowerCalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = sc.nextInt();
		System.out.print("Enter exponent: ");
		int expo = sc.nextInt();
		int ans = (int)Math.pow(base,expo);
		System.out.println(ans);
	}
}