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

    public TreeNode delete(TreeNode root,HashSet<Integer> set,List<TreeNode> ans,int[] d){
        if(root == null) return null;
        root.left = delete(root.left,set,ans,d);
        root.right = delete(root.right,set,ans,d);
        if(set.contains(root.val)){
            if(root.left != null){
                ans.add(root.left);
            }if(root.right != null) ans.add(root.right);
            return null;
        }else return root;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] d) {
        List<TreeNode> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x:d) set.add(x);
        delete(root,set,ans,d);
        if(!set.contains(root.val)) ans.add(root);
        return ans;
    }
}