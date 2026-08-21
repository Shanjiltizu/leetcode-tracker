// Last updated: 8/21/2026, 11:13:40 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int V = matrix.length;
4        int[] degree = new int[V];
5        for (int i = 0; i < V; i++) {
6            for (int j = 0; j < matrix[i].length; j++) {
7                if (matrix[i][j] == 1) {
8                    degree[j]++;
9                }
10            }
11        }
12        return degree;
13    }
14}