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
    long max = 0;
    public int totalSum(TreeNode root){
        if(root == null) return 0;
        int l = totalSum(root.left);
        int r = totalSum(root.right);
        return root.val + l + r;
    }
    public long helper(TreeNode root,int totalSum){
        if(root == null) return 0;
        long l = helper(root.left,totalSum);
        long r = helper(root.right,totalSum);
        long sum = root.val+l+r;
        long sub =totalSum-sum;
        max = Math.max(max,sub*sum);
        return sum;
    }
    public int maxProduct(TreeNode root) {
        if(root == null) return 0;
        int total = totalSum(root);
        helper(root,total);
        return (int)(max%1000000007);
    }
}