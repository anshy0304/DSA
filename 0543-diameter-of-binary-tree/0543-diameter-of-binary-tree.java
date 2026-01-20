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
    public int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int lhdt = diameterOfBinaryTree(root.left);
        int lh = height(root.left);
        int rhdt = diameterOfBinaryTree(root.right);
        int rh = height(root.right);
        
        int selfDt = lh + rh;
        return Math.max(selfDt,Math.max(lhdt,rhdt));
    }
}