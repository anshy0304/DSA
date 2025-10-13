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
    public void flatten(TreeNode root) {
        // if(root  == null) return;
        // if(root.left == null && root.right == null) return;
        // TreeNode lefttree = root.left;
        // TreeNode righttree = root.right;
        // root.left = null;
        // flatten(lefttree);
        // flatten(righttree);

        // root.right = lefttree;
        // TreeNode temp = lefttree;
        // while(temp!= null && temp.right!= null){
        //     temp = temp.right;
        // }   
        // if(temp!=null)temp.right = righttree;
        // else root.right  = righttree;
        // return;


        TreeNode curr = root;
        
        while(curr!=null) {
            
            if(curr.left != null) {
                TreeNode pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        
         }
}