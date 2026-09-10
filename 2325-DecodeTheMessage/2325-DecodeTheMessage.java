// Last updated: 9/10/2026, 9:19:20 AM
class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] used = new boolean[26];

        char ch = 'a';

        // build mapping
        for (char c : key.toCharArray()) {
            if (c != ' ' && !used[c - 'a']) {
                map[c - 'a'] = ch;
                used[c - 'a'] = true;
                ch++;
            }
        }

        String result = "";

        // decode message
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                result += " ";
            } else {
                result += map[c - 'a'];
            }
        }

        return result;
    }
}