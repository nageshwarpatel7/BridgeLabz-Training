package hashmap;
import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6};
		int target =6;
		
		int ans[] = findTargerSum(arr, target);
		
		if(ans[0]==-1)
			System.out.println("not pair existed");
		else 
			System.out.println("Pair with target sum "+target+ " is "+arr[ans[0]]+" and "+arr[ans[1]]);;
	}
	
	public static int[] findTargerSum(int arr[], int target) {
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int diff = target -arr[i];
			
			if(mp.containsKey(arr[i])) {
				return new int[] {mp.get(arr[i]),i};
			}
			mp.put(diff, i);
		}
		return new int[] {-1,-1};
	}
}
