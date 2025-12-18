import java.util.Scanner;

class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 6 to 9: ");
		int n = sc.nextInt();
		if(n>=6 && n<=9)
			for(int i=1;i<=10;i++)
				System.out.println(n+" * "+i+" = "+n*i);
		else
			System.out.println("Number is not between 6 to 9");
	}
}