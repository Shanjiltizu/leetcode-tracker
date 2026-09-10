// Last updated: 9/10/2026, 9:20:03 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) return word;

        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();

        return sb.toString() + word.substring(index + 1);
    }
}