import java.util.*;

public class LargestElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int cnt =0;
		int temp = num;
		while(temp>0){
			cnt++;
			temp/=10;
		}
		
		int arr[] = new int[cnt];
		temp = num;
		while(temp>0){
			arr[cnt-1] = temp%10;
			cnt--;
			temp/=10;
		}
		
		int large = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		for(int i:arr){
			if(i>large){
				secLargest =large;
				large =i;
			}
			else if(i>secLargest && i!=large)
				secLargest =i;
		}
		System.out.println("\nLargest digit is: "+large);
		System.out.println("Second largest digit is "+secLargest);
	}
}