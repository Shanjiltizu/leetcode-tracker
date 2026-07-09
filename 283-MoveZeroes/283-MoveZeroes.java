// Last updated: 09/07/2026, 09:50:49
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        // Move non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Fill remaining with zeros
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}