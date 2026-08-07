// Last updated: 8/7/2026, 1:56:46 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int current = n;
4        while (true) {
5            if (isDivisibleDigitProduct(current, t)) {
6                return current;
7            }
8            current++;
9        }
10    }
11    
12    private boolean isDivisibleDigitProduct(int num, int t) {
13        int product = 1;
14        int temp = num;
15        
16        while (temp > 0) {
17            int digit = temp % 10;
18            product *= digit;
19            temp /= 10;
20        }
21        
22        return product % t == 0;
23    }
24}