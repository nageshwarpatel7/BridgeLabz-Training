import java.util.Scanner;

public class AbundantNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int divisorSum =0;
		int copyNum = num-1;
		while(copyNum>0){
			if(num % copyNum==0)
				divisorSum+=copyNum;
			copyNum--;
		}
		if(divisorSum>num)
			System.out.println("Abundant Number");
		else 
			System.out.println("Not Abundant Number");
		
	}
}