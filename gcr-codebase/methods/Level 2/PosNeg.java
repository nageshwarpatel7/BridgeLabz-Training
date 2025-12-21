import java.util.Scanner;

public class PosNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
			arr[i] = sc.nextInt();
		
		for(int i=0;i<5;i++){
			if(isPositive(arr[i])==true){
				if(isEven(arr[i])==true)
					System.out.println("Even");
				else
					System.out.println("Odd");
			}
			else
				System.out.println("Negative number");
		}
	}
	public static boolean isPositive(int num){
		if(num>=0)
			return true;
		return false;
	}
	public static boolean isEven(int num){
		if(num%2==0)
			return true;
		return false;
	}
	
}