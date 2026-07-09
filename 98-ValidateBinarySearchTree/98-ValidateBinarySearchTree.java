// Last updated: 09/07/2026, 09:51:57
class Solution {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (prev != null && root.val <= prev.val) return false;
        prev = root;

        return isValidBST(root.right);
    }
}