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
    public void helper(TreeNode root,List<String> ans,String temp){
        if(root == null) return;
        if(root.left == null && root.right == null){
            temp += root.val;
            ans.add(temp);
            return;
        }
        helper(root.left,ans,temp+root.val);
        helper(root.right,ans,temp+root.val);

    }

    public int sumNumbers(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        int sum = 0;
        for(String s:ans){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}