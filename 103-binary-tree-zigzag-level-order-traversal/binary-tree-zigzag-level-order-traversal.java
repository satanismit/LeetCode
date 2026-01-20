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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        boolean reverse= false;
        List<List<Integer>> res = new ArrayList<>();

        while(!q.isEmpty()){

           int len = q.size();
           List<Integer> temp = new LinkedList<>();

           for(int i=0; i<len; i++){

              TreeNode node = q.poll();
              
                if(reverse==true)  temp.addFirst(node.val);
                else   temp.addLast(node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
             

              }

            res.add(temp);
           reverse = !reverse;
  
           }

           return res;
        }

       

}