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
        
         Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        List<List<Integer>> ans = new ArrayList<>();

        if(root==null)  return ans;

        boolean reverse = true;

        while(!q.isEmpty()){

            int size = q.size();
            LinkedList<Integer> temp = new LinkedList<>();

            for(int i=0; i<size; i++){

                TreeNode node = q.poll();
                
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);

                 if(reverse){
                    temp.addLast(node.val);
                }else{
                    temp.addFirst(node.val);
                }

            }
            reverse = !reverse;
            ans.add(temp);
        }

        return ans;
    }
}