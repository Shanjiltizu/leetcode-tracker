// Last updated: 09/07/2026, 09:50:33
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // match found
            }
            j++; // always move in t
        }

        return i == s.length();
    }
}