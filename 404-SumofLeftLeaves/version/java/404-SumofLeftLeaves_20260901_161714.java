// Last updated: 01/09/2026, 16:17:14
1class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3        return dfs(root, false);
4    }
5    
6    private int dfs(TreeNode node, boolean isLeft) {
7        if (node == null) {
8            return 0;
9        }
10        if (node.left == null && node.right == null) { // Leaf node
11            return isLeft ? node.val : 0;
12        }
13        int leftSum = dfs(node.left, true);   // Traverse left child
14        int rightSum = dfs(node.right, false); // Traverse right child
15        return leftSum + rightSum;
16    }
17}