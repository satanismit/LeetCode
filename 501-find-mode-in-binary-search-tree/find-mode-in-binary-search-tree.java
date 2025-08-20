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

      private Integer curnum = null;
    private int curfre=0;
    private int maxfre=0;
    List<Integer> ans=new ArrayList<>();

    public void inorder(TreeNode root){

        if(root==null){
            return;
        }

        inorder(root.left);

       if (curnum!=null && curnum == root.val) {

            curfre++;
        } else {

            curnum = root.val;
            curfre = 1;
        }

        if (curfre > maxfre) {

            maxfre = curfre;
            ans.clear();
            ans.add(curnum);

        } else if (curfre == maxfre) {

            ans.add(curnum);
        }

        inorder(root.right);

    }
    public int[] findMode(TreeNode root) {
        
    inorder(root);

    int[] arr=ans.stream()
                 .mapToInt(Integer::intValue) // map Integer object to primitive types 
                 .toArray();                    //stream to array

    return arr;

    }
}