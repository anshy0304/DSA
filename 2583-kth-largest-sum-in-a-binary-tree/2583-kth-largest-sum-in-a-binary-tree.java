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
    
   
    
    public long kthLargestLevelSum(TreeNode root, int k) {
       if(root==null) return -1;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       
       List<Long> levelSums = new ArrayList<>();
       while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i =0;i<size;i++){
                TreeNode cn = q.poll();
                sum+=cn.val;
                if(cn.left != null) q.add(cn.left);
                if(cn.right != null) q.add(cn.right);

            }
            levelSums.add(sum);
       } 
       if(levelSums.size() < k){
            return -1;
       }
        Collections.sort(levelSums,Collections.reverseOrder());
        return levelSums.get(k-1);
    }
}