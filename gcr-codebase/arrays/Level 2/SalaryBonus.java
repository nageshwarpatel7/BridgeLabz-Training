import java.util.*;

public class SalaryBonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double arr[][] = new double[10][2];
		for(int i=0;i<10;i++){
			System.out.print("Enter employee Salary: ");
			arr[i][0] = sc.nextDouble();
			while(arr[i][0]<0){
				System.out.print("Enter valid employee Salary: ");
				arr[i][0] = sc.nextDouble();
			}
			System.out.print("Enter employee service years: ");
			arr[i][1] = sc.nextDouble();
			
			while(arr[i][1]<0){
				System.out.print("Enter valid employee service years: ");
				arr[i][1] = sc.nextDouble();
			}
		}
		
		double bonus[][] = new double[10][2];
		for(int i=0;i<10;i++){
			if(arr[i][1]<5){
				bonus[i][0] = arr[i][0];
				bonus[i][1] = arr[i][0]*0.02;
			}
			else{
				bonus[i][0] = arr[i][0];
				bonus[i][1] = arr[i][0]*0.05;
			}				
		}
		
		for(int i=0;i<10;i++)
			System.out.println("Employees salary is: "+bonus[i][0]+" and bonus is "+bonus[i][1]);
		
	}
}