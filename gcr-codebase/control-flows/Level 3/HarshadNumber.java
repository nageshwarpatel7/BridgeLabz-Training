import java.util.Scanner;

class HarshadNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x= num;
		int digitSum = 0;
		while(x>0){
			digitSum+= x%10;
			x/=10;
		}
		if(num%digitSum==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not Harshad Number");
	}
}