// Last updated: 8/7/2026, 3:43:28 PM
1class Solution {
2
3    private void subsets(int i, List<Integer> li, List<List<Integer>> list, int[] nums) {
4
5        if (i == nums.length) {
6            list.add(new ArrayList<>(li));
7            return;
8        }
9
10        li.add(nums[i]);
11        subsets(i + 1, li, list, nums);
12
13        li.remove(li.size() - 1);
14        subsets(i + 1, li, list, nums);
15    }
16
17    public List<List<Integer>> subsets(int[] nums) {
18
19        List<List<Integer>> list = new ArrayList<>();
20
21        subsets(0, new ArrayList<>(), list, nums);
22
23        return list;
24    }
25}