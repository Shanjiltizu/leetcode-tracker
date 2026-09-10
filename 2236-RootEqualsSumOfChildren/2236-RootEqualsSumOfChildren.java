// Last updated: 9/10/2026, 9:19:32 AM
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}