// Last updated: 09/07/2026, 09:52:39
class Solution {
    public boolean canJump(int[] nums) {

        int maxi = 0;
        int n = nums.length;

        for(int i = 0; i < nums.length; i++){
            maxi = Math.max(maxi, i + nums[i]);

            if(maxi == n - 1) break;

            if(i == maxi) return false;
        }

        return true;
    }
}