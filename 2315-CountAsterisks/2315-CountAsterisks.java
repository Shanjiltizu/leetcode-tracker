// Last updated: 9/10/2026, 9:19:23 AM
class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean inside = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                inside = !inside; // toggle
            } else if (c == '*' && !inside) {
                count++;
            }
        }

        return count;
    }
}