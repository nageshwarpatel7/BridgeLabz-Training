/*

Given two sorted arrays a[] and b[] and an element k, 
the task is to find the element that would be at the kth position of the combined sorted array.

*/

public class KthElement {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        
        int i=0;
        int j=0;
        int cnt=0;
        
        while(i<n && j<m){
            if(cnt+1 ==k)
                return Math.min(a[i], b[j]);
                
            if(a[i]<=b[j])
                i+=1;
            else if(b[j]<=a[i])
                j+=1;
            cnt+=1;
        }
        
        while(i<n){
            if(cnt+1 ==k)
                return a[i];
            i+=1;
            cnt+=1;
        }
        
        while(j<m){
            if(cnt+1 ==k)
                return b[j];
            j+=1;
            cnt+=1;
        }
        return Math.min(a[i],b[j]);
    }
}