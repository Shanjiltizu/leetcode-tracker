// Last updated: 7/31/2026, 2:35:31 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    static void inorder(TreeNode root, ArrayList<Integer> al)
19    {
20        if(root==null) return;
21         inorder(root.left,al);
22         al.add(root.val);
23         inorder(root.right,al);
24    }
25
26    public List<Integer> inorderTraversal(TreeNode root) {
27        ArrayList <Integer> al = new ArrayList<>();
28        inorder(root,al);
29        return al;
30    }
31}