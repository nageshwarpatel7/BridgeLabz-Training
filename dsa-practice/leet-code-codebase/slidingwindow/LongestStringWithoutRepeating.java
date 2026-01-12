
public class LongestStringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        
        int ans =0;
        Set<Character> st = new HashSet<>();

        int left =0;
        for(int ed=0;ed<s.length(); ed++){
            if(st.contains(s.charAt(ed))){

                while(s.charAt(left)!=s.charAt(ed)){
                    st.remove(s.charAt(left));
                    left++;
                }
                st.remove(s.charAt(left));
                left++;
                st.add(s.charAt(ed));
                ans = Math.max(ans, ed-left+1);
            }
            else{
                st.add(s.charAt(ed));
                ans = Math.max(ans, ed-left+1);
            }
        }
        return ans;
    }
}