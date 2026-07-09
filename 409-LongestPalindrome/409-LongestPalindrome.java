// Last updated: 09/07/2026, 09:50:30
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                length += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) length += 1;

        return length;
    }
}