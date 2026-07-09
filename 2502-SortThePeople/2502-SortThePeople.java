// Last updated: 09/07/2026, 09:49:11
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        // simple sorting (bubble sort style)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[i] < heights[j]) {
                    // swap heights
                    int tempH = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempH;

                    // swap names
                    String tempN = names[i];
                    names[i] = names[j];
                    names[j] = tempN;
                }
            }
        }

        return names;
    }
}