/*
Given an integer array nums, return the third distinct maximum number in this array. 
If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
*/



import java.util.*;
public class ThirdMaxNum{
    public int thirdMax(int[] nums) {
        Integer mx = null;
        Integer sec_mx = null;
        Integer third_mx = null;

        for(Integer i:nums){
            if(i.equals(mx) || i.equals(sec_mx) || i.equals(third_mx)) continue;
            if(mx==null || i>mx){
                third_mx =sec_mx;
                sec_mx = mx;
                mx = i;
            }
            else if(sec_mx== null || i>sec_mx){
                third_mx = sec_mx;
                sec_mx = i;
            }
            else if(third_mx ==null || i> third_mx)
                third_mx = i;
        }
        return third_mx == null ? mx : third_mx;
    }
}