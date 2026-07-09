// Last updated: 09/07/2026, 09:49:33
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        if (num % 10 == 0) return false;
        return true;
    }
}