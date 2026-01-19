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

    public int check(TreeNode root){

        //check for null
        if(root==null)  return 0;

        //check for left 
        int left = check(root.left);
        if(left==-1) return -1;

        //check for right 
        int right = check(root.right);
        if(right==-1)  return -1;
        
        if(Math.abs(right-left)>1)  return -1;

        return 1+Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {

        if(check(root)==-1){
            return false;
        }

        return true;
        
    }
}