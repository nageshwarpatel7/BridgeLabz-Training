/*
You are given two strings, s1 and s2. Your task is to find the smallest substring in s1 such that s2 appears as a subsequence within that substring.

The characters of s2 must appear in the same sequence within the substring of s1.
If there are multiple valid substrings of the same minimum length, return the one that appears first in s1.
If no such substring exists, return an empty string.
Note: Both the strings contain only lowercase english letters.
*/

public class MinimumWindowSubsequence {
    public String minWindow(String s1, String s2) {
        // code here
        int i=0, j=0, k=0;
        
        int res = Integer.MAX_VALUE;
        
        String str="";
        
        while(j<s1.length() && k<s2.length()){
            if(s1.charAt(j)==s2.charAt(k))
                k++;
            
            if(k==s2.length()){
                i=j;
                k=s2.length()-1;
                
                while(i>=0 && k>=0){
                    if(s1.charAt(i)==s2.charAt(k))
                    k--;
                    i--;
                }
                i++;
                
                if(res>j-i+1){
                    res = j-i+1;
                    str = s1.substring(i,j+1);
                }
                k=0; j=i+1;
            }
            j++;
        }
        return str;
    }
}