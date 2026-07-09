// Last updated: 09/07/2026, 09:53:41
class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
        
    }
}