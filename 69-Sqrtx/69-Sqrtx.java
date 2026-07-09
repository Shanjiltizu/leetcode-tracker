// Last updated: 09/07/2026, 09:52:19
class Solution {
    public int mySqrt(int x) {
       if (x < 2) return x;  

        int i = 1;
        while ((long)i * i <= x) {
            i++;
        }

        return i - 1;
        
    }
}