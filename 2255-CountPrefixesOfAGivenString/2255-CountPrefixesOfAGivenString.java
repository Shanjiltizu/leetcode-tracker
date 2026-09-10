// Last updated: 9/10/2026, 9:19:46 AM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }

        return count;
    }
}