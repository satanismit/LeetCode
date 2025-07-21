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
    public int postind=0;
    public TreeNode solve(int[] inorder, int[] postorder,int st, int end){

        if(st>end){  return null;}

        int rootval=postorder[postind];

        int i=st;
        for (; i<end; i++){

            if(inorder[i]==rootval){
                break;
            }
        }

        postind--;
        TreeNode root=new TreeNode(rootval);
        root.right=solve(inorder, postorder,i+1,end);
        root.left=solve(inorder, postorder,st,i-1);
     

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n=postorder.length;
        postind = n-1;
        return solve(inorder,postorder,0,n-1);
    }
}