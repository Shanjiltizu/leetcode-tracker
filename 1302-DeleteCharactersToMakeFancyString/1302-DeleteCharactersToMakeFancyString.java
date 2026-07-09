// Last updated: 09/07/2026, 09:49:58
class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = result.length();

            if (len >= 2 &&
                result.charAt(len - 1) == c &&
                result.charAt(len - 2) == c) {
                continue; // skip
            }

            result.append(c);
        }

        return result.toString();
    }
}