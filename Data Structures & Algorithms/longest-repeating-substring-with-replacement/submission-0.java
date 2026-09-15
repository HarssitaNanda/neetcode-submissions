class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0; int r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        int maxFreq=0;
        while(l<=r && r<n){
            char c=s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

            if((r-l+1) - maxFreq <= k){
                maxLength=Math.max(maxLength,r-l+1);
            }
            else{
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            r++;
        }
        return maxLength;
    }
}