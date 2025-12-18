import java.util.*;

class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int fact =1;
		if(num==0)
			System.out.println();
		else{
			while(num>1){
				fact*=num;
				num--;
			}
			System.out.println(fact);
		}
	}
}