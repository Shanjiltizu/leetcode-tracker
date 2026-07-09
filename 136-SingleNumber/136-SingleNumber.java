// Last updated: 09/07/2026, 09:51:37
class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num:nums)
        {
            result^=num;

        }
        return result;
        
    }
}