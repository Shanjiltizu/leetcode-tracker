// Last updated: 09/07/2026, 09:50:11
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        
        int total = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int diff = timeSeries[i + 1] - timeSeries[i];
            
            total += Math.min(diff, duration);
        }
        
        // last attack always contributes full duration
        total += duration;
        
        return total;
    }
}