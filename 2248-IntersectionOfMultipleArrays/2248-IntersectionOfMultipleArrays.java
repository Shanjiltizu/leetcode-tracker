// Last updated: 9/10/2026, 9:19:52 AM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001]; // given constraint

        // count frequency
        for (int[] arr : nums) {
            for (int n : arr) {
                count[n]++;
            }
        }

        List<Integer> result = new ArrayList<>();

        // check if present in all arrays
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == nums.length) {
                result.add(i);
            }
        }

        return result;
    }
}