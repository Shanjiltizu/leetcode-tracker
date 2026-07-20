// Last updated: 20/07/2026, 10:06:57
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Object, Integer> map = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (!java.util.Objects.equals(map.put(ch, i), map.put(word, i))) {
                return false;
            }
        }
        
        return true;
    }
}