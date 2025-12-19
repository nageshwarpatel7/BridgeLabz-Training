import java.util.Scanner;

public class ArraySum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		int i=0;
		while(true){
			System.out.print("Enter a number: ");
			double num = sc.nextDouble();
			if(num==0.0)
				break;
			if(i<10)
				arr[i] = num;
			i++;
		}
		
		double sum =0;
		for(double j:arr)
			sum+=j;
		
		System.out.println("Total sum of numbers is: "+sum);
	}
}