import java.util.*;

public class CheckCollinear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first point coordinates: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.print("Enter Second point coordinates: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.print("Enter third point coordinates: ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		boolean collinear = isCollinear(x1, x2, x3, y1, y2, y3);
		System.out.println("These points are collinear: "+collinear);
		
		System.out.println("These points are collinear using triangulation formula: "+isCollinearTriangleFormula(x1, x2, x3, y1, y2, y3));
	}
	
	public static boolean isCollinear(int x1,int x2, int x3, int y1, int y2, int y3){
		double ab = (y2-y1)/(x2-x1);
		double bc = (y3-y2)/(x3-x2);
		double ac = (y3-y1)/(x3-x1);
		
		return ((ab==bc) && (bc==ac));
	}
	public static boolean isCollinearTriangleFormula(int x1, int x2, int x3, int y1, int y2, int y3){
		double ans =0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		
		return ans ==0;
	}
}