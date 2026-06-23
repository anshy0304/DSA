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
    public TreeNode helper(TreeNode root,int val,TreeNode parent,TreeNode temp){
        if(root == null){
            if(parent.val > val) {parent.left = new TreeNode(val); return temp;}
            else {parent.right = new TreeNode(val); return temp;}
        }
        if(root.val > val){
            return helper(root.left,val,root,temp);
        }
        else return helper(root.right,val,root,temp);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        return helper(root,val,new TreeNode(),root);
    }
}