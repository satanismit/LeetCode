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
    public boolean isCousins(TreeNode root, int x, int y) {


        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            boolean foundX=false,foundY=false;
            int size=q.size();
            for(int i=0; i<size; i++){

                TreeNode node=q.poll();

                if(node.left!=null && node.right!=null){

            // check for same parents or not 
                    if((node.left.val==x && node.right.val==y) ||(node.left.val==y && node.right.val==x)){
                        return false;
                    }
                }

                if(node.left!=null){ q.add(node.left); }
                if(node.right!=null) {  q.add(node.right); }

                if (node.val == x) foundX = true;
                if (node.val == y) foundY = true;
            }

            //check the X and Y found or not 
            if(foundX && foundY) return true;
            if(foundX || foundY){
                return false;
            }


        }


        return false;
    }
}