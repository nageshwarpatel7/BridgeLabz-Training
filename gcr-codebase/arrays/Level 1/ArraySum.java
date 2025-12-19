import java.util.Scanner;

public class ArraySum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		
		for(int i=0;i<10;i++){
			System.out.print("Enter a number: ");
			double num = sc.nextDouble();
			if(num==0.0)
				break;
			arr[i] = num;
		}
		
		double sum =0;
		for(double i:arr)
			sum+=i;
		
		System.out.println("Total sum of numbers is: "+sum);
	}
}