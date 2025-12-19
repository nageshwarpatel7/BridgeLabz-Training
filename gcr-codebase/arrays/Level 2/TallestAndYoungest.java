import java.util.Scanner;

public class TallestAndYoungest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int ages[] = new int[3];
		int heights[] = new int[3];
		
		System.out.println("Enter ages of Amar, Akbar, and Anthony respectively : ");
		for(int i=0;i<3;i++)
			ages[i] = sc.nextInt();
		
		System.out.println("Enter heights of Amar, Akbar, and Anthony respectively : ");
		for(int i=0;i<3;i++)
			heights[i] = sc.nextInt();
		
		if(ages[1]<ages[0] && ages[1]<ages[2])
			System.out.println("Youngest friend is: Akbar");
		else if(ages[0]<ages[1] && ages[0]<ages[2])
			System.out.println("Youngest friend is: Amar");
		else
			System.out.println("Youngest friend is: Anthony");
		
		if(heights[1]>heights[0] && heights[1]>heights[2])
			System.out.println("Tallest friend is: Akbar");
		else if(heights[0]>heights[1] && heights[0]>heights[2])
			System.out.println("Tallest friend is: Amar");
		else 
			System.out.println("Tallest friend is: Anthony");
	}
}