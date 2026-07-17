// Last updated: 7/17/2026, 9:06:23 AM
1import java.util.HashMap;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6        if (pattern.length() != words.length) {
7            return false;
8        }
9        HashMap<Object, Integer> map = new HashMap<>();
10        
11        for (int i = 0; i < pattern.length(); i++) {
12            char ch = pattern.charAt(i);
13            String word = words[i];
14            if (!java.util.Objects.equals(map.put(ch, i), map.put(word, i))) {
15                return false;
16            }
17        }
18        
19        return true;
20    }
21}