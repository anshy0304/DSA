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
    int sum = 0;
    public void helper(TreeNode root,String temp){
        if(root == null) return;
        if(root.left == null && root.right == null){
            temp += root.val;
            sum += Integer.parseInt(temp);
            return;
        }
        helper(root.left,temp+root.val);
        helper(root.right,temp+root.val);

    }

    public int sumNumbers(TreeNode root) {
        helper(root,"");
        
        return sum;
    }
}