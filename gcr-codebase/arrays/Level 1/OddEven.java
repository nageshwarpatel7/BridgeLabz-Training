import java.util.*;

class OddEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int oddArr[];
		if(num%2==0)
		  oddArr= new int[num/2];
		else
			oddArr = new int[num/2+1];
		
		int evenArr[] = new int[num/2];
		int eve =0;
		int odd =0;
		for(int i =1;i<=num;i++){
			if(i%2==0){
				evenArr[eve]=i;
				eve++;
			}
			else{
				oddArr[odd]=i;
				odd++;
			}
		}
		System.out.print("Even numbers : ");
		for(int i=0;i<eve;i++)
			System.out.print(evenArr[i]+" ");
		System.out.println();
		
		System.out.print("Odd numbers: ");
		for(int i=0;i<odd;i++)
			System.out.print(oddArr[i]+" ");
		System.out.println();
	}
}