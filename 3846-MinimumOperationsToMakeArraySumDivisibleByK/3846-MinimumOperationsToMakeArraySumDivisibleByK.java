// Last updated: 01/09/2026, 13:54:40
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