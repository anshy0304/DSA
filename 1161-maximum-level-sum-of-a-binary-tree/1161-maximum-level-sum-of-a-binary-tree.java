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
    

    public int maxLevelSum(TreeNode root) {
       if(root == null) return 0;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       int max = Integer.MIN_VALUE;
       int ansLevel = 1;
       int level = 1;
       while(!q.isEmpty()){
            int levelSum = 0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                levelSum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(levelSum > max) {
                max = levelSum;
                ansLevel = level;
            }
            level++;

       }
       return ansLevel;
    }
}