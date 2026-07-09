// Last updated: 09/07/2026, 09:53:18
class Solution {
    public int removeDuplicates(int[] nums) {   int y = 0;
        for (int i = 0; i < nums.length; i++) {
         
            if (nums[i] != nums[y]) {
                y++;
                nums[y] = nums[i];

            }
        
        }
          return y+ 1;
    }
}