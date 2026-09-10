// Last updated: 9/10/2026, 9:21:26 AM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
         int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
             max=Math.max(max,nums[i]);
        }
        return(max-k)-(min+k)<0?0:(max-k)-(min+k);
        
    }
}