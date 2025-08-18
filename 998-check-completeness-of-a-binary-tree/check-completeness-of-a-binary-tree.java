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
    public boolean isCompleteTree(TreeNode root) {
        
        //BFS 

        Queue<TreeNode> q=new LinkedList<>();
        boolean past=false;

        q.add(root);

        while(!q.isEmpty()){

            TreeNode node = q.poll();

            if(node==null){
                past=true;
            }else{
                if(past==true){
                    return false;
                }

                 q.add(node.left);
                q.add(node.right);
            }

      

        }    
        return true;
    
     }
}