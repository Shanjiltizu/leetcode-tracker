// Last updated: 01/09/2026, 13:54:44
class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int initialOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                initialOnes++;
            }
        }
        String t = "1" + s + "1";
        List<Integer> lengths = new ArrayList<>();
        List<Character> types = new ArrayList<>();
        int i = 0;
        while (i < t.length()) {
            char ch = t.charAt(i);
            int start = i;
            while (i < t.length() && t.charAt(i) == ch) {
                i++;
            }
            lengths.add(i - start);
            types.add(ch);
        }
        int maxDelta = 0;
        for (int j = 1; j < lengths.size() - 1; j++) {
            if (types.get(j) == '1' && types.get(j - 1) == '0' && types.get(j + 1) == '0') {
                int delta = lengths.get(j - 1) + lengths.get(j + 1);
                maxDelta = Math.max(maxDelta, delta);
            }
        }
        return initialOnes + maxDelta;
    }
}