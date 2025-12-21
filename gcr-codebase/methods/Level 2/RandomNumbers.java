import java.util.*;

public class RandomNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total random number you wants! ");
		int num = sc.nextInt();
		
		int arr[] = generate4DigitRandomArray(num);
		
		double ans[] = findAverageMinMax(arr);
		
		System.out.println("Average of random numbers is: "+ans[0]);
		System.out.println("Maximum of random numbers is: "+ans[1]);
		System.out.println("Mininum of random numbers is: "+ans[2]);
		
	}
	public static int[] generate4DigitRandomArray(int num){
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
			arr[i] = (int) (Math.random()*9000)+1000;
		
		return arr;
	}
	public static double[] findAverageMinMax(int[] numbers) {
		int max =numbers[0];
		int min =numbers[0];
		
		int sm =0;
		for(int i=0;i<numbers.length;i++){
			max = Math.max(max, numbers[i]);
			min = Math.min(min, numbers[i]);
			sm+= numbers[i];
		}
		
		double avg = sm/numbers.length;
		
		double ans[] = {avg,max,min};
		return ans;
	}
}