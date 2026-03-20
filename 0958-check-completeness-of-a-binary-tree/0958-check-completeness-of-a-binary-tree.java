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
    int count(TreeNode root){
        if(root == null) return 0;
        return 1+ count(root.left) + count(root.right);
    }

    boolean dfs(TreeNode root, int i,int  t){
        if(root == null) return true;
        if(i >= t) return false;
        return dfs(root.left,2*i+1,t) && dfs(root.right,2*i+2,t);
    }
    public boolean isCompleteTree(TreeNode root) {
       int t  = count(root);
       return dfs(root,0,t);
    }
}