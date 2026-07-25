// Last updated: 7/25/2026, 3:57:00 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max = -1;
4        String str = n + "";
5        for(int i = 0 ; i < str.length() ; i++){
6            for(int j = i + 1 ; j < str.length() ; j++){
7                int d1 = str.charAt(i) - '0';
8                int d2 = str.charAt(j) - '0';
9                max = Math.max(max , d1 * d2);
10            }
11        }
12        return max;
13    }
14}