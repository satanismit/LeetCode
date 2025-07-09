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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> ans2=new ArrayList<>();
        if(root==null){
            return ans2;
        }

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0; i<size; i++){

                TreeNode node=q.poll();
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                temp.add(node.val);
            }
            ans.add(temp);
        }

        for(int i=ans.size()-1; i>=0; i--){
            ans2.add(ans.get(i));
        }
        return ans2;

    }
}