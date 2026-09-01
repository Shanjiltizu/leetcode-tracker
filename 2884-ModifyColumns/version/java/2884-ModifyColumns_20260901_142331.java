// Last updated: 01/09/2026, 14:23:31
1class Solution {
2    static public int mirrorDistance(int n) {
3        int rev=0;
4        for(int x=n; x>0; x/=10){
5            rev=10*rev+x%10;
6        }
7        return Math.abs(rev-n);
8    }
9}