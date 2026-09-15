class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0; int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        while(l<=r && r<n){
            maxLength=Math.max(maxLength,r-l+1);
            char c=s.charAt(r);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.remove(s.charAt(l));
                 l++;
            }
            
            r++;
        }
        return maxLength;
    }
}
