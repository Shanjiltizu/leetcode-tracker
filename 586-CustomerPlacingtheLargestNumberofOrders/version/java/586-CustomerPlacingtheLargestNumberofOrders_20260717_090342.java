// Last updated: 7/17/2026, 9:03:42 AM
1import java.util.PriorityQueue;
2
3class Solution {
4    public int findKthLargest(int[] nums, int k) {
5        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
6        for (int num : nums) {
7            minHeap.add(num);
8            if (minHeap.size() > k) {
9                minHeap.poll();
10            }
11        }
12        return minHeap.peek();
13    }
14}