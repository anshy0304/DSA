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
    int ans = 0;
    public void inorder(TreeNode root,int low,int high){
        if(root == null) return;
        if(root.val >= low && root.val <= high){
            inorder(root.left,low,high);
            ans+=root.val;
            inorder(root.right,low,high);
        }
        else if(root.val > high){
            inorder(root.left,low,high);
        }
        else {
            inorder(root.right,low,high);
        }

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root,low,high);
        return ans;

    }
}