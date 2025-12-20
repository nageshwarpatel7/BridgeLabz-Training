import java.util.*;

public class StudentVoteChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ages of 10 students: ");
		int stu[] = new int[10];
		
		for(int i=0;i<10;i++)
			stu[i] = sc.nextInt();
		
		for(int i=0;i<10;i++){
			if(canStudentVote(stu[i])==true)
				System.out.println("Student can vote");
			else
				System.out.println("Student cannot vote");
		}
		
	}
	public static boolean canStudentVote(int age){
		if(age>=18)
			return true;
		return false;
	}
}