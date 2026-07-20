// Last updated: 20/07/2026, 10:06:02
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        
        k = k % totalElements;
        
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            result.add(row);
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % totalElements;
                
                int newRow = newIndex / n;
                int newCol = newIndex % n;
                
                result.get(newRow).set(newCol, grid[i][j]);
            }
        }
        
        return result;
    }
}