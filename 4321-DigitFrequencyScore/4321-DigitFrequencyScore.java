// Last updated: 01/09/2026, 13:54:25
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