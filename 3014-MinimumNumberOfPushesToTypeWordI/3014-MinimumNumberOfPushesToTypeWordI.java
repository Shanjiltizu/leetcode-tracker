// Last updated: 9/10/2026, 9:18:50 AM
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int blocks = n / 8;
        return (blocks * (blocks + 1) * 4)
                + (n % 8) * (blocks + 1);
    }
}