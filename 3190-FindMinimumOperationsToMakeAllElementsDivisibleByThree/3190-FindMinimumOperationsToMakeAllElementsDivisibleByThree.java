// Last updated: 9/10/2026, 9:18:37 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(i%3!=0)
            {
                c++;
            }
        }
        return c;
    }
}