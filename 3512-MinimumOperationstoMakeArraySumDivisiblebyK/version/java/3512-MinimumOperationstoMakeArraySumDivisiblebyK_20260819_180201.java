// Last updated: 8/19/2026, 6:02:01 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4        for(int i:nums)
5        {
6            sum+=i;
7        }
8        return sum%k;
9    }
10}