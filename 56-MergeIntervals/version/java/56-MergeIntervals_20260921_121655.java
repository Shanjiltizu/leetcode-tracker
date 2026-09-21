// Last updated: 9/21/2026, 12:16:55 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> merged = new ArrayList<>();
6        int[] prev = intervals[0];
7
8        for (int i = 1; i < intervals.length; i++) {
9            if (intervals[i][0] <= prev[1]) {
10                prev[1] = Math.max(prev[1], intervals[i][1]);
11            } else {
12                merged.add(prev);
13                prev = intervals[i];
14            }
15        }
16        merged.add(prev); 
17        return merged.toArray(new int[merged.size()][]);
18    }
19}