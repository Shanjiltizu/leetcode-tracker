// Last updated: 09/07/2026, 09:49:15
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