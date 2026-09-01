// Last updated: 01/09/2026, 13:55:00
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int blocks = n / 8;
        return (blocks * (blocks + 1) * 4)
                + (n % 8) * (blocks + 1);
    }
}