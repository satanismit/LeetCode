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

    int postind;
    public TreeNode build(int[] inorder, int[] postorder, int st, int end){

        if(st>end)  return null;

        TreeNode root = new TreeNode(postorder[postind--]);


        int i=0; 
        for( i=st; i<inorder.length; i++){  //we can also start with 0

            if(root.val==inorder[i])  break;
        }
      
        root.right = build(inorder, postorder, i+1, end);
        root.left = build(inorder, postorder, st, i-1);

        return root;

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

          postind =postorder.length-1;

        return build(inorder, postorder, 0, inorder.length-1);
        
    }
}