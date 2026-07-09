// Last updated: 09/07/2026, 09:50:45
class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }

        return dp;
    }
}