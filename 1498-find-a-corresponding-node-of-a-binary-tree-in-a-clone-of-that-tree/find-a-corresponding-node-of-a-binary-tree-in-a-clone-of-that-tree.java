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
    TreeNode res=new TreeNode(0);
    public void helper(TreeNode original,TreeNode cloned, TreeNode target){

         if(original==null){
            return;
        }

        if(original==target){
            res=cloned;
            return;
        }

       

        helper(original.left,cloned.left,target);
        helper(original.right,cloned.right,target);

    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        helper(original,cloned,target);
        return res;

        

    }
}