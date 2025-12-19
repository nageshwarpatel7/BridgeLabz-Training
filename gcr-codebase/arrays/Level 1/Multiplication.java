import java.util.Scanner;

class Multiplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter a number between 6 to 9: ");
		int num = sc.nextInt();
		if(num<6 || num>9)
			System.out.println("Invalid Input");
		else{
			for(int i=1;i<=10;i++)
				arr[i-1] = num*i;
			
			for(int i=1;i<=10;i++)
				System.out.println(num+" * "+i+" = "+arr[i-1]);
			
		}
	}
}