// Last updated: 8/3/2026, 4:31:48 PM
1class Solution {
2    public boolean predictTheWinner(int[] A) {
3        int n = A.length;
4        if ((n & 1) == 0) return true;
5
6        int[][] dp = new int[n][n];
7        for (int[] r : dp) 
8            Arrays.fill(r, -1);
9        
10        return maxDiff(0, n - 1, A, dp) >= 0;
11    }
12
13    private int maxDiff(int i, int j, int[] A, int[][] dp) {
14        if (dp[i][j] != -1) return dp[i][j];        
15        if (i == j) return dp[i][j] = A[i];
16        
17        return dp[i][j] = Math.max(
18            A[i] - maxDiff(i + 1, j, A, dp),
19            A[j] - maxDiff(i, j - 1, A, dp)
20        );
21    }
22}