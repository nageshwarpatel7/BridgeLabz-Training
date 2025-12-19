import java.util.*;

public class LargestAndSecLargeElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long num = sc.nextLong();
		
		int maxsize = 10;
		long arr[] = new long[maxsize];
		long temp = num;
		int i=0;
		long tempArr[];
		while(temp!=0){
			arr[i] = temp%10;
			i++;
			if(i==arr.length-1){
				maxsize*=2;
				tempArr =new long[maxsize];
				for(int x=0;x<arr.length;x++)
					tempArr[x] =arr[x];
				arr = tempArr;
			}
			temp/=10;
		}
		
		long large = 0;
		long secLargest =0;
		for(long j: arr){
			if(j>large){
				secLargest =large;
				large = j;
			}
			else if(j>secLargest && j!=large)
				secLargest =j;
		}
		System.out.println("\nLargest digit is: "+large);
		System.out.println("Second largest digit is "+secLargest);
	}
}