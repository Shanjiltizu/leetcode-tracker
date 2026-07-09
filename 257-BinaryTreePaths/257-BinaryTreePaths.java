// Last updated: 09/07/2026, 09:50:56
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, new StringBuilder(), result);
        return result;
    }
    
    private void dfs(TreeNode node, StringBuilder path, List<String> result) {
        if (node == null) return;
        
        int len = path.length();
        path.append(node.val);
        
        if (node.left == null && node.right == null) {
            result.add(path.toString());
        } else {
            path.append("->");
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
        
        path.setLength(len); // backtrack
    }
}