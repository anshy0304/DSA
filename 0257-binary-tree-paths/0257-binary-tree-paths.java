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

    public void helper(TreeNode root,List<String> ans,StringBuilder path){
        if(root == null) return;
        int len = path.length();
        path.append(root.val); 
       if(root.left == null && root.right == null){
            ans.add(path.toString());
        } else {
            path.append("->");
            helper(root.left, ans, path);
            helper(root.right, ans, path);
        }
        path.setLength(len);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(root,ans,path);
        return ans;
    }
}