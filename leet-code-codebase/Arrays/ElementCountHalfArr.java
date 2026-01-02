public class ElementCountHalfArr {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = -1;
        for(int i: nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
            if(mp.get(i)==n){
                ans = i;
                break;
            }
        }
        return ans;
    }
}