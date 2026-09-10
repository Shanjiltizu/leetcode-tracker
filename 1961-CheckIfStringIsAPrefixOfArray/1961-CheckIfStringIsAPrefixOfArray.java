// Last updated: 9/10/2026, 9:20:11 AM
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String result = "";

        for (String word : words) {
            result += word;

            if (result.equals(s)) return true;
            if (result.length() > s.length()) return false;
        }

        return false;
    }
}