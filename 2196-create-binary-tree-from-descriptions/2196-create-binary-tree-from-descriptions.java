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

    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int[] d:descriptions){
            int p = d[0];
            int c = d[1];
            int l = d[2];
            map.putIfAbsent(p,new TreeNode(p));
            map.putIfAbsent(c,new TreeNode(c));
            if(l == 1) map.get(p).left = map.get(c);
            else map.get(p).right = map.get(c);
            set.add(c);
        }
        for(int[] d:descriptions){
            if(!set.contains(d[0])){
                return map.get(d[0]);
            }
        }
        return new TreeNode();
    }
}