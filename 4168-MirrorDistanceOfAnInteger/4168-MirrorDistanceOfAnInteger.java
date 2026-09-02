// Last updated: 9/2/2026, 10:18:41 AM
class Solution {
    static public int mirrorDistance(int n) {
        int rev=0;
        for(int x=n; x>0; x/=10){
            rev=10*rev+x%10;
        }
        return Math.abs(rev-n);
    }
}