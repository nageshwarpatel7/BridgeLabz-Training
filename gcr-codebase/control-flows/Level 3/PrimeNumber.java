import java.util.Scanner;

class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=1)
			System.out.println("Not Prime");
	else if(num==2 || num==3)
		System.out.println("Prime number");
		else{
			boolean isPrime = true;
			for(int i=3;i<num;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
				System.out.println("Prime Number");
			else
				System.out.println("Not Prime");
		}
	}
}