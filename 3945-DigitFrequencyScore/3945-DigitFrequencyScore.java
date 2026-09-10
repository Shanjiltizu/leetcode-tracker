// Last updated: 9/10/2026, 9:18:09 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;
        while(n>0){
            score+= n%10;
            n=n/10;
        }
        return score;
        
    }
}