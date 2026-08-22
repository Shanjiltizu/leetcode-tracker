// Last updated: 8/22/2026, 3:54:56 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int [] sol = Arrays.copyOf(nums,nums.length*2);
4        int index = nums.length;
5        for(int i = index-1; i >= 0; i--){
6            sol[index++] = nums[i];
7        }
8         return sol;
9    }
10}