// Last updated: 9/7/2026, 3:10:25 PM
1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int ans = 0; 
4        int xor = start ^ goal;
5
6        while(xor!=0){
7            ans += xor & 1;
8
9            xor >>=1;
10        }
11        return ans;
12    }
13}