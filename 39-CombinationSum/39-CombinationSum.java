// Last updated: 09/07/2026, 09:53:01
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findcombination(0, candidates, list, target, ds);
        return list;
    }

    public static void findcombination(int i, int[] arr, List<List<Integer>> list, int target, List<Integer> ds) {
        if (i == arr.length) {
            if (target == 0) {
                list.add(new ArrayList<>(ds)); // store copy
            }
            return;
        }

        if (arr[i] <= target) {
            ds.add(arr[i]);
            findcombination(i, arr, list, target - arr[i], ds); // pick same element
            ds.remove(ds.size() - 1); // backtrack
        }
        findcombination(i + 1, arr, list, target, ds); // move to next element
    }
}