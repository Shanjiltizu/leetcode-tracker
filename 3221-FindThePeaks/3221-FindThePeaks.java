// Last updated: 09/07/2026, 09:49:06
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