import java.util.Scanner;

public class EligibleForVoting{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int stuAge[] = new int[10];
		System.out.print("Enter the ages of all 10 Students: ");
		for(int i=0;i<10;i++)
			stuAge[i] = sc.nextInt();
		
		for(int i=0;i<10;i++){
			if(stuAge[i]<=0)
				System.out.println("Invalid Age");
			else if(stuAge[i]>=18)
				System.out.println("The student with the age "+stuAge[i]+" can vote");
			else
				System.out.println("The student with the age "+stuAge[i]+" cannot vote");
		}
	}
}