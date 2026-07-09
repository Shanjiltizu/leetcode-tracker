// Last updated: 09/07/2026, 09:50:16
class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;
        
        // create mask like 1111... of same length
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        return num ^ mask;
    }
}