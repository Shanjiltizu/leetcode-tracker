// Last updated: 9/10/2026, 9:19:58 AM
class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            }
            if (c == 'a' && seenB) {
                return false;
            }
        }

        return true;
    }
}
