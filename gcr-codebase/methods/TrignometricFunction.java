import java.util.*;

public class TrignometricFunction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle: ");
		double angle = sc.nextDouble();
		
		double ans[] = calculateTrigonometricFunctions(angle);
		System.out.println("Sine value: "+ans[0]);
		System.out.println("Cosine value: "+ans[1]);
		System.out.println("tangent value: "+ans[2]);
	}
	public static double[] calculateTrigonometricFunctions(double angle){
		double radian = Math.toRadians(angle);
		double ans[] = new double[3];
		ans[0] = Math.sin(radian);
		ans[1] = Math.cos(radian);
		ans[2] = Math.tan(radian);
		return ans;
	}
}