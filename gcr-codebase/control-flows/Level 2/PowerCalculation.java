import java.util.Scanner;

class PowerCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int base = sc.nextInt();
		
		System.out.print("Enter Power: ");
		int power = sc.nextInt();
		
		if(power==0)
			System.out.println(1);
		else{
			int ans =1;
			for(int i=1;i<=power;i++)
				ans*=base;
			System.out.println(ans);
		}
	}
}