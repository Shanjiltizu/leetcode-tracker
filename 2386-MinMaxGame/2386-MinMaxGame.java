// Last updated: 09/07/2026, 09:49:18
class Solution {
    public int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int n = nums.length;
            int[] newArr = new int[n / 2];

            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) {
                    newArr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newArr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }

            nums = newArr;
        }

        return nums[0];
    }
}