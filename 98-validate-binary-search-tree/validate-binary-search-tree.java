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

    public void helper(TreeNode root,List<Integer> ans){

        if(root==null){
            return;
        }

        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right,ans);

    }
    public boolean isValidBST(TreeNode root) {
        
       //inorder traversal
       List<Integer> ans=new ArrayList<>();

       helper(root,ans);

       for(int i=0; i<ans.size()-1; i++){

        if(ans.get(i)>=ans.get(i+1)){
            return false;
        }
       }

    return true;
       


       
       
    }
}