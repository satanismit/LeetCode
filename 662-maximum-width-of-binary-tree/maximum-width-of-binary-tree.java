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

    class Pair{

        TreeNode node;
        int  i;

        Pair(TreeNode node, int i){
            this.node = node;
            this.i = i;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        Queue<Pair> q= new LinkedList<>();

        q.offer(new Pair(root, 1));

        int ans =0;

        while(!q.isEmpty()){

            int size = q.size();

            int firstind = 0, lastind = 0;

            for(int i=0; i<size; i++){
                
                //get ele 
                Pair ele = q.poll();
                TreeNode node = ele.node;
                int ind = ele.i;

                if(i==0)  firstind = ind;
                if(i==size-1) lastind = ind;

                if(node.left!=null){
                    q.offer(new Pair(node.left, ind*2));
                }

                if(node.right!=null){
                    q.offer(new Pair(node.right, (ind*2)+1));
                }


            }

            ans = Math.max(ans, lastind - firstind +1);


        }

        return ans;
        
    }
}