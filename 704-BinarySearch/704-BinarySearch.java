// Last updated: 9/10/2026, 9:21:31 AM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
     return -1;   
    }
}