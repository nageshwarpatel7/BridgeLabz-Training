/* 

You are given an array apple of size n and an array capacity of size m.

There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

Note that, apples from the same pack can be distributed into different boxes.

 

Example 1:

Input: apple = [1,3,2], capacity = [4,3,1,5,2]
Output: 2
Explanation: We will use boxes with capacities 4 and 5.
It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.
Example 2:

Input: apple = [5,5,5], capacity = [2,4,2,7]
Output: 4
Explanation: We will need to use all the boxes. 

*/

import java.util.*;
public class AppleDistribution{
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int total = 0;
        for(int i: apple)
            total+=i;
        
        int cnt=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(total<=0)
                return cnt;
            
            total-= capacity[i];
            cnt++;
        }
        return cnt;
    }
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter no. of apple packs: ");
		int n = sc.nextInt();	
		int[] apple = new int[n];
		
		System.out.print("Enter no. of containers: ");
		int m = sc.nextInt();
		int capacity[]  = new int[m];
		
		System.out.print("Enter apple in " +n+ " packs: ");
		for(int i=0;i<n;i++)
			apple[i] = sc.nextInt();
		
		System.out.print("Enter capacity of "+n+" boxes: ");
		for(int i=0;i<n;i++)
			capacity[i] =sc.nextInt();
		
		AppleDistribution dist = new AppleDistribution();
		
		int ans = dist.minimumBoxes(apple, capacity);
		System.out.println("Output: "+ans);
	}
}