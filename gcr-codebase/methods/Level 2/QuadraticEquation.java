import java.util.*;

public class QuadraticEquation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of equation (a, b, c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double[] ans = calcRoots(a, b, c);
        
        if (ans == null) {
            System.out.println("This equation doesn't have any real roots");
        } else if (ans[0] == ans[1]) {
            System.out.println("This quadratic equation has only one root: " + ans[0]);
        } else {
            System.out.println("Roots of this equation are: " + ans[0] + " and " + ans[1]);
        }
    }

    public static double[] calcRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c; 
        
        if (delta < 0) {
            return null; 
        }
        
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt(delta)) / (2 * a); 
        roots[1] = (-b - Math.sqrt(delta)) / (2 * a); 
        
        return roots;
    }
}
