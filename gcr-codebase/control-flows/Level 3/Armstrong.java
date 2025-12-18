import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		double x= 0;
		int y = num;
		int cnt =0;
		while(y>0){
		     cnt++;
			y/=10;
		}
		int z = num;
		while(z>0){
		   x+=Math.pow(z%10,cnt);
		   z/=10;
		}
		if(num==x)
		 System.out.println("Is Armstrong number");
		else
		 System.out.println("Not Armstrong");
	}
}
