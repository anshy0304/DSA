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
    public String helper(HashMap<String,Integer> map ,TreeNode root,List<TreeNode> res){
        if(root == null){
           return "N"; 
        }
        String s = String.valueOf(root.val)+","+helper(map,root.left,res) + "," + helper(map,root.right,res);
        if(map.containsKey(s) && map.get(s) == 1){
            res.add(root);
        }
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> map = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        helper(map,root,res);
        return res;
    }
}