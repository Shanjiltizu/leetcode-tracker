// Last updated: 8/19/2026, 6:09:45 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int c=0;
4        for(int i:nums)
5        {
6            if(i%3!=0)
7            {
8                c++;
9            }
10        }
11        return c;
12    }
13}