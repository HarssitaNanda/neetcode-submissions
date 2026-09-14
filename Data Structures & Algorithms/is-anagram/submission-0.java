class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();

        Arrays.sort(s1); Arrays.sort(t1);

        String s2=""; String t2="";
        for(int i=0;i<s1.length;i++){
            s2+=s1[i];
        }
        for(int i=0;i<t1.length;i++){
            t2+=t1[i];
        }

        return s2.equals(t2);
    }
}
