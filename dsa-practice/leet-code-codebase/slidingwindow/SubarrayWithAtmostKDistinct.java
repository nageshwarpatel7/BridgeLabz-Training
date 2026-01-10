public class SubarrayWithAtmostKDistinct {
    public int countAtMostK(int arr[], int k) {
        // code here
        if(k==0)
        return 0;
        
        int ans =0;
        int left =0;
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int right=0;right<arr.length;right++){
            mp.put(arr[right], mp.getOrDefault(arr[right],0)+1);
            
            while(mp.size()>k){
                mp.put(arr[left], mp.get(arr[left])-1);
                
                if(mp.get(arr[left])==0){
                    mp.remove(arr[left]);
                }
                left++;
            }
            ans+= (right-left+1);
        }
        return ans;
    }
}