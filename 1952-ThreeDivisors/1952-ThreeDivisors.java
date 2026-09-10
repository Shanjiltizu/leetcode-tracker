// Last updated: 9/10/2026, 9:20:12 AM
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