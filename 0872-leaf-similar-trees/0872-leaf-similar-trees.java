/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void helper(StringBuilder s,TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s.append(root.val);
            s.append('_');
            return;
        }
        helper(s,root.left);
        helper(s,root.right);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        helper(s1,root1);
        helper(s2,root2);
        return s1.toString().equals(s2.toString());
    }
}