// Last updated: 09/07/2026, 09:49:26
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