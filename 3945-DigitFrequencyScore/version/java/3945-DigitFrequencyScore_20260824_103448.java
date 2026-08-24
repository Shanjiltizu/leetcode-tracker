// Last updated: 24/08/2026, 10:34:48
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int score = 0;
4        while(n>0){
5            score+= n%10;
6            n=n/10;
7        }
8        return score;
9        
10    }
11}