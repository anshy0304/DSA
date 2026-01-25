/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> list = new LinkedList<>();
    List<TreeNode> list1 = new LinkedList<>();
    public boolean helper(TreeNode root,TreeNode p,List<TreeNode> path){
        if(root == null) return false;
        path.add(root);
        if(root == p){
            return true;
        }
        boolean left = helper(root.left,p,path);
        boolean right = helper(root.right,p,path);
        if(left || right) return true;
        path.remove(path.size()-1);
        return false;
        
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    
        helper(root,p,list);
        helper(root,q,list1);
        TreeNode lca = null;
        for(int i=0;i<list.size() && i<list1.size();i++){
            if(list.get(i) == list1.get(i)){
                lca = list.get(i);
            }
        }
       return lca;
    }
}