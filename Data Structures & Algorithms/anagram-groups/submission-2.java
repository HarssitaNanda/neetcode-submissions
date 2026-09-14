
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String str : strs) {
//             char[] sChar = str.toCharArray();
//             Arrays.sort(sChar);
//             String key = new String(sChar);

//             // Creates the list if absent, then appends the word
//             map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
//         }

//         // map.values() can be passed directly to the ArrayList constructor
//         return new ArrayList<>(map.values());
//     }
// }


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}