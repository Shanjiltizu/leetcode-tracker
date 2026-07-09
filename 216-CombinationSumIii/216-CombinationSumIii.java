// Last updated: 09/07/2026, 09:51:09
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result,
                           List<Integer> temp,
                           int k,
                           int remaining,
                           int start) {
        
        if (temp.size() == k && remaining == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if (temp.size() > k || remaining < 0) {
            return;
        }
        
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            backtrack(result, temp, k, remaining - i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}