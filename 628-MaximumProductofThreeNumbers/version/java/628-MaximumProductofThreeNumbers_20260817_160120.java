// Last updated: 17/08/2026, 16:01:20
1class Solution {
2    public int maximumProduct(int[] A) {
3        int a = -1001, b = a, c = b;
4        int x =  1001, y = x;
5
6        for (int n : A) {
7            int pa = a, pb = b, px = x;
8            
9            a = Math.max(a, n);
10            b = Math.max(b, Math.min(pa, n));
11            c = Math.max(c, Math.min(pb, n));
12            
13            x = Math.min(x, n);
14            y = Math.min(y, Math.max(px, n));
15        }
16
17        return Math.max(a * b * c, a * x * y);
18    }
19}