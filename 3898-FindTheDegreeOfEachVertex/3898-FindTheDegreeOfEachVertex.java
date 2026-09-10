// Last updated: 9/10/2026, 9:18:08 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int V = matrix.length;
        int[] degree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    degree[j]++;
                }
            }
        }
        return degree;
    }
}