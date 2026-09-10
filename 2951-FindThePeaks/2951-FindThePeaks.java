// Last updated: 9/10/2026, 9:18:54 AM
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n = mountain.length;
        List<Integer> peak = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                peak.add(i);
            }
        }
        return peak;
    }
}