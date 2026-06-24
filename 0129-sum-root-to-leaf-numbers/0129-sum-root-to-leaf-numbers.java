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
    public void helper(TreeNode root,StringBuilder temp){
        if(root == null) return;
        if(root.left == null && root.right == null){
            temp.append(root.val);
            sum += Integer.parseInt(temp.toString());
            return;
        }
        int len = temp.length();
        helper(root.left,temp.append(root.val));
        temp.setLength(len);
        helper(root.right,temp.append(root.val));
        temp.setLength(len);

    }

    public int sumNumbers(TreeNode root) {
        helper(root,new StringBuilder());
        
        return sum;
    }
}