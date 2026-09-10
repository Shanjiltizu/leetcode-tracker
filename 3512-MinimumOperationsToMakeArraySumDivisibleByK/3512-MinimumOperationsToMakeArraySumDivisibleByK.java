// Last updated: 9/10/2026, 9:18:24 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        return sum%k;
    }
}