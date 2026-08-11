// Last updated: 8/11/2026, 2:32:42 PM
1class Solution {
2    public int missingInteger(int[] A) {
3        int sum = A[0];
4        boolean[] seen = new boolean[52];
5        boolean seq = true;
6
7        seen[A[0]] = true;
8
9        for (int i = 1; i < A.length; i++) {
10            if (seq && A[i] == A[i - 1] + 1)
11                sum += A[i];
12            else {
13                seq = false;
14                if (sum > 50)
15                    return sum;
16            }
17            seen[A[i]] = true;
18        }
19
20        for (int i = sum; i < 52; i++)
21            if (!seen[i])
22                return i;
23
24        return sum;
25    }
26}