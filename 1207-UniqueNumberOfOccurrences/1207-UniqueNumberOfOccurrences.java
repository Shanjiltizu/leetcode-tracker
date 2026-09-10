// Last updated: 9/10/2026, 9:21:01 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 
        Set<Integer> set = new HashSet<>();
        for (int count : map.values()) {
            if (set.contains(count)) {   
                return false;
            }
            set.add(count);              
        }
        return true;
    }
}