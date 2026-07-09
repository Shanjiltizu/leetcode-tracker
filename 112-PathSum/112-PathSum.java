// Last updated: 09/07/2026, 09:51:45
/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curr = 0;
        return dfs(root, targetSum, curr);
    }

    public boolean dfs(TreeNode root, int target, int curr) {
        // current node work
        if(root == null) return false;

        curr += root.val;
        
        // at leaf node - target must equals to sum
        if(root.left == null && root.right == null) {
            if(target == curr) return true;
        }
        
        // recursion call
        boolean leftChild = dfs(root.left, target, curr);
        boolean rightChild = dfs(root.right, target, curr);

        // while returing back to caller
        if(leftChild == true || rightChild == true) return true;
        return false;
    }
}