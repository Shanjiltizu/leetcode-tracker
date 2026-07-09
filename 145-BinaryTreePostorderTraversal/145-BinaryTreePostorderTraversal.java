// Last updated: 09/07/2026, 09:51:33
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        helper(node.left, result);   // Left
        helper(node.right, result);  // Right
        result.add(node.val);        // Root
    }
}