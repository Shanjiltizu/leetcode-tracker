// Last updated: 9/11/2026, 4:30:08 PM
1class Solution {
2    public int[] transformArray(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]%2==0){      // if num is divisible by 2 then 0
5                nums[i] = 0;       
6            }else{
7                nums[i] = 1;       // else 1
8            }
9        }
10        Arrays.sort(nums);        // sort after replacing values
11        return nums;             // return the array
12
13    }
14}