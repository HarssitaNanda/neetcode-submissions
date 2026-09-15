class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0; int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        while(l<=r && r<n){
            char c=s.charAt(r);
            if(!map.containsKey(c)){
                map.put(c,1);
                 maxLength=Math.max(maxLength,r-l+1);
                 r++;
            }
            else{
                map.remove(s.charAt(l));
               
                 l++;
            }
           
        }
        return maxLength;
    }
}
