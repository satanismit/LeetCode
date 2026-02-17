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
    
    int preind = 0;

    public TreeNode build(int[] preorder, int[] inorder, int st, int end){

        if(st>end)  return null;

        TreeNode root = new TreeNode(preorder[preind++]);

        int i=0;
        for(i=st; i<=inorder.length; i++){
            if(root.val==inorder[i])  break;
        }

        root.left = build(preorder, inorder, st, i-1);
        root.right = build(preorder, inorder,i+1, end);

        return root;

    }

    public TreeNode bstFromPreorder(int[] preorder) {

    int[] inorder = preorder.clone();

    Arrays.sort(inorder);

    return build(preorder, inorder, 0, inorder.length-1);




        
    }
}