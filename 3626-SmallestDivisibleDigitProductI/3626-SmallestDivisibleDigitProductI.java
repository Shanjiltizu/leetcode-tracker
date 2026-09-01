// Last updated: 01/09/2026, 13:54:52
class Solution {
    public int smallestNumber(int n, int t) {
        int current = n;
        while (true) {
            if (isDivisibleDigitProduct(current, t)) {
                return current;
            }
            current++;
        }
    }
    
    private boolean isDivisibleDigitProduct(int num, int t) {
        int product = 1;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        
        return product % t == 0;
    }
}