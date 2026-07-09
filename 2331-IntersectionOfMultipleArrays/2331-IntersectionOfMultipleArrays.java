// Last updated: 09/07/2026, 09:49:29
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