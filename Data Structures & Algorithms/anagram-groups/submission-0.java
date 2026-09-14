import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sChar = str.toCharArray();
            Arrays.sort(sChar);
            String key = new String(sChar);

            // Creates the list if absent, then appends the word
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // map.values() can be passed directly to the ArrayList constructor
        return new ArrayList<>(map.values());
    }
}