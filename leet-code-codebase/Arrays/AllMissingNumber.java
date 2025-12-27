/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/

public class AllMissingNumber{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        int arr[] =new int[n+1];
        for(int i=1;i<=n;i++)
            arr[nums[i-1]]=1;

        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<=n;i++)
            if(arr[i]==0)
                ans.add(i);

        return ans; 
    }
}