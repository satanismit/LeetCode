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

    public void inorder(List<Integer> list, TreeNode root){

        if(root==null)  return;

        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }

    public TreeNode build(List<Integer> list, int st, int end){

        if(st==end)  return null;

        int mid = st + (end-st)/2;

        TreeNode node = new TreeNode(list.get(mid));

        node.left = build(list, st, mid);
        node.right = build(list, mid+1, end);

        return node;

    }

    public TreeNode balanceBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        // we have inorder list
        inorder(list, root);

       
        return build(list, 0, list.size());

        
    }  
}