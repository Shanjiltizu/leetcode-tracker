// Last updated: 7/22/2026, 10:15:47 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int initialOnes = 0;
4        for (char c : s.toCharArray()) {
5            if (c == '1') {
6                initialOnes++;
7            }
8        }
9        String t = "1" + s + "1";
10        List<Integer> lengths = new ArrayList<>();
11        List<Character> types = new ArrayList<>();
12        int i = 0;
13        while (i < t.length()) {
14            char ch = t.charAt(i);
15            int start = i;
16            while (i < t.length() && t.charAt(i) == ch) {
17                i++;
18            }
19            lengths.add(i - start);
20            types.add(ch);
21        }
22        int maxDelta = 0;
23        for (int j = 1; j < lengths.size() - 1; j++) {
24            if (types.get(j) == '1' && types.get(j - 1) == '0' && types.get(j + 1) == '0') {
25                int delta = lengths.get(j - 1) + lengths.get(j + 1);
26                maxDelta = Math.max(maxDelta, delta);
27            }
28        }
29        return initialOnes + maxDelta;
30    }
31}