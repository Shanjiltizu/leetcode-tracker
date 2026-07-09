// Last updated: 09/07/2026, 09:51:28
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }

        return result;
    }
}