// Last updated: 9/10/2026, 9:20:40 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int index = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[index++] = count;
        }
        return arr;
    }
}