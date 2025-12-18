import java.util.*;

public class DigitCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt =0;
		int x=num;
		while(num>0){
			cnt++;
			num/=10;
		}
		System.out.println("Total number of digit in "+x+" is "+cnt);
	}
}