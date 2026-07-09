// Last updated: 09/07/2026, 09:49:37
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);

        // check perfect square
        if (root * root != n) return false;

        // check if root is prime
        for (int i = 2; i < root; i++) {
            if (root % i == 0) return false;
        }

        return root > 1;
    }
}