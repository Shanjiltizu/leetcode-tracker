// Last updated: 09/07/2026, 09:49:19
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}