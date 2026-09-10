// Last updated: 9/10/2026, 9:19:43 AM
class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for (int n : nums) {
            if (Math.abs(n) < Math.abs(ans) ||
               (Math.abs(n) == Math.abs(ans) && n > ans)) {
                ans = n;
            }
        }

        return ans;
    }
}