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

    long max = 0; //global variable 

    public long getTotalSum(TreeNode root) {

    if (root == null) return 0;

    // Subtree sum = current node + left child's sum + right child's sum
    return root.val + getTotalSum(root.left) + getTotalSum(root.right);
   }

   public long  subTreeSum(TreeNode root, long total){

    //base 
    if(root==null) return 0;

    //post order traversal 
    long leftsum = subTreeSum(root.left, total);
    long rightsum = subTreeSum(root.right,total);

    long cursum = root.val+leftsum + rightsum;
    
    max = Math.max( cursum*(total-cursum), max);

    return cursum;
   }

    public int maxProduct(TreeNode root) {

      int sum = 0;

      long total_sum = getTotalSum(root);

      subTreeSum(root, total_sum);

      return (int) (max % 1000000007);

      

    }
}