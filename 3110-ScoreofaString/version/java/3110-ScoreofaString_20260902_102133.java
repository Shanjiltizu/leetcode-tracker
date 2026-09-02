// Last updated: 9/2/2026, 10:21:33 AM
1class Solution {
2    public int scoreOfString(String s) {
3        char[] chars = s.toCharArray();
4        int score = 0;
5
6        for (int i = 0; i < chars.length - 1; i++) {
7            int diff = chars[i] - chars[i + 1];
8            if (diff >= 0) {
9                score += diff;
10            } else {
11                score -= diff;
12            }
13        }
14
15        return score;
16    }
17}