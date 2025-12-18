import java.util.Scanner;

public class GradeCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int chem = sc.nextInt();
		int phy = sc.nextInt();
		
		double marks = (math+chem+phy)/3.0;
		if(marks >=80)
			System.out.println("Average Marks: "+marks+" Grade: A, Remark: Level 4, above agency-normalized standards");
		else if(marks>=70)
			System.out.println("Average Marks: "+marks+" Grade: B, Remark: Level 3, at agency-normalized standards");
		else if(marks>=60)
			System.out.println("Average Marks: "+marks+" Grade: C, Remark: Level 2, but approaching agency-normalized standards");
		else if(marks>=50)
			System.out.println("Average Marks: "+marks+" Grade: D, Remark: Level 1, well below agency-normalized standards");
		else if(marks>=40)
			System.out.println("Average Marks: "+marks+" Grade: E, Remark: Level 1-, too below agency-normalized standards");
		else
			System.out.println("Average Marks: "+marks+" Grade: R, Remark: Remedial standars");
	}
}