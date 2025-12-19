import java.util.Scanner;

class DigitSign{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int digit[] = new int[5];
		System.out.print("Enter 5 digits: ");
		for(int i=0;i<5;i++)
			digit[i] = sc.nextInt();
		
		for(int i:digit){
			if(i>0){
				if(i%2==0)
					System.out.println("Even");
				else
					System.out.println("Odd");
			}
			else if(i==0)
				System.out.println("Zero");
			else
				System.out.println("Negative");
		}
		if(digit[0]==digit[4])
			System.out.println("First and last elements are equal");
		else if(digit[0]>digit[4])
			System.out.println("First is greater");
		else
			System.out.println("First is less than last");
	}
}