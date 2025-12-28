/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
*/

public class NegativeCnt{
    public int countNegatives(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;

        int cnt =0;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(grid[i][j]<0)
                cnt++;
            }
        }
        return cnt;
    }
}