import java.util.Scanner;

public class Factors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxsize = 10;
		int factors[] = new int[maxsize];
		int cnt =0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				if(cnt==maxsize){
					maxsize*=2;
					int temp[] = new int[maxsize];
					for(int j=0;j<factors.length;j++)
						temp[j] = factors[j];
					factors = temp;
					factors[cnt] = i;
					cnt++;
				}
				else{
					factors[cnt] =i;
					cnt++;
				}
			}
		}
		System.out.print("Factors of "+num+" are: ");
		for(int i: factors)
			System.out.print(i+" ");
		System.out.println();
	}
}