// Last updated: 7/17/2026, 8:59:58 AM
import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];
        int[][] paired = new int[n][2];
        for (int i = 0; i < n; i++) {
            paired[i][0] = arr[i];
            paired[i][1] = i;
        }
        Arrays.sort(paired, (a, b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[n];
        int rank = 1;
        result[paired[0][1]] = rank; 
        
        for (int i = 1; i < n; i++) {
            
            if (paired[i][0] > paired[i - 1][0]) {
                rank++;
            }
            result[paired[i][1]] = rank;
        }
        return result;
    }
}