import java.util.*;

public class ReverseNumber{
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
		int i=0;
		while(num>0){
			arr[i] =num%10;
			i++;
			num/=10;
		}
		
		System.out.println("Reverse of the number is: "+Arrays.toString(arr));
	}
}