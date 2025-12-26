/*
Given a sorted array of distinct positive integers arr[], You need to find the kth positive number that is missing from the arr[].

Examples:

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.
*/

public class KthMissingEle {
    public int kthMissing(int[] arr, int k) {
        // code here
        
        int cnt =0;
        int idx = 0;
        int curr=1;
        
        while(true){
            if(idx<arr.length && curr==arr[idx])
                idx+=1;
                
            else{
                cnt+=1;
                if(cnt==k)
                    return curr;
            }
            curr+=1;
        }
    }
}