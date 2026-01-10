public class CountSubarraysWithKOdds {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int left =0;
        
        int odd_cnt=0;
        int ans =0;
        int temp =0;
        
        
        for(int right=0; right<arr.length; right++){
            if(arr[right]%2==1){
                odd_cnt++;
                temp=0;
            }
            
            while(odd_cnt==k){
                temp++;
                if(arr[left]%2==1){
                    odd_cnt--;
                }
                left++;
            }
            ans+=temp;
        }
        return ans;
    }
}
