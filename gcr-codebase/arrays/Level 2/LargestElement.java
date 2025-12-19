import java.util.*;

public class LargestElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long num = sc.nextLong();
		
		
		long arr[] = new long[10];
		long temp = num;
		int i=0;
		while(temp>0){
			arr[i] = temp%10;
			i++;
			if(i==10)
				break;
			temp/=10;
		}
		
		long large = Integer.MIN_VALUE;
		long secLargest = Integer.MIN_VALUE;
		for(int j=0;j<10;j++){
			if(arr[j]>large){
				secLargest =large;
				large = arr[j];
			}
			else if(arr[j]>secLargest && arr[j]!=large)
				secLargest =arr[j];
		}
		System.out.println("\nLargest digit is: "+large);
		System.out.println("Second largest digit is "+secLargest);
	}
}