package hashmap;

import java.util.*;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int nums[] = {100,4,200,1,3,2};
		
		int ans = longestSequence(nums);
		System.out.println("Longest consecutive sequence in given array is: "+ans);
	}
	
	public static int longestSequence(int[] arr) {
		int n = arr.length;
		Set<Integer> st = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			st.add(arr[i]);
		}
		
		int ans =0;
		
		for(int i=0;i<n; i++) {
			
			if(!st.contains(arr[i]-1)) {
				int curr =arr[i];
				int cnt =0;
				while(st.contains(curr)) {
					cnt+=1;
					curr+=1;
				}
				ans = Math.max(ans, cnt);
			}
		}
		return ans;
	}
}
