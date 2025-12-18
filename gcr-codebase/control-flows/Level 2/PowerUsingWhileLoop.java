import java.util.*;

class PowerUsingWhileLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		if(power==0)
			System.out.println(1);
		else{
			int ans =1;
			while(power>0){
				ans*=base;
				power-=1;
			}
			System.out.println(ans);
		}
	}
}