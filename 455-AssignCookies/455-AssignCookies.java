// Last updated: 09/07/2026, 09:50:21
import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0; // children
        int j = 0; // cookies
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // child satisfied
            }
            j++; // move to next cookie
        }
        
        return i;
    }
}