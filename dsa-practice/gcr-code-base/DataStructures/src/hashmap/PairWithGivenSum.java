package hashmap;
import java.util.*;

public class PairWithGivenSum {
	public static boolean isPairAvailable(int arr[], int target) {
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0;i<arr.length; i++) {
			int diff = target - arr[i];
			
			if(mp.containsKey(arr[i]))
				return true;
			mp.put(diff, arr[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6};
		int target =6;
		
		boolean ans = isPairAvailable(arr, target);
		
		if(ans==true)
			System.out.println("Pair with target sum "+target+" is available");
		else
			System.out.println("No pair with targer sum is available");
	}
}
