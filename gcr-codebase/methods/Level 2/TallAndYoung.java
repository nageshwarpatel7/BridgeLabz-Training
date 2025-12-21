import java.util.Scanner;

public class TallAndYoung{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age[] = new int[3];
		int height[] = new int[3];
		
		System.out.print("Enter age of Amar: ");
		age[0] = sc.nextInt();
		
		System.out.print("Enter age of Akbar: ");
		age[1] = sc.nextInt();
		
		System.out.print("Enter age of Anthony: ");
		age[2] = sc.nextInt();
		
		System.out.print("height age of Amar: ");
		height[0] = sc.nextInt();
		
		System.out.print("height age of Akbar: ");
		height[1] =sc.nextInt();
		
		System.out.print("height age of Anthony: ");
		height[2] = sc.nextInt();
		
		System.out.println("Tallest friend is: "+tallest(height));
		System.out.println("Youngest friend is: "+youngest(age));
		
	}
	public static String tallest(int height[]){
		if(height[0]>height[1] && height[0]>height[2])
			return "Amar";
		else if(height[1]>height[0]  && height[1]>height[2])
			return "Akbar";
		else 
			return "Anthony";
	}
	public static String youngest(int age[]){
		if(age[0]>age[1] && age[0]>age[2])
			return "Amar";
		else if(age[1]>age[0]  && age[1]>age[2])
			return "Akbar";
		else 
			return "Anthony";
	}
}