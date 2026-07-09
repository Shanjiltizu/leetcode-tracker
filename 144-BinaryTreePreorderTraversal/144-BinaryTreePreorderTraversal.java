// Last updated: 09/07/2026, 09:51:34
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);     // Root
        helper(node.left, result); // Left
        helper(node.right, result); // Right
    }
}