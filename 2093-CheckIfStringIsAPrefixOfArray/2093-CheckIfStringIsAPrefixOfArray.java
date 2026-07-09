// Last updated: 09/07/2026, 09:49:36
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